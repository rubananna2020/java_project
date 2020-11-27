package Utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestContext ;
import org.testng.ITestResult ;

public class Event_Listeners extends commonOps implements ITestListener
{
    public void onStart(ITestContext execution)
    {
        System.out.println("------- Starting execution -----------");
    }

    public void onFinish(ITestContext execution)
    {
        System.out.println("-------execution Finished-----------");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult test)
    {
        System.out.println("-------Test_FailedButWithinSuccessPercentage:"+ test.getName()+" -----------");
    }

    public void onTestSkipped(ITestResult test)
    {
        System.out.println("------- Skipped Test:"+test.getName()+" -----------");
    }

    public void onTestStart(ITestResult test)
    {
        System.out.println("------- Starting Test:"+test.getName()+" -----------");
    }

    public void onTestSuccess(ITestResult test)
    {
        System.out.println("------- Success Test:"+test.getName()+" -----------");
    }

    public void onTestFailure(ITestResult test)
    {
        System.out.println("------- Test Failed:"+test.getName()+" -----------");
        if (!Platform.equalsIgnoreCase("api"))
        saveScreenShot();
    }

    @Attachment (value = "Page Screen-Shot", type="image/png")
    public byte[] saveScreenShot()
    {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}

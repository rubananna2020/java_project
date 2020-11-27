package SanityTests;

import Extensions.verification;
import Utilities.commonOps;
import WorkFlows.apiFlows;
import WorkFlows.calcFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Event_Listeners.class)
public class calculatorDesktop extends commonOps

{
    @Test(description = "Test01: Get Calculator Result")
    @Description("Test Description: open calculator desktop app and make calculation")
    public void test01_CalcResult() throws InterruptedException
    {
        calcFlows.getCalcResults();

        verification.textInElement(calculatorMain.field_CalculatorResults,"19");
    }
}

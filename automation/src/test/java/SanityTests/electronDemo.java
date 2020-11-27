package SanityTests;

import Extensions.verification;
import Utilities.commonOps;
import WorkFlows.ElectronFlows;
import WorkFlows.apiFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Event_Listeners.class)
public class electronDemo extends commonOps
{
    @Test(description = "Test01: Verify Screen Resolution")
    @Description("Test Description: Getting the Resolution from App and verify it")
    public void test01_GetResolution() throws InterruptedException
    {
        ElectronFlows.getScreenInfo();

        verification.textInElement(electronMain.field_screenInfo,"Your screen is: 1280px x 720px");
    }
}

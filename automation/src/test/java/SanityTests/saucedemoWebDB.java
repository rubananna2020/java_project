package SanityTests;


import Extensions.verification;
import Utilities.commonOps;
import WorkFlows.WebFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Event_Listeners.class)

public class saucedemoWebDB extends commonOps
{
    @Test(description = "Test01: Login to saucedemo with DB")
    @Description("Test Description: Login to saucedemo web application with use & pass from DB")
    public void test01_login() throws InterruptedException
    {
        WebFlows.loginDB();
        verification.textInElement(saucedemoHeader.txt_mainHeader,"Products");
    }
}

package SanityTests;

import Extensions.verification;
import Utilities.commonOps;
import WorkFlows.MobileFlow;
import WorkFlows.WebFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Event_Listeners.class)
public class mortgageMobile extends commonOps
{
    @Test(description = "Verify Mortgage")
    @Description("Test Description: Fill in Mortgage fields & calc repayment")
    public void test01_verifyRepayments() throws InterruptedException
    {
        MobileFlow.mortgageCalc("10000", "7", "3.5");
        verification.textInElement(ukMortgageCalc.txt_repayment, "£136.29");
    }
}

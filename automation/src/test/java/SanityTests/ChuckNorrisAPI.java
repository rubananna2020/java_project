package SanityTests;

import Extensions.verification;
import Utilities.commonOps;
import WorkFlows.WebFlows;
import WorkFlows.apiFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Event_Listeners.class)
public class ChuckNorrisAPI extends commonOps
{
//    @Test(description = "Test01: Get jokes List from web")
//    @Description("Test Description: open web and get jokes list")
//    public void test01_GetList() throws InterruptedException
//    {
//        verification.jokesNum(apiFlows.getJokesProperty("result.value"),21);
//    }
}

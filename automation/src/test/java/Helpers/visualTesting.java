package Helpers;

import Utilities.commonOps;
import Utilities.helperMethods;
import WorkFlows.WebFlows;
import org.testng.annotations.Test;

public class visualTesting extends commonOps

{
    @Test
    public void creatScreenShot() throws InterruptedException
    {
        WebFlows.login("standard_user","secret_sauce");
        Thread.sleep(1000);
        helperMethods.takeElementScreenShot(saucedemoRobotLogo.img_footerRobot,"saucedemoRobotLogo_ver4");
    }

}

package SanityTests;
import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import WorkFlows.WebFlows;
import Extensions.verification;

@Listeners(Utilities.Event_Listeners.class)
public class saucedemoWeb extends commonOps
{
    @Test(description = "Test01: Login to saucedemo")
    @Description("Test Description: Login to saucedemo web application")
    public void test01_login() throws InterruptedException
    {
        WebFlows.login(getData("user"),getData("password"));
        verification.textInElement(saucedemoHeader.txt_mainHeader,"Products");
    }

    @Test(description = "Test02: Inventory first Item Price")
    @Description("Test Description: Sort the items and verify first Item Price")
    public void test02_DropDownSort()
    {
        uiActions.updateDropDown(saucedemoSortMenu.btn_productSort,"Price (low to high)");

        verification.textInElement(saucedemoinventoryItem.txt_item01Price,"$7.99");
    }

    @Test(description = "Test03: Shopping cart Item Inventory")
    @Description("Test Description: adding items to Shopping and verify the items number")
    public void test03_Shopping_cart() throws InterruptedException
    {
        WebFlows.addToCart();
        verification.testCartInventory(saucedemoshopingCart.txt_NumCartItems.size(),3);
    }

    @Test(description = "Test04: Verify saucedemo Logo")
    @Description("Test Description: taking two sreenshots and verify that they are the same")
    public void test04_verifyLogo()
    {
        verification.visualElement(saucedemoRobotLogo.img_footerRobot,"saucedemoRobotLogo_ver4");
    }
}

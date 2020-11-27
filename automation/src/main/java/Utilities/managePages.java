package Utilities;

import PageObjects.saucedemo.inventoryItemsPage;
import PageObjects.saucedemo.logoImagePage;
import PageObjects.saucedemo.shopingCartPage;
import PageObjects.saucedemo.sortMenuPage;
import org.openqa.selenium.support.PageFactory;

public class managePages extends Base
{
    public static void init()
    {
        //web
        saucedemoLogin= PageFactory.initElements(driver,PageObjects.saucedemo.loginPage.class);
        saucedemoHeader= PageFactory.initElements(driver,PageObjects.saucedemo.inventoryPage.class);
        saucedemoSortMenu= PageFactory.initElements(driver, PageObjects.saucedemo.sortMenuPage.class);
        saucedemoinventoryItem=PageFactory.initElements(driver, PageObjects.saucedemo.inventoryItemsPage.class);
        saucedemoshopingCart=PageFactory.initElements(driver, PageObjects.saucedemo.shopingCartPage.class);
        saucedemoRobotLogo=PageFactory.initElements(driver, PageObjects.saucedemo.logoImagePage.class);
        //mobile
        ukMortgageCalc=PageFactory.initElements(driver,PageObjects.mobile.mainPage.class);
        //Electron
        electronMain=PageFactory.initElements(driver,PageObjects.ElectronDemo.mainPage.class);
        //calculator
        calculatorMain=PageFactory.initElements(driver,PageObjects.Calculator.mainPage.class);
    }
}

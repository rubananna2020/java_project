package Utilities;

import PageObjects.saucedemo.inventoryItemsPage;
import PageObjects.saucedemo.logoImagePage;
import PageObjects.saucedemo.shopingCartPage;
import PageObjects.saucedemo.sortMenuPage;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base
{
    //WebDriver
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    //AShot
    public static Screenshot imageScreenShot;
    public static ImageDiffer imgDiff;
    public static ImageDiff diff;

    //Mobile
    public static DesiredCapabilities dc=new DesiredCapabilities();

    //Platform
    public static String Platform;


    //web
    public static PageObjects.saucedemo.loginPage saucedemoLogin;
    public static PageObjects.saucedemo.inventoryPage saucedemoHeader;
    public static sortMenuPage saucedemoSortMenu;
    public static inventoryItemsPage saucedemoinventoryItem;
    public static shopingCartPage saucedemoshopingCart;
    public static logoImagePage saucedemoRobotLogo;

    //Mobile
    public static PageObjects.mobile.mainPage ukMortgageCalc;

    //Rest API
    public static RequestSpecification httpRequest;
    public static Response response;
    public static JSONObject requestParams=new JSONObject();
    public static JsonPath jp;

    //Electron
    public static PageObjects.ElectronDemo.mainPage electronMain;

    //Calculator
    public static PageObjects.Calculator.mainPage calculatorMain;

    //SQL
    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;

}

package PageObjects.saucedemo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class inventoryPage
{
    @FindBy (how= How.CLASS_NAME, using = "product_label")
    public WebElement txt_mainHeader;
}

package PageObjects.saucedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class inventoryItemsPage
{
    @FindBy(how = How.XPATH, using = "//*[@class='inventory_list']/div[1]//*[@class='inventory_item_price']")
    public WebElement txt_item01Price;

    @FindBy(how = How.XPATH, using = "//*[@class='inventory_list']/div[1]//*[@class='btn_primary btn_inventory']")
    public WebElement btn_item01button;

    @FindBy(how = How.XPATH, using = "//*[@class='inventory_list']/div[2]//*[@class='btn_primary btn_inventory']")
    public WebElement btn_item02button;

    @FindBy(how = How.XPATH, using = "//*[@class='inventory_list']/div[3]//*[@class='btn_primary btn_inventory']")
    public WebElement btn_item03button;

    @FindBy(how = How.ID, using = "shopping_cart_container")
    public WebElement txt_shopping_cart;

}

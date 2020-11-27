package PageObjects.saucedemo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class shopingCartPage
{
    @FindBy(how = How.XPATH, using = "//div[@class='cart_item']")
    public List <WebElement> txt_NumCartItems;
}

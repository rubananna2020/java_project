package PageObjects.saucedemo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class sortMenuPage
{
  @FindBy (how = How.CLASS_NAME, using = "product_sort_container")
    public WebElement btn_productSort;
}

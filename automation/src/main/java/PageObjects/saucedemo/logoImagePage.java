package PageObjects.saucedemo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class logoImagePage
{
//    @FindBy(how = How.CSS, using = "img[src='img/SwagBot_Footer_graphic.png']")
    @FindBy(how = How.CLASS_NAME, using = "peek")
    public WebElement img_footerRobot;

}
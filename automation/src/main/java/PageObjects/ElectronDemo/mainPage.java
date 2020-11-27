package PageObjects.ElectronDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage
{
    @FindBy(how= How.ID, using = "button-app-sys-information")
    public WebElement btn_sysInfor;

    @FindBy(how= How.ID, using = "screen-info-demo-toggle")
    public WebElement btn_screenInfo;

    @FindBy(how= How.ID, using = "screen-info")
    public WebElement btn_viewDemo;

    @FindBy(how= How.ID, using = "got-screen-info")
    public WebElement field_screenInfo;

}

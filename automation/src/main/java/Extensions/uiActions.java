package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class uiActions extends commonOps
{
    @Step("Click on element")
    public static void click(WebElement elem)
    {
        if(!Platform.equalsIgnoreCase("mobile")&& !Platform.equalsIgnoreCase("electron")&& !Platform.equalsIgnoreCase("desktop"))
        {
            wait.until(ExpectedConditions.elementToBeClickable(elem));
        }
        elem.click();
    }

    @Step("Send text to Text-field")
    public static void updateText(WebElement elem,String value)
    {
        if(!Platform.equalsIgnoreCase("mobile"))
        {
            wait.until(ExpectedConditions.visibilityOf(elem));
        }

        elem.sendKeys(value);
    }

    @Step("Update DropDown-field")
    public static void updateDropDown(WebElement elem,String value)
    {
        if(!Platform.equalsIgnoreCase("mobile"))
        {
            wait.until(ExpectedConditions.visibilityOf(elem));
        }

        Select mySort = new Select(elem);
        mySort.selectByVisibleText(value);
    }
}

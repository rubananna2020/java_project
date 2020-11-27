package PageObjects.Calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage
{
    @FindBy(how= How.XPATH, using = "//*[@AutomationId='clearButton']")
    public WebElement btn_clearButton;

    @FindBy(how= How.XPATH, using = "//*[@AutomationId='multiplyButton']")
    public WebElement btn_multiplyButton;

    @FindBy(how= How.XPATH, using = "//*[@AutomationId='plusButton']")
    public WebElement btn_plusButton;

    @FindBy(how= How.XPATH, using = "//*[@AutomationId='equalButton']")
    public WebElement btn_equalButton;

    @FindBy(how= How.XPATH, using = "//*[@AutomationId='CalculatorResults']")
    public WebElement field_CalculatorResults;

    @FindBy(how= How.XPATH, using = "//*[@AutomationId='num2Button']")
    public WebElement txt_num2Button;

    @FindBy(how= How.XPATH, using = "//*[@AutomationId='num8Button']")
    public WebElement txt_num8Button;

    @FindBy(how= How.XPATH, using = "//*[@AutomationId='num3Button']")
    public WebElement txt_num3Button;




}

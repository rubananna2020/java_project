package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class calcFlows extends commonOps

{
    @Step("actions on Calculator")
    public static void getCalcResults()
    {
        uiActions.click(calculatorMain.btn_clearButton);
        uiActions.click(calculatorMain.txt_num2Button);
        uiActions.click(calculatorMain.btn_multiplyButton);
        uiActions.click(calculatorMain.txt_num8Button);
        uiActions.click(calculatorMain.btn_plusButton);
        uiActions.click(calculatorMain.txt_num3Button);
        uiActions.click(calculatorMain.btn_equalButton);
    }
}

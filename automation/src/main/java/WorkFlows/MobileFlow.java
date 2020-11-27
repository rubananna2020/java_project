package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class MobileFlow extends commonOps
{
    @Step("Fill in form & calculate Mortgage")
    public static void mortgageCalc(String loan, String term, String rate)
    {
        uiActions.updateText(ukMortgageCalc.txt_amount, loan);
        uiActions.updateText(ukMortgageCalc.txt_term, term);
        uiActions.updateText(ukMortgageCalc.txt_rate, rate);
        uiActions.click(ukMortgageCalc.btn_calc);
    }
}

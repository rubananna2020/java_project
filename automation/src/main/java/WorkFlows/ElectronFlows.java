package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class ElectronFlows extends commonOps
{
    @Step("Get screen Resolution Info")
    public static void getScreenInfo()
    {
        uiActions.click(electronMain.btn_sysInfor);
        uiActions.click(electronMain.btn_screenInfo);
        uiActions.click(electronMain.btn_screenInfo);
        uiActions.click(electronMain.btn_viewDemo);
        uiActions.click(electronMain.btn_sysInfor);
    }
}

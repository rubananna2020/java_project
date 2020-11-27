package WorkFlows;
import Extensions.dbActions;
import Utilities.commonOps;
import Extensions.uiActions;
import io.qameta.allure.Step;

import java.util.List;

public class WebFlows extends commonOps
{
    @Step ("Login saucedemo flow ")
    public static void login(String user, String pass)
    {
        uiActions.updateText(saucedemoLogin.txt_userName, user);
        uiActions.updateText(saucedemoLogin.txt_password, pass);
        uiActions.click(saucedemoLogin.btn_login);
    }

    @Step ("Login saucedemo flow with DB Credentials ")
    public static void loginDB()
    {
       List<String> cred= dbActions.getCredentials("SELECT user_name, password FROM Credentials WHERE id='3'");
        uiActions.updateText(saucedemoLogin.txt_userName, cred.get(0));
        uiActions.updateText(saucedemoLogin.txt_password, cred.get(1));
        uiActions.click(saucedemoLogin.btn_login);
    }

    @Step ("Add items to Shopping Cart ")
    public static void addToCart()
    {
        uiActions.click(saucedemoinventoryItem.btn_item01button);
        uiActions.click(saucedemoinventoryItem.btn_item02button);
        uiActions.click(saucedemoinventoryItem.btn_item03button);
        uiActions.click(saucedemoinventoryItem.txt_shopping_cart);
    }
}

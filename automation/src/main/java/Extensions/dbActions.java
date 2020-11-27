package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class dbActions extends commonOps
{
    @Step("Get Credentials from DB table")
    public static List<String> getCredentials(String query)
    {
        List<String> credentials= new ArrayList<String>();
        try {
            rs=stmt.executeQuery(query);
            rs.next();
            credentials.add(rs.getString(1)); //user
            credentials.add(rs.getString(2)); //password

        } catch (SQLException e) {
            System.out.println("Error while printing table Data, see details: "+e);
        }
        return credentials;
    }

}

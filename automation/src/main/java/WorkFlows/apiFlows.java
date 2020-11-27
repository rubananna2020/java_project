package WorkFlows;

import Extensions.apiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import java.util.List;

public class apiFlows extends commonOps
{
//    @Step("Extract Steven Seagal jokes List")
//    public static List<String> getJokesProperty(String jPath)
//    {
//        Response response= apiActions.get("/jokes/search?query=Steven");
//        return apiActions.extractFromJSON(response,jPath);
//    }

    @Step("Extract Student List")
    public static List<String> getStudentsProperty(String jPath)
    {
        Response response= apiActions.get("/student/list");
        return apiActions.extractFromJSON(response,jPath);
    }

    @Step("Extract Student List")
    public static String getStudentsRecord(String jPath)
    {
        Response response= apiActions.get("/student/list");
        return apiActions.extractRecordFromJSON(response,jPath);
    }

    @Step("Creat new Student record")
    public static void postStudent(String firstName, String lastName, String email, String programme )
    {
        requestParams.put("firstName", firstName);
        requestParams.put("lastName", lastName);
        requestParams.put("email", email);
        requestParams.put("programme", programme);
        apiActions.post(requestParams,"/student/");

    }

    @Step("Update Student record")
    public static void updateStudent(String firstName, String lastName, String email, String programme, String id )
    {
        requestParams.put("firstName", firstName);
        requestParams.put("lastName", lastName);
        requestParams.put("email", email);
        requestParams.put("programme", programme);
        apiActions.put(requestParams,"/student/"+id);

    }

    @Step("Delete Student record")
    public static void deleteStudent(String id )
    {
        apiActions.delete(id);
    }
}



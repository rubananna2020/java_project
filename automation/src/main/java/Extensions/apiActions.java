package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import java.util.List;

public class apiActions extends commonOps
{

    @Step("Get Data from StudentsList Server")
    public static Response get(String paramValues)
    {
        response=httpRequest.get(paramValues);
        return response;
    }



    @Step("Extract Value from Json Format")
    public static List<String> extractFromJSON(Response response, String path)
    {
        jp=response.jsonPath();
        List<String> names=jp.getList(path);
        return names;

    }

    @Step("Extract Text from Json Format")
    public static String extractRecordFromJSON(Response response, String path)
    {
        jp=response.jsonPath();
        return jp.get(path).toString();
    }

    @Step("Post Data to StudentsList Server")
    public static void post(JSONObject params, String resourse)
    {
        httpRequest.header("Content-Type","application/json");
        httpRequest.body(params.toJSONString());
        response=httpRequest.post(resourse);
        System.out.println("response:"+response.prettyPrint());

    }


    @Step("Update Data in StudentsList Server")
    public static void put(JSONObject params, String resourse)
    {
        httpRequest.header("Content-Type","application/json");
        httpRequest.body(params.toJSONString());
        response=httpRequest.put(resourse);
        System.out.println("response:"+response.prettyPrint());

    }

    @Step("Update Data in StudentsList Server")
    public static void delete(String id)
    {
        response=httpRequest.delete("/student/"+id);
        System.out.println("response:"+response.prettyPrint());
    }
}

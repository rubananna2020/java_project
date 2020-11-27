package Helpers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class temp
{
    String url="https://api.chucknorris.io/";
    RequestSpecification httpRequest;
    Response response;

    @Test
    public void testing()
    {
        RestAssured.baseURI=url;
        httpRequest=RestAssured.given();
        response=httpRequest.get("/jokes/search?query=Steven");
        //System.out.println(response.prettyPrint());
    }
}

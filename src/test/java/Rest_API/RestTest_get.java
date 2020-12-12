package Rest_API;
import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
public class RestTest_get {


    @Test
    public void test1_put(){

        JSONObject request = new JSONObject();
        request.put("firstName","Raghav");
        request.put("lastName","Pal");
        request.put("SubjectId",1);
        baseURI = "http://localhost:3000/";
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("Content-Type","application/json")
                .body(request.toJSONString())
                .when().post("/users")
                .then()
                .statusCode(201)
                .log()
                .all();



    }

}//end of the java class

package Rest_API;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;

public class Tests_post {
    @Test
    public void test_1_post(){
        //process_01: we can create json file either using map

        Map<String , Object> map = new HashMap<String, Object>();
        map.put("name","Raghav");
        map.put("job","Teacher");
        System.out.println(map);

        //Process_02: we can create json file by using json object
        JSONObject request = new JSONObject(map);
        System.out.println(request);

        request.put("jb","teacher");
        System.out.println(request.toJSONString());
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201);

    }
}

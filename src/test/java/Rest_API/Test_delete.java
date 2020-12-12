package Rest_API;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test_delete {
    @Test
    public void test_3_delete(){

                given()
                .delete("https://reqres.in/api/users/2")
                .then()
                .statusCode(204).log().all();

    }
}

package start.helper;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class HTTPMethods {

    public static ValidatableResponse get(String urlPath) {
        ValidatableResponse response = given().
                when().
                get(urlPath).
                then();
        return response;
    }




}

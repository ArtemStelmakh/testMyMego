package start.spec;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {

    public static RequestSpecification requestSpec(){
        return new RequestSpecBuilder()
                .setBaseUri(RestAssured.baseURI)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .addFilter(new AllureRestAssured())
                .build();
    }

    public static ResponseSpecification responseSpec(){
        return new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .build();
    }

    public static ResponseSpecification responseSpecOK200(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }


    public static void installSpecification(RequestSpecification requestSpec, ResponseSpecification responseSpec){
        RestAssured.requestSpecification = requestSpec;
        RestAssured.responseSpecification = responseSpec;
    }

}

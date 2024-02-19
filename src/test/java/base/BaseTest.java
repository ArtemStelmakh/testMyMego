package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import start.readProperties.ReadConfig;
import start.spec.Specifications;

public class BaseTest {
    @BeforeClass
    public void baseTest() {
        RestAssured.baseURI = ReadConfig.readProperties("api_url");
    }
}

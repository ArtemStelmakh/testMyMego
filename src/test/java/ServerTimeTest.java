import base.BaseTest;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import start.spec.Specifications;
import steps.ServerTimeSteps;


public class ServerTimeTest extends BaseTest {

    @DataProvider(name = "url data", parallel=true)
    public static Object[][] listUrl() {
        return new Object[][] {
                {"0.ua.pool.ntp.org"},
                {"1.ua.pool.ntp.org"},
                {"2.ua.pool.ntp.org"},
                {"3.ua.pool.ntp.org"},
                {"4.ua.pool.ntp.org"}
        };
    }

    @Test(dataProvider = "url data")
    public void verifyGeolocation(String url){
        ServerTimeSteps serverTimeSteps = new ServerTimeSteps();
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpecOK200());
        String country = "Ukraine";
        ValidatableResponse response = serverTimeSteps.heCallsEndpointGeolocation(url);
        serverTimeSteps.verifyGeolocationIsCorrect(response, country);
    }

}

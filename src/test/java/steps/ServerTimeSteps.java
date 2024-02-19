package steps;

import start.config.ApiPath;
import start.helper.HTTPMethods;
import start.imp.GeolocationImp;
import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;

import static org.testng.Assert.assertTrue;

public class ServerTimeSteps {

    @Step("Call request Geolocation")
    public ValidatableResponse heCallsEndpointGeolocation(String url){
        return HTTPMethods.get(ApiPath.GET_GEOLOCATION + url);
    }

    @Step("Verify Geolocation")
    public void verifyGeolocationIsCorrect(ValidatableResponse response, String country){
        GeolocationImp geolocationImp = new GeolocationImp();
        String getCountry = geolocationImp.getCountry(response);
        assertTrue(getCountry.equals(country), String.format("Country is not equals %s", country));
    }
}

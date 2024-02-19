package start.service;

import io.restassured.response.ValidatableResponse;

public interface GeolocationService {

    String getCountry(ValidatableResponse response);

}

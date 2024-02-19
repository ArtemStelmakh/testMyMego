package start.imp;

import start.api.Geolocation;
import io.restassured.response.ValidatableResponse;
import start.service.GeolocationService;


public class GeolocationImp implements GeolocationService {
    @Override
    public String getCountry(ValidatableResponse response) {
        Geolocation geolocation = response.extract().as(Geolocation.class);
        return geolocation.getCountry();
    }

}

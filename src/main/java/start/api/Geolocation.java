package start.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Geolocation {
	private String zip;
	private String country;
	private String city;
	private String org;
	private String timezone;
	private String query;
	private String regionName;
	private String isp;
	private Object lon;
	private String as;
	private String countryCode;
	private String region;
	private Object lat;
	private String status;

}
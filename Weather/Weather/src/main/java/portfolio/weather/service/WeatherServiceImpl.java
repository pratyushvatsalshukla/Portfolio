package portfolio.weather.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import portfolio.weather.entity.Weather;

@Service
public class WeatherServiceImpl implements WeatherService{

    Logger logger = LoggerFactory.getLogger(WeatherServiceImpl.class);
    final String URL = "https://weatherapi-com.p.rapidapi.com/current.json" ;
    final String X_RapidAPI_KEY = "c1291b578fmsh967b05595501b61p16c23bjsnf291302d87a7";
    final String X_RapidAPI_HOST= "weatherapi-com.p.rapidapi.com";

    @Autowired
    private final RestTemplate restTemplate ;

    public WeatherServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Weather getWeather(String city) {
          String final_url = URL + "?q=" + city;
//        Weather response =  restTemplate.getForObject(URL + "?q=" + city + "&aqi=no", Weather.class);
          Weather response = restTemplate.exchange(final_url, HttpMethod.GET, getEntity(), Weather.class).getBody() ;
          return response ;
    }

    private HttpEntity<?> getEntity(){
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", X_RapidAPI_KEY);
        headers.set("X-RapidAPI-Host", X_RapidAPI_HOST);
        headers.set("ACCEPT", MediaType.APPLICATION_JSON_VALUE) ;
        logger.info("Inside the getEntity of Weather Service Impl... Going to return entity or error...") ;
        return new HttpEntity<>(headers) ;
    }
}

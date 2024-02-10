package portfolio.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.weather.service.WeatherServiceImpl;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    WeatherServiceImpl weatherService;

    @GetMapping("/city/{city}")
    public ResponseEntity<?> getWeatherByCity(@PathVariable("city") String city) {
        return new ResponseEntity<>(weatherService.getWeather(city), HttpStatus.OK) ;
    }
}

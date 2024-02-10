package portfolio.weather.service;

import portfolio.weather.entity.Weather;

public interface WeatherService {

    public Weather getWeather(String city);
}

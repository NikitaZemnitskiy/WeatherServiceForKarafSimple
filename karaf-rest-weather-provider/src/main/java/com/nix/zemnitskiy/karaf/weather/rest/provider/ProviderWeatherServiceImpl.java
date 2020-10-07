package com.nix.zemnitskiy.karaf.weather.rest.provider;

import lombok.RequiredArgsConstructor;
import org.apache.cxf.jaxrs.client.WebClient;
import com.nix.zemnitskiy.karaf.weather.rest.api.Weather;


@RequiredArgsConstructor
public class ProviderWeatherServiceImpl implements ProvideWeatherService {
    private static final String WEATHER_KEY = "9bc9127b5ca9be05751bd273761634d4";
    private final static String UNITS = "metric";
    private final WebClient webClient;

    public Weather getWeatherByCity(String city) {
        Weather weather = webClient.reset()
                .query("q",city)
                .query("units", UNITS)
                .query("APPID", WEATHER_KEY)
                .get(Weather.class);
        return weather;
    }
}

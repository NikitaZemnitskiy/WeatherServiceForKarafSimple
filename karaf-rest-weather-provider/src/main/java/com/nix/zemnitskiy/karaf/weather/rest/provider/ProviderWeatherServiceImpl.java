package com.nix.zemnitskiy.karaf.weather.rest.provider;

import lombok.RequiredArgsConstructor;
import org.apache.cxf.jaxrs.client.WebClient;
import com.nix.zemnitskiy.karaf.weather.rest.api.Weather;


@RequiredArgsConstructor
public class ProviderWeatherServiceImpl implements ProvideWeatherService {
    private final String WEATHER_KEY;
    private final String UNITS;
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

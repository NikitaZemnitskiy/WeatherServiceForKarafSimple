package com.nix.zemnitskiy.karaf.weather.rest.provider;

import lombok.RequiredArgsConstructor;
import org.apache.cxf.jaxrs.client.WebClient;
import com.nix.zemnitskiy.karaf.weather.rest.api.Weather;


@RequiredArgsConstructor
public class ProviderWeatherServiceImpl implements ProvideWeatherService {
    private final WebClient webClient;
    private final String weatherKey;
    private final  String units;

    public Weather getWeatherByCity(String city) {
        System.out.println(weatherKey);
        Weather weather = webClient.reset()
                .query("q",city)
                .query("units", units)
                .query("APPID", weatherKey)
                .get(Weather.class);
        return weather;
    }
}

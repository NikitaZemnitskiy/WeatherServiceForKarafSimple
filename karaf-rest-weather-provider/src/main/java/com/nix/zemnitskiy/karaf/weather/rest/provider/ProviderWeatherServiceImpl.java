package com.nix.zemnitskiy.karaf.weather.rest.provider;

import lombok.RequiredArgsConstructor;
import org.apache.cxf.jaxrs.client.WebClient;
import com.nix.zemnitskiy.karaf.weather.rest.api.Weather;


@RequiredArgsConstructor
public class ProviderWeatherServiceImpl implements ProvideWeatherService {
    private final WebClient webClient;
    private final String weatherKey;
    //  = "9bc9127b5ca9be05751bd273761634d4";
    private final  String units;
    // = "metric"

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

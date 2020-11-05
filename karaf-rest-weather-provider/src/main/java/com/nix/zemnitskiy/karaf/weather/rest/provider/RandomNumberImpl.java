package com.nix.zemnitskiy.karaf.weather.rest.provider;

import com.nix.zemnitskiy.karaf.weather.rest.api.RandomNumber;
import org.apache.commons.math3.distribution.NormalDistribution;

public class RandomNumberImpl implements RandomNumber {
    @Override
    public NormalDistribution getRandomNumber(int mean, int standardDeviation) {
        NormalDistribution normalDistribution = new NormalDistribution(mean, standardDeviation);
        return normalDistribution;
    }
}

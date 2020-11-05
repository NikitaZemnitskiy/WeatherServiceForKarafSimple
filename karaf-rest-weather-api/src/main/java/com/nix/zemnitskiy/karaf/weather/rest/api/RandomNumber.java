package com.nix.zemnitskiy.karaf.weather.rest.api;

import org.apache.commons.math3.distribution.NormalDistribution;

public interface RandomNumber {
    NormalDistribution getRandomNumber (int mean, int standardDeviation);
}

package com.nix.zemnitskiy.karaf.weather.rest.api;

import org.apache.commons.math3.distribution.NormalDistribution;

import javax.ws.rs.PathParam;

public interface RandomNumber {
    NormalDistribution getRandomNumber (@PathParam("mean") int mean, @PathParam("standardDeviation") int standardDeviation);
}

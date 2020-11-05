package com.nix.zemnitskiy.karaf.weather.rest.api;

import org.apache.commons.math3.distribution.NormalDistribution;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

public interface RandomNumber {

    @Path("/randomNumber/{mean}/{standardDeviation}")
    @Produces("application/json")
    @GET
    NormalDistribution getRandomNumber (@PathParam("mean") int mean, @PathParam("standardDeviation") int standardDeviation);
}

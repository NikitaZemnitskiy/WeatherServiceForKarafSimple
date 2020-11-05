#Karaf REST Weather Service

## Artifacts

* **karaf-rest-weather-api** is a common bundle containing the `Weather` POJO and the `WeatherService` interface.   
* **karaf-rest-weather-provider** is a blueprint bundle providing the `WeatherServiceRestImpl` implementation of the `WeatherService` interface.
* **karaf-rest-weather-features** provides a Karaf features repository used for the deployment.

## Build

The build uses Apache Maven. Simply use:

```
mvn clean install
```

## Feature and Deployment

On a running Karaf instance, register the features repository using:

```
karaf@root()> feature:repo-add mvn:com.nix.zemnitskiy/karaf-rest-weather-features/1.0.0/xml
```

Then, you can install the service blueprint provider feature:

```
karaf@root()> feature:install karaf-rest-weather-provider
```


## com.nix.zemnitskiy.karaf.ApiSettings.cfg 

 provider.weather.key=9bc9127b5ca9be05751bd273761634d4
 provider.units=metric

## org.apache.karaf.features

featuresRepositories = \
    mvn:org.apache.karaf.features/framework/4.2.8/xml/features, \
    mvn:org.apache.karaf.features/spring/4.2.8/xml/features, \
    mvn:org.apache.karaf.features/enterprise/4.2.8/xml/features, \
    mvn:com.nix.zemnitskiy/karaf-rest-weather-features/1.0.0/xml
    mvn:org.apache.karaf.features/standard/4.2.8/xml/features

featuresBoot = \
    instance/4.2.8, \
    package/4.2.8, \
    log/4.2.8, \
    ssh/4.2.8, \
    framework/4.2.8, \
    system/4.2.8, \
    eventadmin/4.2.8, \
    feature/4.2.8, \
    shell/4.2.8, \
    management/4.2.8, \
    service/4.2.8, \
    jaas/4.2.8, \
    deployer/4.2.8, \
    diagnostic/4.2.8, \
    wrap/2.6.2, \
    bundle/4.2.8, \
    config/4.2.8, \
    karaf-rest-weather-provider/1.0.0, \
    kar/4.2.8

Endpoint to check - http://localhost:8181/cxf/weather/city/london

TaskFive

 Recursive dependency
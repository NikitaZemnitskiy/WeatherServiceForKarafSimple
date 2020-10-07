#Karaf REST Weather Service

## Artifacts

* **karaf-rest-weather-api** is a common bundle containing the `Weather` POJO and the `WeatherService` interface.   
* **karaf-rest-weather-provider** is a blueprint bundle providing the `WeatherServiceRestImpl` implementation of the `WeatherService` interface.
* **karaf-rest-weather-features** provides a Karaf features repository used for the deployment.
* **karaf-rest-weather-cassandra** provides a Cassandra database used to storage requests.
* **karaf-rest-weather-camel** provides a Camel mail service used to send e-mail to your mail.

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

<repository>mvn:org.apache.cxf.karaf/apache-cxf/${cxf.version}/xml/features</repository>
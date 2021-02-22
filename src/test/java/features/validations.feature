@WeatherAPITesting
Feature: Validating Weather of Place API's

  @LatLon @regression
  Scenario: AC1 : Verify the weather using latitute and longitude parameters
    When I call the api with POST https request "LatitudeandLongitude" and validate status OK


  @PostCode @regression
  Scenario:  AC2 : Verify the weather using postcode parameters
    When I call the api with POST https request "PostCode" and validate status OK

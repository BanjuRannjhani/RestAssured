package Selenium.RestAssured;

import static org.junit.Assert.assertTrue;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;
import org.junit.Test;


import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;

import javax.net.ssl.HttpsURLConnection;



public class AppTest extends DefaultPageObject
{
  Response response;	
	int responsecode_final;
	String base_url ;
	
	HttpsURLConnection conn;
	
	InputStream inputstream;
	Properties prop = new Properties();
//	String propFileName = "config.properties";
	private boolean True;
	
    @Test
    public void postmethod(String condition) throws Exception
    {
    	prop = loadThePropertiesFile();
    	String baseurl = prop.getProperty("BaseURL");
    	String accesstoken = prop.getProperty("AccessToken");
    	String getlati = prop.getProperty("Latitude");
    	String getlongi = prop.getProperty("Longitude");
    	String getpin = prop.getProperty("PostCode");

        RestAssured.baseURI = baseurl;
        
        String latandlog = "LatitudeandLongitude";
    	String postalcode ="PostCode";
    	
    	if(condition.equals(latandlog)) {
    		String[] lati = getlati.split("\\, ");
    		String[] longi = getlongi.split("\\, ");
    		for(int x=0 ; x<lati.length ; x++) {
//    			for(int y=0 ; y<longi.length ; y++) {
    				System.out.println("------------------------------------------------------------------------------------------------------------------------");
    				System.out.println("Latitude entered is : " +lati[x] + " " + " & Longitude entered is : "+ longi[x]);
    		RequestSpecification httpRequest = RestAssured.given();
            response = httpRequest.request(Method.POST, "/v2.0/current?key="+accesstoken+"&lat="+lati[x]+"&lon="+longi[x]+"");
            
            String responseBody = response.getBody().asString();
//            System.out.println("Whole Response Body is =>  " + responseBody);

            JsonPath js = new JsonPath(responseBody);
            String icon = js.get("data[0].weather.icon"); 
            int code = js.getInt("data[0].weather.code");
            String description = js.get("data[0].weather.description");
            String city = js.get("data[0].city_name");
            String timezone = js.get("data[0].timezone");
            System.out.println("The icon is: " +icon +" & the code is: " +code+ " & the description is:  " + description );
            System.out.println("The weather at " + city + " City situated in the " +timezone+ " Timezone is more likely to be " + description + " today");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
    			}
//    		}
    	}
   	
    	else if (condition.equals(postalcode)) {
    		String[] pin = getpin.split("\\, ");
        	
        	for(int z=0 ; z<pin.length ; z++) {
        	System.out.println("------------------------------------------------------------------------------------------------------------------------");
        	System.out.println("PostCode entered is: " +pin[z]);
    		RequestSpecification httpRequest = RestAssured.given();
    		 response = httpRequest.request(Method.POST, "/v2.0/current?key="+accesstoken+"&postal_code="+pin[z]+"");
//             response = httpRequest.request(Method.POST, "/v2.0/current?key=52439590753b43a6aa77b7cb70c60662&postal_code=600053");
    		 
    		 String responseBody = response.getBody().asString();
//    	        System.out.println("Whole Response Body is =>  " + responseBody);

    	        JsonPath js = new JsonPath(responseBody);
    	        String icon = js.get("data[0].weather.icon"); 
    	        int code = js.getInt("data[0].weather.code");
    	        String description = js.get("data[0].weather.description");
    	        String city = js.get("data[0].city_name");
    	        String timezone = js.get("data[0].timezone");
    	        
                System.out.println("The icon is: " +icon +" & the code is: " +code+ " & the description is:  " + description );;
    	        System.out.println("The weather at " + city + " City situated in the " +timezone+ " Timezone is more likely to be " + description + " today");
    	        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        	}
    	}   	   
    
    }
    
    
  
}

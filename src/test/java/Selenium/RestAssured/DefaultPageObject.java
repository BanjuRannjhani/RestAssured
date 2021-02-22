package Selenium.RestAssured;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DefaultPageObject {

	private static Properties properties;
	private final String propertyFilePath = System.getProperty("user.dir") + "//src//test//java//Configurations//config.properties";
	
	public Properties loadThePropertiesFile() throws IOException {

		Properties prop = new Properties();
		URL root = getClass().getProtectionDomain().getCodeSource().getLocation();
		URL propertiesFile = new URL(root, "config.properties");
		prop.load(propertiesFile.openStream());

		return prop;
    }
	

//		public void ConfigFileReader() {
//			BufferedReader reader;
//			
//			try {
//				reader= new BufferedReader(new FileReader(propertyFilePath));
//				properties = new Properties();
//				try {
//					properties.load(reader);
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			} 
//			catch (FileNotFoundException e) {
//				e.printStackTrace();
//				throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
//			}
//		}
//		
//		public String getlatitude() {
//			String getlatitude = properties.getProperty("Latitude");
//			if(getlatitude!=null) return getlatitude;
//			else throw new RuntimeException("driverPath not specified in configuration.properties file");
//		}
//		
//		public String getLongitude() {
//			String getLongitude = properties.getProperty("Longitude");
//			if(getLongitude!=null) return getLongitude;
//			else throw new RuntimeException("username is not specified in configuration.properties file");
//			
//			
//		}
//		
//		public String accesstoken() {
//			String accesstoken = properties.getProperty("AccessToken");
//			if(accesstoken!=null) return accesstoken;
//			else throw new RuntimeException("timeToDelay not specified in configuration.properties file");
//		}
//		 
//
//		public String getPostCode() {
//			String getPostCode = properties.getProperty("PostCode");
//			if(getPostCode!=null) return getPostCode;
//			else throw new RuntimeException("username is not specified in configuration.properties file");
//			
//			
//		}
//		
//		public String getURL() {
//			String url = properties.getProperty("BaseURL");
//			if(url!=null) return url;
//			else throw new RuntimeException("url is not specified in configuration.properties file");
//			
//			
//		}
		
	
	
}

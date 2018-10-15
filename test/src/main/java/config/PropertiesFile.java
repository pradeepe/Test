package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.FirstSeleniumTest;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	

	public static void main(String[] args) {
		
		readPropertiesFile();
		writePropertiesFile();
	}
	
	
	public static void readPropertiesFile() {
		//prop = new Properties();
		
		try {
			
			InputStream input = new FileInputStream("c:\\git\\test\\src\\main\\java\\config\\config.properties");
			prop.load(input);
			FirstSeleniumTest.browserName = prop.getProperty("browserName");
			System.out.println(FirstSeleniumTest.browserName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writePropertiesFile() {
		//prop = new Properties();
		
		try {
			
			OutputStream output = new FileOutputStream("c:\\git\\test\\src\\main\\java\\config\\config.properties");
			prop.setProperty("browser", "Chrome");
			System.out.println("Pradeep -2");
			prop.store(output, "Pass");
			prop.getProperty("browser");
			System.out.println(prop.getProperty("browser"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

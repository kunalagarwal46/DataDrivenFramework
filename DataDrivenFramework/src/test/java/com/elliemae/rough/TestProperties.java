package com.elliemae.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		Properties config = new Properties();
		Properties or = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/Config.properties");
		config.load(fis);
		fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/OR.properties");
		or.load(fis); 
		System.out.println(or.getProperty("bmlBtn"));
		
		

		
	}

}

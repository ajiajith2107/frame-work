package HELPER;

import java.io.*;
import java.util.Properties;

public class ConfigurationManager {

	public static Properties ps;

	public ConfigurationManager() throws IOException {

		File file = new File("C:\\Users\\AJITH KUMAR\\eclipse-workspace2\\TCF\\config.properties");

		FileInputStream fis = new FileInputStream(file);
		ps = new Properties();

		ps.load(fis);
		
	}

	public String getURL() {
		String url = ps.getProperty("url");

		return url;
	}

	public String getBrowser() {
		String browser = ps.getProperty("browser");

		return browser

		;
	}

}
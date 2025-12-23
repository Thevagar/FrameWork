package com.ninzacrm.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String getDataFromProperties(String key) throws IOException {

		FileInputStream fis = new FileInputStream("./src/main/resources/instagram.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String value = pObj.getProperty(key);
		return value;
	}
}

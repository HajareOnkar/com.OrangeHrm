package genaricLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	public String getPropertyFile(String key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyFilePath);
		p.load(fis);
		return p.getProperty(key);
		
	}

}

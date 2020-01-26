package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Generic 
{

	public static String getpropdata(String key)
	{ 
		String data=null;
		Properties prop=null;
		try {
		prop = new Properties();
		FileInputStream file=new FileInputStream("./data.properties");
		prop.load(file);
		
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    data=prop.getProperty(key);
		return data;
	}
}

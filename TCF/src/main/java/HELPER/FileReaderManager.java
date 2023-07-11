package HELPER;

import java.io.IOException;

public class FileReaderManager {

	
	public static FileReaderManager fr=new FileReaderManager();
	
	
	
	public static FileReaderManager getinstance()
	{
		return fr;
	}
	
	
	public static ConfigurationManager cr;
	
	public static ConfigurationManager getcr() throws IOException
	{
		if(cr==null)
		{
			cr=new ConfigurationManager();
		}
		
		return cr;
	}
}

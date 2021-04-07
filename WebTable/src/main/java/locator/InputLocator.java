package locator;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class InputLocator {
	public properties prop;
	public InputLocator();
	
	{
		Properties prop=new properties();
		File file =new File(System.getProperty("C:\\Users\\sandeep.thanigachala\\eclipse-workspace\\WebTable\\src\\main\\java\\locator\\locator.properties"));
	 try {
		FileInputStream obj =new FileInputStream(file);
		prop.load(obj);
		this.prop=prop;
	}catch(Exception e){
		e.printStackTrace();
		
	}
	}
	public ByFirstname() {
		
	}
}

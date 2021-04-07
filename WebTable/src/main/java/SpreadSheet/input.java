package SpreadSheet;

import java.io.File;
import java.io.FileInputStream;

import locator.InputLocator;

public class input {
	public XSSFSheet sheet;
	public Testdata()
	{
		InputLocator input =new InputLocator();
		File file=new File(input.prop.getProperty("C:\\Users\\sandeep.thanigachala"));
		FileInputStream obj=new FileInputStream(file);
		XSSFBook2 wb=new XSSFBokk2(obj);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		this.sheet=sheet;
		
		
	}
public String grtColHead() {
	String Cell=sheet.getRow(0).getCol(0).getStringValue(0);
	return Cell;
}
}

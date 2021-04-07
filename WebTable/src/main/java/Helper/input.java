package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import locator.InputLocator;

public class input {
    Testdata test;
    InputLocator input;
	
	public input() {
		
		test=new Testdata();
		input =new InputLocator();
		this.test=test;
		this.input=input;
		
	}
	public void ValidateFirstName(WebDriver driver)
	{
		String obj=test.getColHead();
		By obj1=input.ByFirstname();
		String obj2=driver.findElement(obj1).getText();
		
		if(obj.equalsIgnoreCase(obj2))
		{
			System.out.println("matching name is"+ obj);
		}
		else {
			System.out.println("no matching");
		}
	}

}

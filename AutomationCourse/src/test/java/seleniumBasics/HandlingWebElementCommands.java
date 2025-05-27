package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HandlingWebElementCommands extends Base {
	public void verifyWebElementCommands() 
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messageBox.sendKeys("Taniya"); //sendkeys() method is used to input values
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showMessageButton.isDisplayed());
		System.out.println(showMessageButton.isEnabled());
		showMessageButton.click(); //click() method is used to click a web element
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(yourMessage.getText()); //to get the visible text
		messageBox.clear(); //to clear the entered values in the textbox
		WebElement valueA=driver.findElement(By.id("value-a"));
		System.out.println(valueA.getTagName()); //to retrieve the tagname of the element
	}

	public static void main(String[] args) {
	HandlingWebElementCommands webElements=new HandlingWebElementCommands();
	webElements.initializeBrowser();
	webElements.verifyWebElementCommands();
	//webElements.browserClose();

	}

}

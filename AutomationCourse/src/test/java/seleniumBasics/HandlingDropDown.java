package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HandlingDropDown extends Base{
	public void verifyDropDown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement drop1=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(drop1);
		//select.selectByIndex(1); //to select the dropdown option by index value, index value starts with 0
		//select.selectByVisibleText("Python"); //select the option by visible text
		select.selectByValue("sql"); //to select the dropdown option by taking the value
	}

	public static void main(String[] args) {
		HandlingDropDown dropdown=new HandlingDropDown();
		dropdown.initializeBrowser();
		dropdown.verifyDropDown();
		//dropdown.browserClose();

	}

}

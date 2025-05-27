package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckboxAndRadiobutton extends Base{
	public void verifyCheckBox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-1']"));
		System.out.println(checkbox.isSelected());
		checkbox.click();
		WebElement checkbox1=driver.findElement(By.xpath("//input[@value='option-4']"));
		checkbox1.click();
		
	}
	public void verifyRadioButton()
	{
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='orange']"));
		radiobutton.click();
	}

	public static void main(String[] args) {
		HandlingCheckboxAndRadiobutton checkboxradio=new HandlingCheckboxAndRadiobutton();
		checkboxradio.initializeBrowser();
		checkboxradio.verifyCheckBox();
		//checkboxradio.verifyRadioButton();
		//checkboxradio.browserClose();

	}

}

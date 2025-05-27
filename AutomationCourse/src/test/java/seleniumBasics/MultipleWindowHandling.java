package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {
	public void multipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		WebElement clickhere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		Set<String>handleids=driver.getWindowHandles();
		System.out.println(handleids);
		Iterator<String>it=handleids.iterator();
		while(it.hasNext())
		{
			String currentId=it.next();
			if(!currentId.equals(parentWindow)) {
				driver.switchTo().window(currentId);
				WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
				email.sendKeys("taniya@gmail.com");
				WebElement submitButton=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submitButton.click();
			}
		}
		
	}

	public static void main(String[] args) {
		MultipleWindowHandling window=new MultipleWindowHandling();
		window.initializeBrowser();
		window.multipleWindow();
		//window.browserClose();

	}

}

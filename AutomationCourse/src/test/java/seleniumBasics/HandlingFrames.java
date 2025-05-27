package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base{
	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement>totalFrames=driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrames.size());
		WebElement mainFrame=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(mainFrame);
		WebElement tableheading=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(tableheading.getText());
		driver.switchTo().defaultContent();
			
	}

	public static void main(String[] args) {
		HandlingFrames frame=new HandlingFrames();
		frame.initializeBrowser();
		frame.verifyFrames();
		//frame.browserClose();

	}

}

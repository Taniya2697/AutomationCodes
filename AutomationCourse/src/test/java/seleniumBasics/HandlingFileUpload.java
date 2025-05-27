package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	public void verifyFileUploadUsingSendkeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile=driver.findElement(By.id("uploadfile_0"));
		chooseFile.sendKeys("C:\\Users\\akhil\\git\\AutomationCodes\\AutomationCourse\\src\\test\\resources\\Selenium Notes.pdf");
		WebElement terms=driver.findElement(By.id("terms"));
		terms.click();
		WebElement submit=driver.findElement(By.id("submitbutton"));
		submit.click();
	}
	public void verifyFileUploadUsingRobotClass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement pickFile=driver.findElement(By.id("pickfiles"));
		pickFile.click();
		StringSelection ss=new StringSelection("C:\\Users\\akhil\\git\\AutomationCodes\\AutomationCourse\\src\\test\\resources\\Selenium Notes.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot=new Robot();
		robot.delay(2500);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		HandlingFileUpload fileupload=new HandlingFileUpload();
		fileupload.initializeBrowser();
		//fileupload.verifyFileUploadUsingSendkeys();
		try {
			fileupload.verifyFileUploadUsingRobotClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fileupload.browserClose();

	}

}

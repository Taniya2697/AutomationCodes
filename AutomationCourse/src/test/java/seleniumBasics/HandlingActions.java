package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	public void verifyRightClick()
	{
		WebElement rightClick=driver.findElement(By.xpath("//a[text()='Home']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightClick).build().perform();
	}
	public void verifyMouseOver()
	{
		WebElement mouseOver=driver.findElement(By.id("others"));
		Actions actions=new Actions(driver);
		actions.moveToElement(mouseOver).build().perform();
		
	}
	public void verifyDragAndDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(drag, drop).build().perform();
	}
	public void KeyboardActions() throws AWTException
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) {
		HandlingActions action=new HandlingActions();
		action.initializeBrowser();
		//action.verifyRightClick();
		//action.verifyMouseOver();
		//action.verifyDragAndDrop();
		//action.browserClose();
		try {
			action.KeyboardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package seleniumBasics;

public class HandlingBrowserCommands extends Base {
	public void verifyBrowserCommand()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
	}

	public static void main(String[] args) {
		HandlingBrowserCommands browser=new HandlingBrowserCommands();
		browser.initializeBrowser();
		browser.verifyBrowserCommand();
		//browser.browserClose();

	}

}

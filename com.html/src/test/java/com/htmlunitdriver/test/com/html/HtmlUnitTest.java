package com.htmlunitdriver.test.com.html;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitTest {

	@Test
	public void test() {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.ie.driver", "D:\\Selenium\\HtmlUnitProject\\src\\driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		*/
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.CHROME);
		driver.get("https://www.google.com");
		System.out.println("page title is:"+driver.getTitle());
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("page title is:"+driver.getTitle());

	}

}

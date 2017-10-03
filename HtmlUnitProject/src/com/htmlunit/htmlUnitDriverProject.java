package com.htmlunit;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class htmlUnitDriverProject {
	//public static DesiredCapabilities caps=null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.ie.driver", "D:\\Selenium\\HtmlUnitProject\\src\\driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		/*WebDriver driver=new HtmlUnitDriver();
		//HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.CHROME);
		driver.get("https://www.google.com");
		System.out.println("page title is:"+driver.getTitle());
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("page title is:"+driver.getTitle());*/
		
		//caps.setBrowserName(html);
		WebDriver driver;
		DesiredCapabilities capabilities = DesiredCapabilities.htmlUnit();
		//capabilities.se
		capabilities.setBrowserName("htmlunit");
		capabilities.setVersion("internet explorer");
		//capabilities.setPlatform(Platform.WIN10);
		capabilities.setJavascriptEnabled(true);
		
		  driver = new RemoteWebDriver(new URL("http://192.168.0.103:4444/wd/hub"),capabilities);
				//Desiredcaps.htmlUnit());
			driver.get("http://seleniumhq.org/");
				System.out.println(driver.getPageSource());
				driver.quit();
		
		//driver.find
	}

}

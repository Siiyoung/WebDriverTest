package com.yk.player.test.setdriver;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetDriver {
	private  WebDriver driver;
	
	public SetDriver() throws InterruptedException{
	    System.setProperty("webdriver.chrome.driver", "/path/chromedriver.exe");
	    driver = new ChromeDriver(); 
	    
	    driver.get("http://utest.youku.com/tools/player/xplayer/xplayer/case.php?id=22");	    
		Thread.sleep(5000);
		driver.manage().window().maximize();
		String currentTime = new SimpleDateFormat().format(Calendar.getInstance().getTime());
		
	}
    public void driverQuit(){
    	driver.quit();
    }
	public WebDriver getWebDriver(){
		return driver;
	}
}

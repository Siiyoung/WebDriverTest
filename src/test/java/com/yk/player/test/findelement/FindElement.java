package com.yk.player.test.findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.yk.player.test.dto.ElementDto;
import com.yk.player.test.setdriver.SetDriver;

public class FindElement {
	public  WebElement play;  
	public  WebElement pause ;
	public  WebElement seek;
	public  WebElement seekTo;
	public  WebElement currentTime;
	public  WebElement showCurrentTime;
	public  WebElement quit;
	
	
	public ElementDto findElement() throws InterruptedException{
		SetDriver driver = new SetDriver();
		ElementDto elmentDto = new ElementDto();
		
    	play = driver.getWebDriver().findElement(By.id("play"));
    	pause = driver.getWebDriver().findElement(By.id("pause"));
    	seek = driver.getWebDriver().findElement(By.id("seek"));
    	seekTo = driver.getWebDriver().findElement(By.id("seekTo"));;
    	currentTime = driver.getWebDriver().findElement(By.id("currentTime"));
    	showCurrentTime = driver.getWebDriver().findElement(By.id("show"));
    	
    	
    	elmentDto.setPlay(play);
    	elmentDto.setPause(pause);
    	elmentDto.setSeek(seek);
    	elmentDto.setSeekto(seekTo);
    	elmentDto.setCurrentTime(currentTime);
    	elmentDto.setShowCurrentTime(showCurrentTime);
    	
		return elmentDto;
    	
    }
}

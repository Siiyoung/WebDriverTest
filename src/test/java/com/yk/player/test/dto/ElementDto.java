package com.yk.player.test.dto;

import org.openqa.selenium.WebElement;

public class ElementDto {
    WebElement play;
    WebElement pause;
    WebElement seek;
	WebElement seekto;
	WebElement currentTime;
	WebElement showCurrentTime; 
	WebElement quit;
	
	public WebElement getQuit() {
		return quit;
	}

	public void setQuit(WebElement quit) {
		this.quit = quit;
	}

	public WebElement getPause() {
		return pause;
	}

	public void setPause(WebElement pause) {
		this.pause = pause;
	}

	public WebElement getSeek() {
		return seek;
	}

	public void setSeek(WebElement seek) {
		this.seek = seek;
	}

	public WebElement getSeekto() {
		return seekto;
	}

	public void setSeekto(WebElement seekto) {
		this.seekto = seekto;
	}

	public WebElement getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(WebElement currentTime) {
		this.currentTime = currentTime;
	}

	public WebElement getShowCurrentTime() {
		return showCurrentTime;
	}

	public void setShowCurrentTime(WebElement showCurrentTime) {
		this.showCurrentTime = showCurrentTime;
	}

	public WebElement getPlay() {
		return play;
	}

	public void setPlay(WebElement play) {
		this.play = play;
	}
}

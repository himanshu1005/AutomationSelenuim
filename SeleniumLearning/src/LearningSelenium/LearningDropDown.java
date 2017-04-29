package LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	1. selectByIndex - We need pass an argument -- index
		2. selectByValue - We need pass an agrugment -- String
		3. selectByVisibleText - We need to pass an argument - string
		
		**/
		
		
		 WebDriver driver = new FirefoxDriver ();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		/* 
		 WebElement day = driver.findElement(By.id("day"));
		 Select select = new Select(day);
		 select.selectByVisibleText("5");*/
		 
		 WebElement month = driver.findElement(By.id("month"));
		 selectDropDownByValue(month,"2");

		 
		 WebElement year = driver.findElement(By.id("year"));
		 selectDropDownByValue(year,"2016");

		 
		 
		 

	}
	
	public static void selectDropDownByValue(WebElement element, String valueToSelect){
		Select select = new Select(element);
		select.selectByValue(valueToSelect);
	}
	
	public static void selectDropdownByVisibleText(WebElement element, String valueToselect) {
		Select select =new Select (element);
		select.selectByVisibleText(valueToselect);
		
	}
	
		
	
	

}



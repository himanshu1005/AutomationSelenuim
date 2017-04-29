package com.cialfomultisport;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {

	
	static WebDriver driver;
	
	@Test

	public static void loginToaccount () throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		/*String filepath = "C:\\Users\\Arun\\workspace\\SeleniumLearning\\src\\LearningSelenium\\Selenuimfile.properties";
		
		Properties prop = new Properties ();
		FileInputStream fis = new FileInputStream(filepath);
		prop.load(fis);
		System.out.println(prop.get("Browser"));
		System.out.println(prop.get("Username"));
		*/
		
		//Priting vaues 
		/*String br,us,pwd,baseurl;
		br=getValueFromProperties("Browsername");
		baseurl=getValueFromProperties("url");
		us=getValueFromProperties("Username");
		pwd=getValueFromProperties("Password");
		System.out.println(br+"--"+us+"--"+pwd);*/
		
		//Passing values 

		launchBrowser(getValueFromProperties("Browsername"));
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get(getValueFromProperties("baseurl"));
		driver.manage().window().maximize();
		 driver.findElement(By.id("show-login")).click();
		 driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(getValueFromProperties("Individualusername"));
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(getValueFromProperties("IndividualPassword"));
		  driver.findElement(By.id("signin-okButton")).click();
		  Thread.sleep(50000);
		 String bbb= driver.findElement(By.xpath("//a[@id='show-login']/following-sibling::span[1]/a")).getText();
		System.out.println(bbb);
		  //String logedInIcon = driver.findElement(By.xpath("html/body/app/modal-signin/div/div/form/div[1]/p]//*[@id='show-login']/following-sibling::span/a")).getText();
		 /* //String Expectedlogeedusername = "Arun Panangattu";
		  if (logedInIcon.isDisplayed()){
			  System.out.println("Logged in successfull");
		  }
		  
		  driver.close();//button[@id='demo-menu-lower-right']
		*/
		 /* driver.findElement(By.xpath("//a[@class=' mdl-button mdl-js-button mdl-js-ripple-effect navProfileName']")).click();
		    driver.findElement(By.cssSelector("#editicon > i.material-icons")).click();
		    driver.findElement(By.id("profilename")).click();
		    driver.findElement(By.id("profilename")).clear();
		    driver.findElement(By.id("profilename")).sendKeys("Arun pananagattu vijayan");
		    driver.findElement(By.cssSelector("#editicon > i.material-icons")).click();
		    driver.findElement(By.id("demo-menu-lower-right")).click();
		    driver.findElement(By.cssSelector("#rightsidemenu > li.mdl-menu__item.mdl-js-ripple-effect")).click();
*/
	}
	
	public static String getValueFromProperties (String key)  throws IOException {
     String filepath = "C:\\Users\\Arun\\workspace\\CialfoMultisports\\src\\cilafofile.properties";
		
		Properties prop = new Properties ();
		FileInputStream fis = new FileInputStream(filepath);
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	/*public static void launchBrowser (String Browsername){
		switch(Browsername){
		
		case "FF":
		driver=new FirefoxDriver();
		break;
		
		case "Chrome":
		System.setProperty("webdriver.chrome.driver", D:\\SeleniumSoftwares\\chromedriver.exe);
		driver=new ChromeDriver();
		break;
	}
*/
			
	public static void launchBrowser(String BrowserName){
		
		switch(BrowserName){
		case "FF":
			driver=new FirefoxDriver();
			break;
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftwares\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		}
	}
		
		
	}

	



package com.cialfomultisport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Loginparameter {
	static WebDriver driver = new ChromeDriver ();
	
	
	 
	
	
	@Test
	
	public static void Loginchecks (){
	  String fpath = "D:\\SeleniumSoftwares\\Arun.xlsx";
	  ExcelReader excel = new ExcelReader (fpath);
	  int rowcount = excel.getRowCount("Login");
	  for (int i=2;i<=rowcount;i++){
	  String usrnme=excel.getCellData("Login","Username",i);
	  System.out.println(usrnme);
	  String pwd = excel.getCellData("Login","Password",i);
	  System.out.println(pwd);
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftwares\\chromedriver.exe");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.get(Usercredentials.baseurl);
	  driver.findElement(By.id("show-login")).click();
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(usrnme);
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
	  driver.findElement(By.id("signin-okButton")).click();
	  }
	  
	  driver.close();
	  
	  
	  
	  
	  
	  }
	  
	  
  }


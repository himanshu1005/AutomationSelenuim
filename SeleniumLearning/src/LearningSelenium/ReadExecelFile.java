package LearningSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadExecelFile {

	public static void main(String[] args) {
		
		 String fpath = "D:\\SeleniumSoftwares\\Arun.xlsx";
		 ExcelReader excel = new ExcelReader (fpath);
		 int rowcount =excel.getRowCount("Login");
		 System.out.println(rowcount);
		 for (int i=2;i<=rowcount;i++){
		 
		 String username = excel.getCellData("Login","Username",i);
		 System.out.println(username);
		 String password = excel.getCellData("Login","Password",i);
		 System.out.println(password);
		 }
		 
	}
}
		 
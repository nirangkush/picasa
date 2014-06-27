package com.ActiTimeNew.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoigIn {

	public static void main(String[] args) {
	   WebDriver driver=new FirefoxDriver();
	   driver.get("http://127.0.0.1/login.do");
	   driver.findElement(By.name("username")).sendKeys("admin");
	   driver.findElement(By.name("pwd")).sendKeys("manager");
	   WebElement wb=driver.findElement(By.id("loginButton"));
	   System.out.println(wb.isEnabled());
	   WebElement wb1=driver.findElement(By.id("keepLoggedInCheckBox"));
	   //for(int i=0;i<2;i++){
		// wb1.click(); 
		// System.out.println(wb.isSelected());
		   
	   //}
	   wb1.click();
	   System.out.println(wb1.isSelected());
	   driver.close();
	   

	}

}

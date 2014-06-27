package com.ActiTimeNew.package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamic {

	public static void main(String[] args) {
		   String expectedtext="Prakash";
		   boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		   driver.get("http://127.0.0.1/login.do");
		   driver.findElement(By.name("username")).sendKeys("admin");
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   WebElement wb=driver.findElement(By.id("loginButton"));
		   wb.click();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.findElement(By.linkText("Tasks")).click();
		   driver.findElement(By.linkText("Projects & Customers")).click();
		   WebElement wb1=driver.findElement(By.name("selectedCustomer"));
		   Select sel=new Select(wb1);
		   List<WebElement> lst=sel.getOptions();
		   System.out.println(lst.size());
		   for(int i=0;i<lst.size();i++){
			   String actualText=lst.get(i).getText();
			   if(expectedtext.equals(actualText)){
			   sel.selectByVisibleText("Prakash");
			   System.out.println(expectedtext+"is available");
			   flag=true;
			   break;
			   }
		   }if(!flag){
			   System.out.println(expectedtext+"is not available");
		   }
		   

	}

}

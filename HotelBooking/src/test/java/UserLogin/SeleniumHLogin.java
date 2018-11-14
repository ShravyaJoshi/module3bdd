package UserLogin;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHLogin {

	public static void main(String[] args) throws Exception{

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/complete%20training%20data/JEE/2018/Java%20Full%20Stack/Module%203/hotelBooking/login.html");
		System.out.println(driver.getCurrentUrl());
		String strheading=driver.findElement(By.xpath(".//*[@id='mainCnt']/div[1]/div[1]/h1")).getText();
		if(strheading.contentEquals("Hotel Booking Application")) {
			System.out.println("heading matched");
		}
		else {
			System.out.println("heading not matched");
		}
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.name("userName")).sendKeys("capgemini");
		Thread.sleep(1000);
		
		driver.findElement(By.name("userPwd")).sendKeys("capg123");
		Thread.sleep(1000);
		
	
		//driver.close();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("btn")).click();
		//Thread.sleep(3000);
		String alert1=driver.switchTo().alert().getText();
		System.out.println(alert1);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	
		//driver.navigate().to("file:///D:/complete%20training%20data/JEE/2018/Java%20Full%20Stack/Module%203/hotelBooking/hotelbooking.html");
	//	System.out.println(driver.getCurrentUrl());
		
	}
	

}

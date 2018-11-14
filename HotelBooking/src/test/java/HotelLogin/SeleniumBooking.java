package HotelLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBooking {

	public static void main(String[] args) throws Exception{

	WebDriver driver=new FirefoxDriver();
		
	driver.get("file:///D:/complete%20training%20data/JEE/2018/Java%20Full%20Stack/Module%203/hotelBooking/hotelbooking.html");
	String strtitle=driver.getTitle();
	if(strtitle.contentEquals("Hotel Booking")) {
		System.out.println("title matched");
	}
	else {
		System.out.println("title does not matched");
	}
	//first name
	 driver.findElement(By.name("txtFN")).sendKeys("");
	 driver.findElement(By.className("btn")).click();
	 String alert=driver.switchTo().alert().getText();
		System.out.println(alert);
		driver.switchTo().alert().accept();
		driver.findElement(By.name("txtFN")).sendKeys("Shravya");
		driver.findElement(By.className("btn")).click();
		System.out.println("valid details are given");
		System.out.println(" ");
		driver.switchTo().alert().accept();
	
	//last name
		driver.findElement(By.id("txtLastName")).sendKeys("");
		driver.findElement(By.className("btn")).click();
		String alert1=driver.switchTo().alert().getText();
			System.out.println(alert1);
			driver.switchTo().alert().accept();
			driver.findElement(By.id("txtLastName")).sendKeys("Joshi");
			driver.findElement(By.className("btn")).click();	
			System.out.println("valid details are given");
			System.out.println(" ");
			driver.switchTo().alert().accept();	
	//email
			driver.findElement(By.name("Email")).sendKeys("");
			driver.findElement(By.className("btn")).click();
			String alert3=driver.switchTo().alert().getText();
				System.out.println(alert3);
				driver.switchTo().alert().accept();
				driver.findElement(By.name("Email")).sendKeys("shravya@capgemini.com");
				driver.findElement(By.className("btn")).click();
				System.out.println("valid details are given");
				System.out.println(" ");
				driver.switchTo().alert().accept();
	//mobile no
				
				driver.findElement(By.name("Phone")).sendKeys("");
				driver.findElement(By.className("btn")).click();
				String alert5=driver.switchTo().alert().getText();
					System.out.println(alert5);
					driver.switchTo().alert().accept();
					driver.findElement(By.name("Phone")).sendKeys("9949805311");
					driver.findElement(By.className("btn")).click();
					System.out.println("valid details are given");
					System.out.println(" ");
					driver.switchTo().alert().accept();
				
    //city
			Select city1=new Select(driver.findElement(By.name("city")));
			
			city1.selectByVisibleText("Select City");
			driver.findElement(By.className("btn")).click();
			String alert6=driver.switchTo().alert().getText();
			System.out.println(alert6);
		
			driver.switchTo().alert().accept();
			city1.selectByVisibleText("Hyderabad");
			driver.findElement(By.className("btn")).click();
			System.out.println("valid details are given");
			System.out.println(" ");
			driver.switchTo().alert().accept();
	//		state
			
	Select state=new Select(driver.findElement(By.name("state")));
			
			state.selectByVisibleText("Select State");
			driver.findElement(By.className("btn")).click();
			String alert7=driver.switchTo().alert().getText();
			System.out.println(alert7);
		
			driver.switchTo().alert().accept();
			state.selectByVisibleText("Karnataka");
			driver.findElement(By.className("btn")).click();
			System.out.println("valid details are given");
			System.out.println(" ");
			driver.switchTo().alert().accept();
			
			//no of guests
			Select guests=new Select(driver.findElement(By.name("persons")));	
			guests.selectByVisibleText("3");
			driver.findElement(By.className("btn")).click();
			System.out.println("valid details are given");
			System.out.println(" ");
			driver.switchTo().alert().accept();
	//card holder name
			driver.findElement(By.id("txtCardholderName")).sendKeys("");
			driver.findElement(By.className("btn")).click();
			String alert8=driver.switchTo().alert().getText();
				System.out.println(alert8);
				driver.switchTo().alert().accept();
				driver.findElement(By.id("txtCardholderName")).sendKeys("Joshi");
				driver.findElement(By.className("btn")).click();
				System.out.println("valid details are given");
				System.out.println(" ");
				driver.switchTo().alert().accept();	
		//debit card number
				driver.findElement(By.id("txtDebit")).sendKeys("");
				driver.findElement(By.className("btn")).click();
				String alert9=driver.switchTo().alert().getText();
					System.out.println(alert9);
					driver.switchTo().alert().accept();
					driver.findElement(By.id("txtDebit")).sendKeys("45698745236");
					driver.findElement(By.className("btn")).click();	
					System.out.println("valid details are given");
					System.out.println(" ");
					driver.switchTo().alert().accept();	
		//cvv
					driver.findElement(By.id("txtCvv")).sendKeys("");
					driver.findElement(By.className("btn")).click();
					String alert10=driver.switchTo().alert().getText();
						System.out.println(alert10);
						driver.switchTo().alert().accept();
						driver.findElement(By.id("txtCvv")).sendKeys("456");
						driver.findElement(By.className("btn")).click();	
						System.out.println("valid details are given");
						System.out.println(" ");
						driver.switchTo().alert().accept();	
		//expiry month
						driver.findElement(By.id("txtMonth")).sendKeys("");
						driver.findElement(By.className("btn")).click();
						String alert11=driver.switchTo().alert().getText();
							System.out.println(alert11);
							driver.switchTo().alert().accept();
							driver.findElement(By.id("txtMonth")).sendKeys("3");
							driver.findElement(By.className("btn")).click();
							System.out.println("valid details are given");
							System.out.println(" ");
							driver.switchTo().alert().accept();			
			//expiry year
							driver.findElement(By.id("txtYear")).sendKeys("");
							driver.findElement(By.className("btn")).click();
							String alert12=driver.switchTo().alert().getText();
								System.out.println(alert12);
								driver.switchTo().alert().accept();
								driver.findElement(By.id("txtYear")).sendKeys("2012");
								System.out.println("valid details are given");
								System.out.println(" ");
								driver.findElement(By.className("btn")).click();	
								
		}
		}


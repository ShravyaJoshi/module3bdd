package UserLogin;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sts.pageBean.hotelLoginPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefLogin {
private WebDriver driver;
private hotelLoginPageFactory hlpf;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Exception {
	
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hlpf=new hotelLoginPageFactory(driver);
		driver.get("file:///D:/complete%20training%20data/JEE/2018/Java%20Full%20Stack/Module%203/hotelBooking/login.html");
		//driver.close();

	}

	@Then("^check the heading of the page$")
	public void check_the_heading_of_the_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		String heading=driver.findElement(By.xpath(".//*[@id='mainCnt']/div[1]/div[1]/h1")).getText();
		if(heading.contentEquals("Hotel Booking Application")) {
			System.out.println("content matched");
		}
		else
		{
			System.out.println("content not matched");
		}
		Thread.sleep(2000);
	//	driver.close();
	}

	@When("^user enters valid username,valid password$")
	public void user_enters_valid_username_valid_password() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		hlpf.setPfname("capgemini");
		hlpf.setPfpwd("capg1234");
		Thread.sleep(2000);
		hlpf.setPflogin();
		//driver.close();
	 
	}

	@Then("^navigate to hotel page$")
	public void navigate_to_hotel_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to("file:///D:/complete%20training%20data/JEE/2018/Java%20Full%20Stack/Module%203/hotelBooking/hotelbooking.html");
		Thread.sleep(2000);
	//driver.close();
	}

	@When("^user doesnot enter either username or password$")
	public void user_doesnot_enter_either_username_or_password() throws Exception {
     hlpf.setPfname("");
    // hlpf.setPfpwd("");
     Thread.sleep(2000);
    // hlpf.setPflogin();
    // driver.close();
	 
	}

	@When("^click the login Button$")
	public void click_the_login_Button() throws Exception {
		Thread.sleep(2000);
      hlpf.setPflogin();
 //driver.close();
	 
	}

	@Then("^display appropriate message$")
	public void display_appropriate_message() throws Exception {
	 
		String strheading=driver.findElement(By.xpath(".//*[@id='userErrMsg']")).getText();
	assertEquals(strheading,"* Please enter userName.");
	//driver.close();
	}

	@When("^user enters incoorect username or password$")
	public void user_enters_incoorect_username_or_password() throws Exception {
	 hlpf.setPfname("capg");
	 hlpf.setPfpwd("capg1234");
	hlpf.setPflogin();
	//driver.close();
	}

	@Then("^display login failed message$")
	public void display_login_failed_message() throws Exception {
	  String alert=driver.switchTo().alert().getText();
	  System.out.println("alert msg is:"+alert);
	  driver.switchTo().alert().accept();
	  driver.close();
	}

}

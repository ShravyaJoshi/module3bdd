package HotelLogin;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sts.pageBean.hotelBookingPageFactory;
import org.sts.pageBean.hotelLoginPageFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefHotelLogin {

	private WebDriver driver;
 private hotelBookingPageFactory hbpf;
	@Given("^User is on hotel booking page$")
	public void user_is_on_hotel_booking_page() throws Throwable {
		driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hbpf=new hotelBookingPageFactory(driver);
		driver.get("file:///D:/complete%20training%20data/JEE/2018/Java%20Full%20Stack/Module%203/hotelBooking/hotelbooking.html/");
		
	}

	@When("^user enters all valid details$")
	public void user_enters_all_valid_details() throws Throwable {

 
	    
      hbpf.setPffname("Shravya");Thread.sleep(2000);
      hbpf.setPflname("Joshi");Thread.sleep(2000);
      hbpf.setPfemail("shravya.joshi@capgemini.com");Thread.sleep(2000);
      hbpf.setPfphone("9949805311");Thread.sleep(2000);
      hbpf.setPfcity("Hyderabad");Thread.sleep(2000);
      hbpf.setPfstate("Telangana");Thread.sleep(2000);
      hbpf.setPfguests("2");Thread.sleep(2000);
      hbpf.setPfcardholdername("Veena");Thread.sleep(2000);
      hbpf.setPfdebitnumber("89567412");Thread.sleep(2000);
      hbpf.setPfcvv("567");Thread.sleep(2000);
      hbpf.setPfmonth("12");Thread.sleep(2000);
   
   
  
      hbpf.setPfyear("2021");Thread.sleep(2000);
      
      hbpf.setRadiogender("female");
      hbpf.setCheckbox("Reading");
      hbpf.setCheckbox("Dancing");
      
      
    /* WebElement gender=driver.findElement(By.name("a"));
      boolean g=gender.isSelected();
       	if(g==true) {
       		gender.click();
  		System.out.println(gender);
  	}*/

 //   hbpf.setPfsubmit();
	 
	}

	@Then("^navigate to welcome page$")
	public void navigate_to_welcome_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(By.partialLinkText("Click here")).click();Thread.sleep(2000);
	//	driver.navigate().to("file:///D:/complete%20training%20data/JEE/2018/Java%20Full%20Stack/Module%203/hotelBooking/success.html");
		Thread.sleep(2000);
	  
	  
	}

	@When("^user leaves first name blank$")
	public void user_leaves_first_name_blank() throws Throwable {
	 
		hbpf.setPffname("");
		hbpf.setPfsubmit();
		String str=driver.switchTo().alert().getText();
		
      assertEquals(str, "Please fill the First Name");
		
			
		}
		
	   
	

	@Then("^display alert message$")
	public void display_alert_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	String str=driver.switchTo().alert().getText();
	System.out.println(str);
	driver.switchTo().alert().accept();
//	driver.close();

	}

	@When("^user leaves last name blank$")
	public void user_leaves_last_name_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("Shravya");
		hbpf.setPflname("");
		hbpf.setPfsubmit();
	  
	}



	@When("^user enters all data$")
	public void user_enters_all_data() throws Throwable {
	 }

	@When("^user enters wrong email and click button$")
	public void user_enters_wrong_email_and_click_button() throws Throwable {
		hbpf.setPffname("Shravya");
		hbpf.setPflname("Joshi");
		hbpf.setPfemail("");
		hbpf.setPfsubmit();
	
	
	}

	@When("^user leaves mobile number empty$")
	public void user_leaves_mobile_number_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("Shravya");
		hbpf.setPflname("Joshi");
		hbpf.setPfemail("sdhravayds@gmail.com");
		hbpf.setPfphone("");
		hbpf.setPfsubmit();

	}
	@When("^user enters incoorect mobile format$")
	public void user_enters_incoorect_mobile_format(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	 
		hbpf.setPffname("Shravya");
		hbpf.setPflname("Joshi");
		hbpf.setPfemail("sdhravayds@gmail.com");
		List<String> list=arg1.asList(String.class);

		
		for(int i=0;i<list.size();i++) {
			hbpf.getPfphone().clear();
			hbpf.setPfphone(list.get(i));
			hbpf.setPfsubmit();
		
			
			if(Pattern.matches("[789][0-9]{9}", list.get(i))) {
				System.out.println("matched" +list.get(i) );
			}
			else {
			
				String str=driver.switchTo().alert().getText();
				System.out.println(str);
				driver.switchTo().alert().accept();
				System.out.println("not matched" +list.get(i));
				
			}
		
		}
		hbpf.setPfsubmit();
		
	}
	
	@When("^user gives guests number details (\\d+)$")
	public void user_gives_guests_number_details(String arg1) throws Throwable {
		hbpf.setPffname("Shravya");Thread.sleep(1000);
		hbpf.setPflname("Joshi");Thread.sleep(1000);
		hbpf.setPfemail("shravya.joshi@capgemini.com");Thread.sleep(1000);
		hbpf.setPfphone("9949805311");Thread.sleep(1000);
		hbpf.setPfcity("Hyderabad");Thread.sleep(1000);
		hbpf.setPfstate("Telangana");Thread.sleep(1000);
		
		hbpf.setPfguests(arg1);Thread.sleep(1000);

	}

	@Then("^for (\\d+) no of guests allocate (\\d+)$")
	public void for_no_of_guests_allocate(int arg1, int arg2) throws Throwable {

		if(arg1<=3) {
			System.out.println("rooms:" +arg2);
			assertEquals(1, arg2);
		}
		else if(arg1>3 && arg1<=6) {
			System.out.println("rooms:" +arg2);
			assertEquals(2, arg2);
		}
		else if(arg1>6 && arg1<=9) {
			System.out.println("rooms:" +arg2);
			assertEquals(3, arg2);
		}
	}



/*	@When("^user enters address details$")
	public void user_enters_address_details() throws Throwable {
	 
	}

	@Then("^validations are done$")
	public void validations_are_done() throws Throwable {
	
	}*/

	@When("^user leaves the city name blank$")
	public void user_leaves_the_city_name_blank() throws Throwable {
	 
		
		hbpf.setPffname("Shravya");Thread.sleep(1000);
		hbpf.setPflname("Joshi");Thread.sleep(1000);
		hbpf.setPfemail("shravya.joshi@capgemini.com");Thread.sleep(1000);
		hbpf.setPfphone("9949805311");Thread.sleep(1000);
	//	hbpf.setPfguests("2");Thread.sleep(2000);
		hbpf.setPfcity("");Thread.sleep(1000);
	
		hbpf.setPfsubmit();
	}

	
	@Then("^display the alert message$")
	public void display_the_alert_message() throws Throwable {

		String str=driver.switchTo().alert().getText();
		System.out.println(str);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.close();
	}


	@When("^user leaves the state name blank$")
	public void user_leaves_the_state_name_blank() throws Throwable {
	  
		
		hbpf.setPffname("Shravya");Thread.sleep(1000);
		hbpf.setPflname("Joshi");Thread.sleep(1000);
		hbpf.setPfemail("shravya.joshi@capgemini.com");Thread.sleep(1000);
		hbpf.setPfphone("9949805311");Thread.sleep(1000);
		hbpf.setPfcity("Hyderabad");Thread.sleep(1000);
		
		hbpf.setPfstate("Select State");Thread.sleep(1000);
		//hbpf.setPfguests("2");Thread.sleep(2000);
		hbpf.setPfsubmit();
	}
	
	
	@When("^user enters number of people entering the hotel<noofguests>$")
	public void user_enters_number_of_people_entering_the_hotel_noofguests() throws Throwable {
	  
		hbpf.setPffname("Shravya");Thread.sleep(1000);
		hbpf.setPflname("Joshi");Thread.sleep(1000);
		hbpf.setPfemail("shravya.joshi@capgemini.com");Thread.sleep(1000);
		hbpf.setPfphone("9949805311");Thread.sleep(1000);
		hbpf.setPfcity("Hyderabad");Thread.sleep(1000);
		hbpf.setPfstate("Telangana");Thread.sleep(1000);
		hbpf.setPfguests("");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}

	@Then("^display the count of people who stays the the hotel$")
	public void display_the_count_of_people_who_stays_the_the_hotel() throws Throwable {

		String str=driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept();
		
		
	}
	

	@When("^user leaves card holder name empty$")
	public void user_leaves_card_holder_name_empty() throws Throwable {
		
		hbpf.setPffname("Shravya");Thread.sleep(1000);
		hbpf.setPflname("Joshi");Thread.sleep(1000);
		hbpf.setPfemail("shravya.joshi@capgemini.com");Thread.sleep(1000);
		hbpf.setPfphone("9949805311");Thread.sleep(1000);
		hbpf.setPfcity("Hyderabad");Thread.sleep(1000);
		hbpf.setPfstate("Telangana");Thread.sleep(1000);
		hbpf.setPfguests("2");Thread.sleep(1000);
		hbpf.setPfcardholdername("");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}

	@When("^user leaves the debit card number blank$")
	public void user_leaves_the_debit_card_number_blank() throws Throwable {
		hbpf.setPffname("Shravya");Thread.sleep(1000);
		hbpf.setPflname("Joshi");Thread.sleep(1000);
		hbpf.setPfemail("shravya.joshi@capgemini.com");Thread.sleep(1000);
		hbpf.setPfphone("9949805311");Thread.sleep(1000);
		hbpf.setPfcity("Hyderabad");Thread.sleep(1000);
		hbpf.setPfstate("Telangana");Thread.sleep(1000);
		hbpf.setPfguests("2");Thread.sleep(1000);
		hbpf.setPfcardholdername("Veena");Thread.sleep(1000);
		hbpf.setPfdebitnumber("");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}

	@When("^user leaves the cvv blank$")
	public void user_leaves_the_cvv_blank() throws Throwable {
		hbpf.setPffname("Shravya");Thread.sleep(1000);
		hbpf.setPflname("Joshi");Thread.sleep(2000);
		hbpf.setPfemail("shravya.joshi@capgemini.com");Thread.sleep(1000);
		hbpf.setPfphone("9949805311");Thread.sleep(1000);
		hbpf.setPfcity("Hyderabad");Thread.sleep(1000);
		hbpf.setPfstate("Telangana");Thread.sleep(1000);
		hbpf.setPfguests("2");Thread.sleep(1000);
		hbpf.setPfcardholdername("Veena");Thread.sleep(1000);
		hbpf.setPfdebitnumber("89567412");Thread.sleep(1000);
		hbpf.setPfcvv("");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}
	
	@When("^user leaves the card expiration month blank$")
	public void user_leaves_the_card_expiration_month_blank() throws Throwable {
		hbpf.setPffname("Shravya");Thread.sleep(1000);
		hbpf.setPflname("Joshi");Thread.sleep(1000);
		hbpf.setPfemail("shravya.joshi@capgemini.com");Thread.sleep(1000);
		hbpf.setPfphone("9949805311");Thread.sleep(1000);
		hbpf.setPfcity("Hyderabad");Thread.sleep(1000);
		hbpf.setPfstate("Telangana");Thread.sleep(1000);
		hbpf.setPfguests("2");Thread.sleep(1000);
		hbpf.setPfcardholdername("Veena");Thread.sleep(1000);
		hbpf.setPfdebitnumber("89567412");Thread.sleep(1000);
		hbpf.setPfcvv("567");Thread.sleep(1000);
		hbpf.setPfmonth("");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}
	@When("^user leaves the card expiration year blank$")
	public void user_leaves_the_card_expiration_year_blank() throws Throwable {
		hbpf.setPffname("Shravya");Thread.sleep(1000);
		hbpf.setPflname("Joshi");Thread.sleep(1000);
		hbpf.setPfemail("shravya.joshi@capgemini.com");Thread.sleep(1000);
		hbpf.setPfphone("9949805311");Thread.sleep(1000);
		hbpf.setPfcity("Hyderabad");Thread.sleep(1000);
		hbpf.setPfstate("Telangana");Thread.sleep(1000);
		hbpf.setPfguests("2");Thread.sleep(1000);
		hbpf.setPfcardholdername("Veena");Thread.sleep(1000);
		hbpf.setPfdebitnumber("89567412");Thread.sleep(1000);
		hbpf.setPfcvv("567");Thread.sleep(1000);
		hbpf.setPfmonth("12");Thread.sleep(1000);
		hbpf.setPfyear("");Thread.sleep(1000);
		hbpf.setPfsubmit();
		
	}
	@When("^user clicks on the navigation button$")
	public void user_clicks_on_the_navigation_button() throws Throwable {
		hbpf.setPffname("Shravya");Thread.sleep(1000);
		hbpf.setPflname("Joshi");Thread.sleep(1000);
		hbpf.setPfemail("shravya.joshi@capgemini.com");Thread.sleep(1000);
		hbpf.setPfphone("9949805311");Thread.sleep(1000);
		hbpf.setPfcity("Hyderabad");Thread.sleep(1000);
		hbpf.setPfstate("Telangana");Thread.sleep(1000);
		hbpf.setPfguests("2");Thread.sleep(1000);
		hbpf.setPfcardholdername("Veena");Thread.sleep(1000);
		hbpf.setPfdebitnumber("89567412");Thread.sleep(1000);
		hbpf.setPfcvv("567");Thread.sleep(1000);
		hbpf.setPfmonth("12");Thread.sleep(1000);
		hbpf.setPfyear("2021");Thread.sleep(1000);
		   hbpf.setRadiogender("female");
		      hbpf.setCheckbox("Reading");
		      hbpf.setCheckbox("Dancing");
	
		hbpf.setPfsubmit();
	}

	@Then("^redirects to the success page$")
	public void redirects_to_the_success_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	driver.navigate().to("file:///D:/complete%20training%20data/JEE/2018/Java%20Full%20Stack/Module%203/hotelBooking/success.html");
		Thread.sleep(2000);
		//hbpf.setPfsubmit();
	}


}

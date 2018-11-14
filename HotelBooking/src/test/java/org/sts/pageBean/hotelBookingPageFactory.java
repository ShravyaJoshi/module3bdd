package org.sts.pageBean;

import java.util.List;

import org.hamcrest.Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class hotelBookingPageFactory {
	WebDriver driver;
	@FindBy(name="txtFN")
	WebElement pffname;
	
	@FindBy(id="txtLastName")
	WebElement pflname;
	
	@FindBy(xpath=".//*[@id='txtEmail']")
	WebElement pfemail;
	
	@FindBy(name="Phone")
	WebElement pfphone;
	
	@FindBy(name="city")
	WebElement pfcity;
	
	@FindBy(name="state")
	WebElement pfstate;
	
	@FindBy(name="persons")
	WebElement pfguests;
	
	@FindBy(id="txtCardholderName")
	WebElement pfcardholdername;

	
	@FindBy(how=How.NAME,using="debit")
	WebElement pfdebitnumber;
	
	@FindBy(id="txtCvv")
	WebElement pfcvv;
	
	@FindBy(name="month")
	WebElement pfmonth;
	
	@FindBy(id="txtYear")
	WebElement pfyear;
	
	@FindBy(className="btn")
	WebElement pfsubmit;
	
	@FindBy(name="a")
	WebElement radiogender;
	
	@FindBy(name="b")
	WebElement checkbox;
	
	/*@FindBy(name="c")
	WebElement checkbox2;
	
	public WebElement getCheckbox2() {
		return checkbox2;
	}

	public void setCheckbox2(String checkb) {
		checkbox2.findElement(By.id("hobby2")).click();
	}*/

	public WebElement getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(String check) {
		if(check.equals("Reading")) {
	 checkbox.findElement(By.xpath("//*[@id='hobby1']")).click();
		}
		else if(check.equals("Dancing"))
	 checkbox.findElement(By.xpath("//*[@id='hobby2']")).click();
	}
	

	public WebElement getRadiogender() {
      return radiogender;
	}

	public void setRadiogender(String gender) {

	//	  System.out.println(li.get(0).getText());
	   // List<WebElement> li=driver.findElements(By.name("a"));
		if(gender.equals("male")) {
			radiogender.findElement(By.xpath("//*[@id='male']")).click();
		}
		else
			radiogender.findElement(By.xpath("//*[@id='female']")).click();
	
	}



	
	
	public WebElement getPffname() {
		return pffname;
	}

	public void setPffname(String sffname) {
	pffname.sendKeys(sffname);
	}

	public WebElement getPflname() {
		return pflname;
	}

	public void setPflname(String sflname) {
		pflname.sendKeys(sflname);
	}

	public WebElement getPfemail() {
		return pfemail;
	}

	public void setPfemail(String sfemail) {
	pfemail.sendKeys(sfemail);
	}

	public WebElement getPfphone() {
		return pfphone;
	}

	public void setPfphone(String sfphone) {
		pfphone.sendKeys(sfphone);
	}

	public WebElement getPfcity() {
		return pfcity;
	}

	public void setPfcity(String sfcity) {
		pfcity.sendKeys(sfcity);
	}

	public WebElement getPfstate() {
		return pfstate;
	}

	public void setPfstate(String sfstate) {
		Select s=new Select(pfstate);
		s.selectByVisibleText(sfstate);
	}

	public WebElement getPfguests() {
		return pfguests;
	}

	public void setPfguests(String sfguests) {
 pfguests.sendKeys(sfguests);
 
	}

	public WebElement getPfcardholdername() {
		return pfcardholdername;
	}

	public void setPfcardholdername(String sfcardholdername) {
	 pfcardholdername.sendKeys(sfcardholdername);
	}

	public WebElement getPfdebitnumber() {
		return pfdebitnumber;
	}

	public void setPfdebitnumber(String sfdebitnumber) {
		pfdebitnumber.sendKeys(sfdebitnumber);
	}

	public WebElement getPfcvv() {
		return pfcvv;
	}

	public void setPfcvv(String sfcvv) {
		pfcvv.sendKeys(sfcvv);
	}

	public WebElement getPfmonth() {
		return pfmonth;
	}

	public void setPfmonth(String sfmonth) {
		pfmonth.sendKeys(sfmonth);
	}

	public WebElement getPfyear() {
		return pfyear;
	}

	public void setPfyear(String sfyear) {
	 pfyear.sendKeys(sfyear);
	}

	public WebElement getPfsubmit() {
		return pfsubmit;
	}

	public void setPfsubmit() {
	pfsubmit.click();
	}
	

	public hotelBookingPageFactory(WebDriver driver) {
       this.driver=driver;
       PageFactory.initElements(driver, this);
	}
	 
}

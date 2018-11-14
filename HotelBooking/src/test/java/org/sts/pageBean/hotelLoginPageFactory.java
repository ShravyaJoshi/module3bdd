package org.sts.pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class hotelLoginPageFactory {

WebDriver driver;

	public WebElement getPfname() {
	return pfname;
}

public void setPfname(String sname) {
  pfname.sendKeys(sname);
}

public WebElement getPfpwd() {
	return pfpwd;
}

public void setPfpwd(String spwd) {
    pfpwd.sendKeys(spwd);
}

public WebElement getPflogin() {
	return pflogin;
}

public void setPflogin() {
	pflogin.click();
}

	@FindBy(name="userName")
	WebElement pfname;
	 
	@FindBy(how=How.NAME,using="userPwd")
	WebElement pfpwd;
	
	@FindBy(className="btn")
	WebElement pflogin;

	public hotelLoginPageFactory(WebDriver driver) {
       this.driver=driver;
       PageFactory.initElements(driver, this);
	}
	 
    
	
}

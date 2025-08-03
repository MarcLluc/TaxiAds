package AppTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardLandingPage {
	
	WebDriver driver;
	
	public DashboardLandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	//WebElement userEmail = driver.findElement(By.cssSelector("input[id=':r0:']"));
	//WebElement userPassword = driver.findElement(By.cssSelector("input[id=':r1:']"));
	//WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	
	// you can also use "PAGE FACTORY" @FindBy(id="userEmail")
	
	@FindBy(css="input[id=':r0:']")
	WebElement userEmail;
	
	@FindBy(css="input[id=':r1:']")
	WebElement userPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginButton;
	
	public void dashboardLogin (String email,String password)
	{
		driver.get("https://dashboard.turmsadrain.com/login");
		userEmail.sendKeys(email);
		userPassword.sendKeys(password);
		loginButton.click();
	
	}

}

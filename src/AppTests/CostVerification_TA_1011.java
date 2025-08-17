package AppTests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CostVerification_TA_1011 {
	
	@Test
    public void Verify_Cost_for_Static_Image_PDD_TA_1005() throws IOException, InterruptedException
	{
   	 WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	//driver.get("https://dashboard.turmsadrain.com/login");
	//driver.findElement(By.cssSelector("input[id=':r0:']")).sendKeys("aoke@turmsadrain.com");
	//driver.findElement(By.cssSelector("input[id=':r1:']")).sendKeys("2000@ngels");
	
	//driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
	DashboardLandingPage landingPage = new DashboardLandingPage (driver);
	landingPage.dashboardLogin("aoke@turmsadrain.com", "2000@ngels");
	
	driver.findElement(By.xpath("//h2[normalize-space()='Create Ad']")).click();
	driver.findElement(By.xpath("//div[@class='flex flex-col items-center text-white']")).click();
	
	
	Thread.sleep(2000);
	
	Runtime.getRuntime().exec("C:\\Users\\aoke\\Downloads\\Autoit Builds\\fileuploadimage.exe");
	
	//driver.findElement(By.cssSelector("input.css-1vbfw84")).sendKeys("Selenium Automation");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input[aria-autocomplete='list']")).click();
	driver.findElement(By.xpath("//li[@id='campaign-option-0']")).click();
	//driver.findElement(By.xpath("(//div[@class='mt-1'])[1]")).click();
	driver.findElement(By.cssSelector("input[id='\\:rf\\:']")).sendKeys("Selenium Automation");
	
	
	
	//driver.findElement(By.className("MuiInputBase-input MuiOutlinedInput-input css-1pk1fka"));
	//driver.findElement(By.cssSelector("input.css-1vbfw84")).sendKeys("Selenium Automation");
	
//	Thread.sleep(2000);
/*	driver.findElement(By.xpath("//input[@id='campaign']")); // campaignn
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//li[@id='campaign-option-0']")).click();
	driver.findElement(By.xpath("//input[@id='country']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("country-option-0")).click(); // Poland is index 0 change for other countries by index
	driver.findElement(By.id("area")).click();
	driver.findElement(By.id("area-option-6")).click(); //warsaw is index 6 so change for other cities by index
	driver.findElement(By.xpath("//button[normalize-space()='Select all zones']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='I want to buy displays (PPD)']")).click();
	// input amount of displays
	//Thread.sleep(2000);
	
	String correctppd = "18.45 PLN";
	String ppd = driver.findElement(By.xpath("//div[@class='text-2xl text-primary-500']")).getText();
	Assert.assertTrue(ppd.equalsIgnoreCase(correctppd));
	Assert.assertTrue(true);
	System.out.println(ppd);
	
	
	//Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'There are errors detected. Check form.')]")).isDisplayed());
	//Assert.assertTrue(true);
	
	//driver.close();*/
	}

}

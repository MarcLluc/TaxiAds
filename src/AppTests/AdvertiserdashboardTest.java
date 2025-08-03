package AppTests;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AdvertiserdashboardTest {

	
		// TODO Auto-generated method stub
		
	@Test
		public void VerifyLoginlogoutTA_817()
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
	
	
	
	Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Dashboard']")).isDisplayed());
	Assert.assertTrue(true);
	Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Create Ad']")).isDisplayed());
	Assert.assertTrue(true);
	Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Campaigns']")).isDisplayed());
	Assert.assertTrue(true);
	Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='In review']")).isDisplayed());
	Assert.assertTrue(true);
	
	driver.findElement(By.cssSelector(".MuiAvatar-root.MuiAvatar-circular.MuiAvatar-colorDefault.css-tn9vtd")).click();
	driver.findElement(By.xpath("//div[@class='text-red-600 font-bold']")).click();
	
	Assert.assertTrue(driver.findElement(By.xpath("//span[@class='mb-2 text-xl font-bold']")).isDisplayed());
	Assert.assertTrue(true);
	
	driver.close();
	
		}
	
     @Test
     public void Information_FieldsTA_846() throws IOException, InterruptedException
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
 	
    driver.findElement(By.xpath("//button[@type='submit']")).click();
 	
 	Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'There are errors detected. Check form.')]")).isDisplayed());
	Assert.assertTrue(true);
	
 	
 	Thread.sleep(2000);
 	
 	Runtime.getRuntime().exec("C:\\Users\\aoke\\Downloads\\Autoit Builds\\fileuploadimage.exe");
 	
 	driver.findElement(By.xpath("//button[@type='submit']")).click();
 	
 	Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'There are errors detected. Check form.')]")).isDisplayed());
	Assert.assertTrue(true);
	
	driver.close();
		
     }




	

}

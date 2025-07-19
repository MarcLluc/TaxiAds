

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Advertiserdashboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://dashboard.turmsadrain.com/login");
	
	driver.findElement(By.cssSelector("input[id=':r0:']")).sendKeys("aoke@turmsadrain.com");
	driver.findElement(By.cssSelector("input[id=':r1:']")).sendKeys("@Team2016");
		

	}

}

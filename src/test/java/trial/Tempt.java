package trial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tempt 
{

	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Local Disk D\\Automation Support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//open application
		driver.get("https://www.amazon.in/");
		//
		driver.findElement(By.xpath("(//*[@class='nav-line-1 nav-progressive-content'])[2]")).click();
		//
		driver.findElement(By.xpath("//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("9545172923");
		//
		driver.findElement(By.xpath("//*[@class='a-button-input']")).click();
		
		driver.findElement(By.xpath("//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("Ganesh@123");
		
		driver.findElement(By.xpath("(//*[@class='a-button-input'])[1]")).click();
		
		
		
		
		
		
		
	}
	
}

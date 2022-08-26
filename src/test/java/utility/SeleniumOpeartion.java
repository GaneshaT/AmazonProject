package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOpeartion 
{
	public static ChromeDriver driver=null; 
	public static void broswerlaunch(Object[] inputparameters) 
	{
		String strBroswername=(String) inputparameters[0];
		String strExe=(String) inputparameters[1];
		

		System.setProperty(strBroswername, strExe);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void openApllication(Object[] inputparameters)
	{
		String path=(String) inputparameters[0];
		
		driver.get(path);
		
	}
	
	public static void clickonElement(Object[] inputparameters)
	{
		String path=(String) inputparameters[0];
		
		driver.findElement(By.xpath(path)).click();
	}
	
	public static void sendTextOnUi(Object[] inputparameters)
	{
		String path=(String) inputparameters[0];
		String text=(String) inputparameters[1];
		
		driver.findElement(By.xpath(path)).sendKeys(text);
	}
	

	public static void main(String[]args)
	{
		//broswerlaunch("webdriver.chrome.driver", "C:\\Local Disk D\\Automation Support\\chromedriver.exe");
		
		Object[] input1=new Object[2];
				input1[0]="webdriver.chrome.driver";
				input1[1]="C:\\Local Disk D\\Automation Support\\chromedriver.exe";
		
				SeleniumOpeartion.broswerlaunch(input1);
				
		
		//openApllication("https://www.amazon.in/");
				

				Object[] input2=new Object[1];
						input2[0]="https://www.amazon.in/";
					
					SeleniumOpeartion.openApllication(input2);	
				
				
				
				
		//clickonElement("(//*[@class='nav-line-1 nav-progressive-content'])[2]");
					

					Object[] input3=new Object[1];
							input3[0]="(//*[@class='nav-line-1 nav-progressive-content'])[2]";
						
						SeleniumOpeartion.clickonElement(input3);	
					
					
		//sendTextOnUi("//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']","9545172923");
						
						
						Object[] input4=new Object[2];
								input4[0]="//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']";
								input4[1]="9545172923";
						
								SeleniumOpeartion.sendTextOnUi(input4);
						
		//clickonElement("//*[@class='a-button-input']");
								

								Object[] input5=new Object[1];
										input5[0]="//*[@class='a-button-input']";
									
									SeleniumOpeartion.clickonElement(input5);		
								
								
		//sendTextOnUi("//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']", "Ganesh@123");
									

									Object[] input6=new Object[2];
											input6[0]="//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']";
											input6[1]="Ganesh@123";
									
											SeleniumOpeartion.sendTextOnUi(input6);		
									
									
									
									
		//clickonElement("(//*[@class='a-button-input'])[1]");
		
		

	       	Object[] input7=new Object[1];
				input7[0]="(//*[@class='a-button-input'])[1]";
			
			SeleniumOpeartion.clickonElement(input7);	
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
























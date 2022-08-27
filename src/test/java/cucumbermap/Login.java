package cucumbermap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOpeartion;

public class Login 
{

	@Given("user open Broswer with {string} and {string}")
	public void user_open_broswer_with_and(String string, String string2) 
	{
		Object[] input1=new Object[2];
		input1[0]="webdriver.chrome.driver";
		input1[1]="C:\\Local Disk D\\Automation Support\\chromedriver.exe";

		SeleniumOpeartion.broswerlaunch(input1);
		
	}

	@Given("user enter url {string}")
	public void user_enter_url(String string) 
	{

		Object[] input2=new Object[1];
				input2[0]="https://www.amazon.in/";
			
			SeleniumOpeartion.openApllication(input2);	
	}

	@When("user click on hello button")
	public void user_click_on_hello_button() 
	{

		Object[] input3=new Object[1];
				input3[0]="(//*[@class='nav-line-1 nav-progressive-content'])[2]";
			
			SeleniumOpeartion.clickonElement(input3);	
	}

	@When("user enter username as {string}")
	public void user_enter_username_as(String string) 
	{
		Object[] input4=new Object[2];
		input4[0]="//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']";
		input4[1]="9545172923";

		SeleniumOpeartion.sendTextOnUi(input4);
	}

	@When("user click on continue button")
	public void user_click_on_continue_button()
	{
		Object[] input5=new Object[1];
		input5[0]="//*[@class='a-button-input']";
	
	SeleniumOpeartion.clickonElement(input5);
	}

	@When("user enetr password as {string}")
	public void user_enetr_password_as(String string) 
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']";
		input6[1]="Ganesh@123";

		SeleniumOpeartion.sendTextOnUi(input6);		

	}

	@When("user click on sign button")
	public void user_click_on_sign_button() 
	{
		Object[] input7=new Object[1];
		input7[0]="(//*[@class='a-button-input'])[1]";
	
	SeleniumOpeartion.clickonElement(input7);	
	}

	@Then("Application shows user login successfully")
	public void application_shows_user_login_successfully() 
	{
		
		Object[] input8=new Object[2];
		        input8[0]="Hello, Ganesh";
		        input8[1]="//*[@id='nav-link-accountList-nav-line-1']";
		        
		        SeleniumOpeartion.validationByGetText(input8);
	}


}

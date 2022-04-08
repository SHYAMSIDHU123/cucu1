package Definition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefintion {
	WebDriver driver;
	@Given("I should be in the Login page of orangeHRM")
	public void i_should_be_in_the_login_page_of_orange_hrm() {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
	    driver = new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	   
	}
	@When("Enter Name")
	public void enter_name() {
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		
	   
	}
	@When("Enter Password")
	public void enter_password() {
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	   
	}
	@When("Click on LoginButton")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//*[@id= 'btnLogin']")).click();
	   
	}
	@Then("Login Sucessfully")
	public void login_sucessfully() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	    
	}




}

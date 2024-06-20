package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActitimeStepsForLogin {
	WebDriver driver;

	@Given("I navigate to actitime application")
	public void i_navigate_to_actitime_application() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@When("I click on login")
	public void i_click_on_login() {
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("I should navigate to actitime home page")
	public void i_should_navigate_to_actitime_home_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		driver.quit();
	}
}

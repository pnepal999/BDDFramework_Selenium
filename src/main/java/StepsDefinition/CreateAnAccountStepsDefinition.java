package StepsDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAnAccountStepsDefinition {

WebDriver driver;
	
	@Given("^user is already in login Page$")
	public void user_is_already_in_login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupa Acharya\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@When("^Title of log in page is Login My Store$")
	public void Title_of_log_in_page_is_Login_My_Store() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Login - My Store", title);
	}
	
	@Then("^user enter email$")
	public void user_enter_email(DataTable email) {
		List<List<String>> data = email.raw();
		driver.findElement(By.id("email_create")).sendKeys(data.get(0).get(0));
     }
	@Then("^user click on Create an account button$")
	public void user_click_on_Create_an_account_button(){
		 driver.findElement(By.id("SubmitCreate")).click();
	}
	@Then("^user enter personal details$")
	public void user_enter_personal_details(DataTable details) {
		
		List<List<String>> ddata = details.raw();
		driver.findElement(By.id("customer_firstname")).sendKeys(ddata.get(0).get(0));
		//driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(ddata.get(0).get(0));
		//driver.findElement(By.cssSelector("#customer_firstname")).sendKeys(ddata.get(0).get(0));
		//driver.findElement(By.css("#customer_firstname")).sendKeys(ddata.get(0).get(0));
		driver.findElement(By.id("customer_lastname")).sendKeys(ddata.get(0).get(1));
		driver.findElement(By.id("passwd")).sendKeys(ddata.get(0).get(2));
		driver.findElement(By.id("firstname")).sendKeys(ddata.get(0).get(3));
		driver.findElement(By.id("lastname")).sendKeys(ddata.get(0).get(4));
		driver.findElement(By.id("address1")).sendKeys(ddata.get(0).get(5));
		driver.findElement(By.id("city")).sendKeys(ddata.get(0).get(6));
		Select select = new Select(driver.findElement(By.id("id_state")));
		select.selectByVisibleText("Texas");
		driver.findElement(By.id("postcode")).sendKeys(ddata.get(0).get(8));
		driver.findElement(By.id("phone_mobile")).sendKeys(ddata.get(0).get(9));
		
	}

	@Then("^user click on register$")
	public void user_click_on_register() {
		driver.findElement(By.id("submitAccount")).click();
	    
	}

}

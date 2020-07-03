/*
 * package StepsDefinition;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * org.openqa.selenium.JavascriptExecutor; import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.interactions.Actions;
 * 
 * 
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When;
 * 
 * 
 * public class LoginStepsDefinition { WebDriver driver;
 * 
 * @Given("^user is alreay in login Page$") public void
 * user_is_already_in_login_Page() {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Users\\Rupa Acharya\\eclipse-workspace\\Drivers\\chromedriver.exe");
 * driver= new ChromeDriver(); driver.get(
 * "http://automationpractice.com/index.php?controller=authentication&back=my-account"
 * ); driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 * driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); }
 * 
 * @When("^Title of log in page is Login My Store$") public void
 * Title_of_log_in_page_is_Login_My_Store() { String title = driver.getTitle();
 * System.out.println(title); Assert.assertEquals("Login - My Store", title); }
 * 
 * @Then("^user maximize the page$") public void user_maximize_the_page() {
 * driver.manage().window().maximize();
 * 
 * }
 * 
 * @Then("^User enter \"(.*)\" and \"(.*)\"$") public void
 * User_enter_email_address_and_Password(String email,String pwd) {
 * driver.findElement(By.id("email")).sendKeys(email);
 * driver.findElement(By.id("passwd")).sendKeys(pwd);
 * 
 * }
 * 
 * @Then("^user click on Sign in button$") public void
 * user_click_on_Sign_in_button() {
 * driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
 * 
 * //driver.findElement(By.xpath("//i[@class='icon-lock left']") }
 * //i[@class='icon-lock left']
 * 
 * @Then ("^user is on Myaccount page$") public void user_is_on_Myaccount_page()
 * { String title = driver.getTitle();
 * System.out.println("Title of Myaccount page"+ title);
 * Assert.assertEquals("My account - My Store", title); }
 * 
 * @Then("^user click on home button$") public void user_click_on_home_button()
 * { driver.findElement(By.xpath("//i[@class='icon-home']")).click();
 * 
 * }
 * 
 * @Then("^user move to My Store page$") public void
 * user_move_to_My_Store_page() { String titleStore = driver.getTitle();
 * Assert.assertEquals("My Store", titleStore); JavascriptExecutor js =
 * (JavascriptExecutor)driver; js.executeScript("scroll(0,1100)");
 * 
 * 
 * }
 * 
 * //@Then("^user scroll down to Printed chiffon dress$") //public void
 * user_scroll_down_to_Printed_chiffon_dress() { //JavascriptExecutor js =
 * (JavascriptExecutor)driver; //js.executeScript("window.scrollby(0,1000)","");
 * 
 * 
 * 
 * 
 * @Then("^user click on add to card Printed chiffon dress$") public void
 * user_click_on_add_to_card_printed_chiffon_dress() { Actions action = new
 * Actions(driver); action.moveToElement(driver.findElement(By.xpath(
 * "//*[@id='homefeatured']/li[7]/div/div[1]/div/a[1]/img"))).build().perform();
 * driver.findElement(By.xpath(
 * "//*[@id='homefeatured']/li[7]/div/div[2]/div[2]/a[1]/span")).click();
 * 
 * }
 * 
 * @Then("^user click on Proceed to checkout button$") public void
 * user_click_on_Proceed_to_checkout_button() { WebElement submit
 * =driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
 * JavascriptExecutor js = (JavascriptExecutor)driver;
 * js.executeScript("arguments[0].click();",submit);
 * 
 * 
 * //driver.findElement(By.
 * xpath("//span[contains(text(),'Proceed to checkout')]")).click();
 * //span[contains(text(),'Proceed to checkout')] //a[@title='Proceed to
 * checkout'] }
 * 
 * @Then("^user click on checkout button from summery page$") public void
 * user_click_on_checkout_button_from_summery_page() {
 * driver.findElement(By.linkText("Proceed to checkout")).click(); //WebElement
 * submit =driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
 * //JavascriptExecutor js = (JavascriptExecutor)driver;
 * //js.executeScript("arguments[0].click();",submit); }
 * 
 * @Then("^user click on proceed to checkout button on address page$") public
 * void user_click_on_proceed_to_checkout_button_on_address_page() {
 * driver.findElement(By.name("processAddress")).click(); //WebElement submit
 * =driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
 * //JavascriptExecutor js = (JavascriptExecutor)driver;
 * //js.executeScript("arguments[0].click();",submit);
 * 
 * }
 * 
 * @Then("^user check the button and click on proceed to checkout on shipping page$"
 * ) public void
 * user_check_the_button_and_click_on_proceed_to_checkout_on_shipping_page() {
 * driver.findElement(By.id("cgv")).click();
 * driver.findElement(By.name("processCarrier")).click();
 * 
 * 
 * }
 * 
 * @Then("^user click on pay by bank wire on payment page$") public void
 * user_click_on_pay_by_bank_wire_on_payment_page() {
 * driver.findElement(By.xpath("//a[@class='bankwire']")).click(); }
 * 
 * @Then("^user click on confirmed the order on payemnt page$") public void
 * user_click_on_confirmed_the_order_on_payemnt_page() {
 * driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]"))
 * .click(); }
 * 
 * @Then("^order confirmation page will be displayed$") public void
 * order_confirmation_page_will_be_displayed() { String title
 * =driver.getTitle(); Assert.assertEquals("Order confirmation - My Store",
 * title);
 * 
 * }
 * 
 * @Then ("^user closed the broswer$") public void user_closed_the_broswer() {
 * driver.quit(); } }
 */
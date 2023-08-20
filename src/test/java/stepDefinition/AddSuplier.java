package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Mouse;
import org.testng.Reporter;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddSuplier {
	WebDriver driver;
	JavascriptExecutor js;
	
	@Given("^user launch url \"([^\"]*)\" in Browser$")
	public void user_launch_url_in_Browser(String url) {
		driver= new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(url);
	}
	
	@When("^user Enter userName \"([^\"]*)\" and passWord \"([^\"]*)\"$")
	public void user_Enter_userName_and_passWord(String userName, String passWord) {
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passWord);
	}
	
	@When("^user click login button,Add new record\\?,Add succeeded$")
	public void user_click_login_button_Add_new_record_Add_succeeded() {
		driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();
	}

	@When("^user click on supplier button$")
	public void user_click_on_supplier_button() throws Throwable {
		driver.findElement(By.xpath("(//a[@href='a_supplierslist.php'][normalize-space()='Suppliers'])[2]")).click();
	}

	@When("^user click on AddSupplier button$")
	public void user_click_on_AddSupplier_button()  {
		driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-plus ewIcon'])[2]")).click();
	}

	@When("^user Enter Supplier Name\"([^\"]*)\"$")
	public void user_Enter_Supplier_Name(String supplierName) throws Throwable {
		driver.findElement(By.xpath("//input[@id='x_Supplier_Name']")).sendKeys(supplierName);
	}

	@When("^user Enter Address \"([^\"]*)\"$")
	public void user_Enter_Address(String Address) throws Throwable {
		driver.findElement(By.xpath("//textarea[@id='x_Address']")).sendKeys(Address);
	}

	@When("^user Enter City \"([^\"]*)\"$")
	public void user_Enter_City(String City) throws Throwable {
		driver.findElement(By.xpath("//input[@id='x_City']")).sendKeys(City);
	}

	@When("^user Enter Country \"([^\"]*)\"$")
	public void user_Enter_Country(String Country) throws Throwable {
		driver.findElement(By.xpath("//input[@id='x_Country']")).sendKeys(Country);
	}

	@When("^user Enter Contact Person \"([^\"]*)\"$")
	public void user_Enter_Contact_Person(String ContactPerson) throws Throwable {
		driver.findElement(By.xpath("//input[@id='x_Contact_Person']")).sendKeys(ContactPerson);
	}

	@When("^user Enter Phone Number \"([^\"]*)\"$")
	public void user_Enter_Phone_Number(String PhoneNumber) throws Throwable {
		driver.findElement(By.xpath("//input[@id='x_Phone_Number']")).sendKeys(PhoneNumber);
	}

	@When("^user Enter Email \"([^\"]*)\"$")
	public void user_Enter_Email(String Email) throws Throwable {
		driver.findElement(By.xpath("//input[@id='x__Email']")).sendKeys(Email);
	}

	@When("^user Enter Mobile Number \"([^\"]*)\"$")
	public void user_Enter_Mobile_Number(String MobileNumber) throws Throwable {
		driver.findElement(By.xpath("//input[@id='x_Mobile_Number']")).sendKeys(MobileNumber);
	}

	@When("^user Enter Notes \"([^\"]*)\"$")
	public void user_Enter_Notes(String Notes) throws Throwable {
		driver.findElement(By.xpath("//textarea[@id='x_Notes']")).sendKeys(Notes);
		//driver.findElement(By.name("btnAction")).click();
		}
	
	@When("^user Click on Add button$")
	public void user_Click_on_Add_button() throws Throwable {
		js=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector(\"#btnAction\").click()");
	}

	@When("^user Move to Aleart Window and accept$")
	public void user_Move_to_Aleart_Window_and_accept() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
		

	}

	@When("^user verify suppilier Addition$")
	public void user_verify_suppilier_Addition() throws Throwable {
	    String Expected="Add";
	    String Actual=driver.findElement(By.xpath("//div[@class='alert alert-success ewSuccess']")).getText();
	    if (Actual.toLowerCase().contains(Expected.toLowerCase())) {
	    	Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
			Reporter.log("Supplier Addition Success::::"+Expected+"     "+Actual,true);
	    	//.out.println("Supplier Addition Success"+Expected+"  "+Actual);
			
		} else {
			driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
			Reporter.log("Supplier Addition Fail::::"+Expected+"     "+Actual,true);

		}
	    
	}

	@Then("^close Browser$")
	public void close_Browser()  {
	    driver.quit();
	}



}

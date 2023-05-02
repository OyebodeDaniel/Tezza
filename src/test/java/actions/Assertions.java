package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.NavigateToURL;
import pages.StartBrowser;
import pages.TezzaPageObject;
import pages.URL;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Assertions {
	private static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {
		StartBrowser openConnection = new StartBrowser(driver);
		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void RegistrationsPageAssertions() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		TezzaPageObject tezzaPageObject = new TezzaPageObject(driver);

		startWebsite.launchURL();

		SoftAssert softassert = new SoftAssert();
		String ExpectedTitle = "Register";
		String ExpectedEmailMessage = "Submit";
		String ActualTitle = driver.getTitle();
		String ActualEmailMessage = driver.findElement(new By.ByXPath("//button[@id='submitbtn']")).getAttribute("type");
		System.out.println("The title Page is "+ActualTitle);
		System.out.println("There is a : "+ActualEmailMessage +"button on the register page" );
		softassert.assertEquals(ActualTitle, ExpectedTitle);

		//Required fields on the Register Screen
		softassert.assertTrue(driver.findElement(new By.ByXPath("//input [@placeholder ='First Name']")).isDisplayed());
		System.out.println("There is a Firstname Field");

		softassert.assertTrue(driver.findElement(new By.ByXPath("//input [@placeholder ='Last Name']")).isDisplayed());
		System.out.println("There is a LastName Field");

		softassert.assertTrue(driver.findElement(new By.ByXPath("//textarea [@ng-model ='Adress']")).isDisplayed());
		System.out.println("There is an Address Field");

		softassert.assertTrue(driver.findElement(new By.ByXPath("//input[@type ='email']")).isDisplayed());
		System.out.println("There is an Email Field");

		softassert.assertTrue(driver.findElement(new By.ByXPath("//input [@type ='tel' and @ng-model='Phone']")).isDisplayed());
		System.out.println("There is a Phone Number Field");

		softassert.assertTrue(driver.findElement(new By.ByXPath("//input[@value ='Male' and @name = 'radiooptions']")).isDisplayed());
		System.out.println("There are Gender options");




	}
	@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Registration Test Page Passed");
	}

}







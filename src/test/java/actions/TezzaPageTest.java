package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TezzaPageTest {
	private static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);
		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void RegisterPageTest() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();

		TezzaPageObject tezzaPageObject= new TezzaPageObject(driver);

		String ExpectedTitle = "Register";
		String ActualTitle = driver.getTitle();
		System.out.println("The title of the Page is : "+ActualTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle );

		tezzaPageObject.RegisterScreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickFirstName();
		tezzaPageObject.ClearFirstName();
		tezzaPageObject.EnterFirstName("John");

		tezzaPageObject.ClickLastName();
		tezzaPageObject.ClearLastName();
		tezzaPageObject.EnterLastName("Doe");

		String ExpectedEmailMessage = "Provide a valid email id for further updates";
		String ActualEmailMessage = driver.getTitle();
		System.out.println("The title of the Page is : "+ActualTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle );

		tezzaPageObject.ClickAddress();
		tezzaPageObject.ClearAddress();
		tezzaPageObject.EnterAddress("Ul Okopowa");

		tezzaPageObject.ClickEmail();
		tezzaPageObject.ClearEmail();
		tezzaPageObject.EnterEmail("temp@gmail.com");

		tezzaPageObject.ClickPhone();
		tezzaPageObject.ClearPhone();
		tezzaPageObject.EnterPhone("09078675643");

		tezzaPageObject.ClickMale();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickMovies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickLanguage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ScrollDownPage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickEnglish();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickSkillNav();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickSkills();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickAPIs();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickCountry();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickCountrydropdown();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickSelectCountry();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickSearchCountry();
		tezzaPageObject.ClearSearchCountry();
		tezzaPageObject.EnterSearchCountry("Japan");

		tezzaPageObject.ClickJapan();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickYear();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickSelectYear();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickMonth();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickSelectMonth();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickDay();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickSelectDay();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ScrollUpPage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickChooseFile();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ScrollDownPage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		tezzaPageObject.ClickSubmitBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Registration Test Page Passed");
	}

}







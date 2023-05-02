package pages;

import org.apache.poi.hssf.record.CountryRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TezzaPageObject {


	private By registerScreen = By.xpath("//h2[contains(text(),'Register')]");
	private By firstName = By.xpath("//input [@placeholder ='First Name']");
	private By lastName = By.xpath("//input [@placeholder ='Last Name']");
	private By address = By.xpath("//textarea [@ng-model ='Adress']");
	private By email = By.xpath("//input[@type ='email']");
	private By phone = By.xpath("//input [@type ='tel' and @ng-model='Phone']");
	private By maleGender = By.xpath("//input[@value ='Male' and @name = 'radiooptions']");
	private By movie = By.xpath("//input[@id='checkbox2']");
	private By language = By.xpath("//div[@id='msdd']");
	private By englishLanguage = By.xpath("//a[contains(text(),'English')]");
	private By skills = By.xpath("//select[@id='Skills']");
	private By apis = By.xpath("//option[contains(text(),'APIs')]");
	private By countries = By.xpath("//select[@id='countries']");
	private By selectcounty = By.xpath("//option[contains(text(),'Select Country')]");

	private By selectCountries = By.xpath("//span [@role = 'combobox']");
	private By searchCountry = By.xpath("//input [@type = 'search' and @role ='textbox']");
	private By year = By.xpath("//select[@id='yearbox']");
	private By selectYear = By.xpath("//option[contains(text(),'1923')]");
	private By month = By.xpath("//select [@placeholder = 'Month' and @ng-model ='monthbox']");
	private By selectMonth = By.xpath("//option[contains(text(),'September')]");
	private By day = By.xpath("//select[@id='daybox']");
	private By selectDay = By.xpath("//option [@value ='17']");
	private By password = By.xpath("//input[@id='firstpassword']");
	private By confirmPassword = By.xpath("//input[@id='secondpassword']");
	private By submitBtn = By.xpath("//button[@id='submitbtn']");
	private By uploadImage = By.xpath("//input[@id='imagesrc']");
	private By japan = By.xpath("//li[contains(text(),'Japan')]");
	private By skillNav = By.xpath("//label[contains(text(),'Skills')]");


	private WebDriver driver;

	public void ScrollUpPage() {
		//JavascriptExecutor ObjectName = (JavascriptExecutor) webdriver;
		JavascriptExecutor js = (JavascriptExecutor) driver;//Launches the javascriptexecutor
		js.executeScript("window.scrollBy(0, -1000)");
	}

	public void ScrollDownPage() {
		//JavascriptExecutor ObjectName = (JavascriptExecutor) webdriver;
		JavascriptExecutor js = (JavascriptExecutor) driver;//Launches the javascriptexecutor
		js.executeScript("window.scrollBy(0, +1000)");
	}

	public TezzaPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void RegisterScreen() {
		try {
			driver.findElement(registerScreen).isDisplayed();
			System.out.println("The Register screen is displayed to user");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickFirstName() {
		try {
			driver.findElement(firstName).click();
			System.out.println("The FirstName field was clicked");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearFirstName() {

		try {
			driver.findElement(firstName).clear();
			System.out.println("The FirstName field was Cleared");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterFirstName(String text) {
		try {
			driver.findElement(firstName).sendKeys(text);
			System.out.println("Text was entered into the FirstName field");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickLastName() {
		try {
			driver.findElement(lastName).click();
			System.out.println("The LastName field was clicked");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearLastName() {

		try {
			driver.findElement(lastName).clear();
			System.out.println("The LastName field was Cleared");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterLastName(String text) {
		try {
			driver.findElement(lastName).sendKeys(text);
			System.out.println("Text was entered into the LastName field");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickAddress() {
		try {
			driver.findElement(address).click();
			System.out.println("The Address field was clicked");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearAddress() {

		try {
			driver.findElement(address).clear();
			System.out.println("The Address field was Cleared");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterAddress(String text) {
		try {
			driver.findElement(address).sendKeys(text);
			System.out.println("Text was entered into the address field");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickEmail() {
		try {
			driver.findElement(email).click();
			System.out.println("The email field was clicked");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearEmail() {

		try {
			driver.findElement(email).clear();
			System.out.println("The email field was Cleared");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterEmail(String text) {
		try {
			driver.findElement(email).sendKeys(text);
			System.out.println("Text was entered into the email field");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickPhone() {
		try {
			driver.findElement(phone).click();
			System.out.println("The Phone Number field was clicked");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearPhone() {

		try {
			driver.findElement(phone).clear();
			System.out.println("The Phone Number field was Cleared");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterPhone(String text) {
		try {
			driver.findElement(phone).sendKeys(text);
			System.out.println("Text was entered into the Phone Number field");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickMale() {
		try {
			driver.findElement(maleGender).click();
			System.out.println("The Male Gender option was Selected");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickMovies() {
		try {
			driver.findElement(movie).click();
			System.out.println("The Movie option was selected");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickLanguage() {
		try {
			driver.findElement(language).click();
			System.out.println("The Language field was clicked");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSkillNav() {
		try {
			driver.findElement(skillNav).click();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickEnglish() {
		try {
			driver.findElement(englishLanguage).click();
			System.out.println("English Language was selected");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSkills() {
		try {
			driver.findElement(skills).click();
			System.out.println("The skills field was clicked");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickAPIs() {
		try {
			driver.findElement(apis).click();
			System.out.println("The APIs option was selected from the skills drop-down field");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickCountry() {
		try {
			driver.findElement(countries).click();
			System.out.println("The Country field was clicked");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickCountrydropdown() {
		try {
			driver.findElement(selectcounty).click();
			System.out.println("An option was selected from the Select Country field");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSelectCountry() {
		try {
			driver.findElement(selectCountries).click();
			System.out.println("The select country drop-down field was clicked");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSearchCountry() {
		try {
			driver.findElement(searchCountry).click();
			System.out.println("The Search field was clicked");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearSearchCountry() {

		try {
			driver.findElement(searchCountry).clear();
			System.out.println("The Search field was cleared");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterSearchCountry(String text) {
		try {
			driver.findElement(searchCountry).sendKeys(text);
			System.out.println("Text was entered into the search field");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickJapan() {
		try {
			driver.findElement(japan).click();
			System.out.println("The country Japan was selected");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickYear() {
		try {
			driver.findElement(year).click();
			System.out.println("The Year drop-down field was clicked ");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSelectYear() {
		try {
			driver.findElement(selectYear).click();
			System.out.println("An option was selected from the year drop down field ");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickMonth() {
		try {
			driver.findElement(month).click();
			System.out.println("The month drop-down field was clicked ");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSelectMonth() {
		try {
			driver.findElement(selectMonth).click();
			System.out.println("An option was selected from the month drop down field ");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickDay() {
		try {
			driver.findElement(day).click();
			System.out.println("The Day drop-down field was clicked ");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSelectDay() {
		try {
			driver.findElement(selectDay).click();
			System.out.println("An option was selected from the day drop down field ");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickPassword() {
		try {
			driver.findElement(password).click();
			System.out.println("The Password field was clicked");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearPassword() {

		try {
			driver.findElement(password).clear();
			System.out.println("The Password field was cleared");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterPassword(String text) {
		try {
			driver.findElement(password).sendKeys(text);
			System.out.println("Text was entered into the password field");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickConfirmPassword() {
		try {
			driver.findElement(confirmPassword).click();
			System.out.println("The Confirm Password field was clicked");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearConfirmPassword() {

		try {
			driver.findElement(confirmPassword).clear();
			System.out.println("The confirm password field was cleared");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterConfirmPassword(String text) {
		try {
			driver.findElement(confirmPassword).sendKeys(text);
			System.out.println("Text was entered into the confirm password field");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickChooseFile() {
		try {
			driver.findElement(uploadImage).sendKeys("C:/Users/Oyebo/OneDrive/Documents/UI_Automation/Tezza/UploadFiles");
			System.out.println("An Image was uploaded");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSubmitBtn() {
		try {
			driver.findElement(submitBtn).click();
			System.out.println("The Submit button was clicked");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public void Alert() {
		try {
			driver.findElement(firstName).click();
			System.out.println("The FirstName field was clicked");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}


}









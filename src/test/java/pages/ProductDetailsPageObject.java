package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPageObject {

	private By productItem = By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");
	private By addToCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	private By removeFromCard = By.xpath("//button[@id='remove-sauce-labs-backpack']");
	private By addedToCart = By.xpath("//span[contains(text(),'1')]");
	private By cartBtn = By.xpath("//a [@class = 'shopping_cart_link']");
	private By cartScreen = By.xpath("//span[contains(text(),'Your Cart')]");
	private By checkOut = By.xpath("//button[@id='checkout']");
	private By firstName = By.xpath("//input[@id='first-name']");
	private By lastName = By.xpath("//input[@id='last-name']");
	private By postalCode = By.xpath("//input[@id='postal-code']");
	private By continueBtn = By.xpath("//input[@id='continue']");
	private By checkOutOverview = By.xpath("//span[contains(text(),'Checkout: Overview')]");
	private By finishBtn = By.xpath("//button[@id='finish']");
	private By orderSuccessful = By.xpath("//h2[contains(text(),'Thank you for your order!')]");
	private By backHomeBtn = By.xpath("//button[@id='back-to-products']");


	private WebDriver driver;

	public ProductDetailsPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void ClickProductItem() {
		try{
			driver.findElement(productItem).click();
			System.out.println("A Product was selected");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ProductDetailsScreen() {
		try{
			driver.findElement(productItem).isDisplayed();
			System.out.println("The Product Details screen is displayed");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickAddToCart() {
		try{
			driver.findElement(addToCart).click();
			System.out.println("The Add to Cart button was clicked");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void Remove() {
		try{
			driver.findElement(removeFromCard).isDisplayed();
			System.out.println("The Add to cart button changes to Remove");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	public void ClickRemove() {
		try{
			driver.findElement(removeFromCard).click();
			System.out.println("The Remove button was clicked");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void AddedToCard() {
		try{
			driver.findElement(addedToCart).isDisplayed();
			System.out.println("One product is added to cart");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickAddedToCart() {
		try{
			driver.findElement(addedToCart).click();
			System.out.println("The Cart button was clicked");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void CartScreen() {
		try{
			driver.findElement(cartScreen).isDisplayed();
			System.out.println("Your Cart screen is displayed");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickCheckOut() {
		try{
			driver.findElement(checkOut).click();
			System.out.println("The checkout button was clicked");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickFirstName() {
		try{
			driver.findElement(firstName).click();
			System.out.println("The first name field was clicked");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearFirstName() {
		try{
			driver.findElement(firstName).clear();
			System.out.println("The first name field was cleared");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterFirstName(String text) {
		try{
			driver.findElement(firstName).sendKeys(text);
			System.out.println("Data was entered into the first name field");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickLastName() {
		try{
			driver.findElement(lastName).click();
			System.out.println("The last name field was clicked");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearLastName() {
		try{
			driver.findElement(lastName).clear();
			System.out.println("The last name field was cleared");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterLastName(String text) {
		try{
			driver.findElement(lastName).sendKeys(text);
			System.out.println("Data was entered into the last name field");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickPostalCode() {
		try{
			driver.findElement(postalCode).click();
			System.out.println("The postal code field was clicked");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearPostalCode() {
		try{
			driver.findElement(postalCode).clear();
			System.out.println("The postal code field was cleared");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterPostalCode(String text) {
		try{
			driver.findElement(postalCode).sendKeys(text);
			System.out.println("Data was entered into the Postal code field");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickContinueBtn() {
		try{
			driver.findElement(continueBtn).click();
			System.out.println("The continue button was clicked");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void CheckOutOverview() {
		try{
			driver.findElement(checkOutOverview).isDisplayed();
			System.out.println("The Checkout Over screen is displayed");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickFinishBtn() {
		try{
			driver.findElement(finishBtn).click();
			System.out.println("The Finish button was clicked");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void OrderSuccessful() {
		try{
			driver.findElement(orderSuccessful).isDisplayed();
			System.out.println("A Success screen is displayed");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickBackHomeBtn() {
		try{
			driver.findElement(backHomeBtn).click();
			System.out.println("The Back Home button was clicked");
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
}








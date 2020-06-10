package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class ajioStep {
	ChromeDriver driver;
	@Given("Open browser")
	public void openBrowser() {	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver (2).exe");
	    driver=new ChromeDriver();
		
	}
	
	@Given("Load ajio url")
	public void loadurl() throws InterruptedException {
		driver.get("https://www.ajio.com/shop/women");
		Thread.sleep(2000);
	}
	
	
	@And("Mouseover on Women, CATEGORIES and click on Kurtas")
	public void mouseoverWomen() throws InterruptedException {
		WebElement women = driver.findElementByXPath("//a[text()='WOMEN']");		
		 
		Actions bulider = new Actions(driver);
		bulider.moveToElement(women).perform();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[text()='Kurtas'])[2]").click();
		//driver.findElementByXPath("//a[text()='CATEGORIES']").click();	
		//driver.findElementByXPath("//a[text()='Kurtas']").click();
		//bulider.moveToElement(cate).perform();
		//bulider.moveToElement(kurtas).perform();
	}
	
	@And("Click on Brands and choose Ajio")
	public void clickBrands()
	{
		driver.findElementByXPath("//span[text()='brands']").click();
		driver.findElementByXPath("//label[@class='facet-linkname facet-linkname-brand facet-linkname-AJIO']").click();
	}
	
	@And("Check all the results are Ajio")
	public void checkResultAJIO()
	{
		int brandSize = 0;
		List<WebElement> brands = driver.findElementsByXPath("//div[@class='brand']");
		System.out.println(brands.size());
		for(WebElement eachBrand : brands)
		{
			if (eachBrand.getText().equalsIgnoreCase("AJIO")) 
			{
				brandSize = brandSize+1;
				
			}			
		}
		System.out.println(brandSize);
		if(brandSize==brands.size())
		{
			System.out.println("All the brands are ajio oly");
		}
		else
		{
			System.out.println("All the brands are not ajio");
		}
	}
	@And("Set Sort by the result as Discount")
	public void sortByAsDistcount()
	{
		WebElement sort = driver.findElementByXPath("//div[@class='filter-dropdown']//select");
		Select sortBy = new Select(sort);
		sortBy.selectByVisibleText("Discount");
	}
	@And("Select the first product")
	public void selectfirstProduct()
	{
		driver.findElementByXPath("//div[@class='ReactVirtualized__Grid__innerScrollContainer']/div").click();
	}
	@And("Select the Color and click ADD TO BAG")
	public void selectColorClickAddToBag()
	{
		Set<String> window = driver.getWindowHandles();
		List<String> ww = new ArrayList<String>(window);
		driver.switchTo().window(ww.get(1));
		
		
		driver.findElementByXPath("(//a[@class='swatch-item'])[2]").click();
		driver.findElementByXPath("//span[text()='ADD TO BAG']");
		
	}
	@And("Verify the error message Select your size to know your estimated delivery date")
	public void verifyErrorMsg()
	{
		String errorMsg = "Select your size to know your estimated delivery date.";
		String msg = driver.findElementByXPath("//span[@class='edd-pincode-msg-details']").getText();
		System.out.println(msg);
		if(errorMsg.equalsIgnoreCase(msg))
		{
			System.out.println("Verifed , Error Msg is Displayed");
		}
		else
		{
			System.out.println("Error Msg is not displayed");
		}
	}
	@And("Select size and click ADD TO BAG")
	public void selectSize() throws InterruptedException
	{
		driver.findElementByXPath("(//div[@class='size-variant-block'])/div[1]").click();
		driver.findElementByXPath("//span[text()='ADD TO BAG']");
		Thread.sleep(3000);
	}
	
	@And("click on Enter pin-code to know estimated delivery date")
	public void pincode()
	{
		driver.findElementByXPath("//span[text()='Enter Pin-code To Know Estimated Delivery Date']").click();
		driver.findElementByXPath("//input[@ class='edd-pincode-modal-text']").sendKeys("603103");
		driver.findElementByXPath("//button[@class=\"edd-pincode-modal-submit-btn\"]").click();
	}
	@And("Print the message and click Go to  Bag")
	public void printMsgAndClickGoTOBag() throws InterruptedException
	{
		String msg = driver.findElementByXPath("(//ul[@class='edd-message-success-details']//li)[1]").getText();
		System.out.println("The message after entering pincode is: "+msg);
		
		driver.findElementByXPath("//span[text()='GO TO BAG']").click();
		Thread.sleep(3000);
	}
	
	@And(" Click on Proceed to Shipping and clode the browser")
	public void proceedShippingCloseBrowser()
	{
		driver.findElementByClassName("rilrtl-button button shipping-button").click();
		driver.quit();
	}
	
	
	
	

}

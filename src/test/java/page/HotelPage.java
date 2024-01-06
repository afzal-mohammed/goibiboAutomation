package page;

import static org.junit.Assert.assertEquals;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelPage extends CommonPage {

	public HotelPage() {
		super(false);
	}

	By whereField = By.xpath("//input[@data-testid='home-autosuggest-input']");
	By selectSearch = By.xpath("//button[@data-testid='searchHotelBtn']");

	public void openGoibiboWebsiteForHotel() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.goibibo.com/flights/");

		WebElement xButton = driver.findElement(By.xpath("//div[@data-id='auth-flow-section']//span[1]"));
		xButton.click();

		WebElement selectHotel = driver.findElements(By.xpath("//a[@class='nav-link .']")).get(0);
		selectHotel.click();
	}

	public void enterWhereLocation() throws InterruptedException {

		driver.findElement(whereField).sendKeys("Goa");
		Thread.sleep(1000);
		WebElement selectDropdown = driver.findElements(By.xpath("//span[contains(text(), 'Goa')]")).get(0);
		selectDropdown.click();
		driver.findElement(selectSearch).click();

	}

	public boolean verifyHotelSearch() {

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.goibibo.com/hotels/find-hotels-in-Goa,%20India/8717279093827200968/8717279093827200968/%7B%22ci%22:%2220240111%22,%22co%22:%2220240112%22,%22r%22:%221-2-0%22%7D/?{%22filter%22:{}}&sec=dom&cc=IN&locusId=CTGOI&locusType=city&cityCode=CTGOI";

		assertEquals(expectedUrl, actualUrl);
		return false;

	}
}

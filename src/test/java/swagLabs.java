import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class swagLabs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SV110696\\Documents\\ChromeDriverSelenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//System.out.println(driver.getTitle());
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		System.out.println("Products:");
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='inventory_container']//div//div//div//div//div[@class='inventory_item_description']//div//a[@href='#']"));
		for(WebElement element : elements) {
			System.out.println(element.getText());
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click();
		driver.quit();

	}

}

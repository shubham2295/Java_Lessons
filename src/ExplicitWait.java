import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://timhortons.ca");
		
		WebDriverWait wait = new WebDriverWait (driver, 15);
		
		WebElement button = driver.findElement(By.id("submit"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("hello")));
		button.click();
	}
}

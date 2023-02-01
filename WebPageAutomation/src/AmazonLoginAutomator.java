import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginAutomator {
	public static void main(String[] args) throws InterruptedException {
		/* UseCase:
		 *  1. Visiting amazon web-page
		 *  2. Clicking on SignIn button
		 *  3. Inputing Login Credentials
		 *	4. Click on Submit button
		 *  5. Printing out to console about Login being a Success or Failure
		 */
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver amazonWebDriver = new ChromeDriver();
		amazonWebDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		amazonWebDriver.get("https://www.amazon.com/");
		amazonWebDriver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']/div[1]")).click();
		System.out.print("By using Selenium, you clicked the 'Sign In' button of the Amazon website and now you are on the 'Sign In' page now!");
		amazonWebDriver.close();//to close the browser opened by selenium
	}
}

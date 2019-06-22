package CucumberReport;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {
	@Test
	public void main() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\tools\\chromedriver.exe");
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		System.out.println("Present Project Directory : "+ System.getProperty("user.dir")+"\\tools\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}

}

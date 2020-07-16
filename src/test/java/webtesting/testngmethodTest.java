package webtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testngmethodTest {

	
	@Test
	public  void method1() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hello2");;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://yahoo.com");
		
		Thread.sleep(4000);
		
		driver.close();
		driver.quit();
		
	}

}

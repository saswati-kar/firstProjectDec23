package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
//import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import junit.framework.Assert;

public class LearnLogin {

	WebDriver driver;

	// Element list - By type
	By USER_NAME_FIELD = By.xpath("//*[@id=\"user_name\"]");
	By PASSWORD_FIELD = By.xpath("//*[@id=\"password\"]");
	By SIGNIN_BUTTON_FIELD = By.xpath("//*[@id=\"login_submit\"]");
	By DASHBOARD_HEADER_FIELD = By.xpath("//strong[text()='Dashboard']");

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saswati Kar\\Desktop\\Selenium\\session3\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void testLogin() throws InterruptedException {

		// type name = value
		// Element list - WebElement
		System.out.println("aaaaa");
		WebElement USER_NAME_ELEMENT = driver.findElement(By.id("user_name"));
		System.out.println("bbbbb");
		WebElement PASSWORD_ELEMENT = driver.findElement(By.id("password"));
	
		//WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

//		driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("demo@codefios.com");
		//driver.findElement(USER_NAME_FIELD).sendKeys("demo@codefios.com");
//		USER_NAME_ELEMENT.sendKeys("sdlfjaskdf");
//		Thread.sleep(2000);
//		USER_NAME_ELEMENT.clear();
		USER_NAME_ELEMENT.sendKeys("demo@codefios.com");
		PASSWORD_ELEMENT.sendKeys("abc123");
		System.out.println("ccccc");
		//SIGNIN_BUTTON_ELEMENT.click();

		/*WebElement DASHBOARD_HEADER_ELEMENT = driver.findElement(By.xpath("//strong[text()='Dashboard']"));
//		Assert.assertTrue("Dashboard page not found!!", DASHBOARD_HEADER_ELEMENT.isDisplayed());
		Assert.assertTrue("Dashboard page not found!!", driver.findElement(DASHBOARD_HEADER_FIELD).isDisplayed());*/

	}

}
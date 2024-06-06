package learntestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class xml {
	WebDriver driver;
	@Parameters({"browserName","url"})
	@BeforeMethod
public void precondtion(String browserName,String url) throws InterruptedException {
	if(browserName.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(url);
}
@AfterMethod
public void postcondition() {
	driver.manage().window().minimize();
	driver.quit();
}
@Parameters({"username","password"})
@Test
public void loginPage(String username,String password) {
	WebElement emailTextfield=driver.findElement(By.name("username"));
	WebElement passwordTextfield=driver.findElement(By.name("password"));
	emailTextfield.sendKeys(username);
	passwordTextfield.sendKeys(password);
}

}

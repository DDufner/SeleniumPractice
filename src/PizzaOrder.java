import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.chrono.AbstractChronology;

//import com.sun.java.util.jar.pack.DriverResource;

import java.util.concurrent.TimeUnit;

public class PizzaOrder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/dominickdufner/eclipse-workspace/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("1: Pizza Order Test Started");
		///Step 1
		driver.get("https://www.dominos.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("2: Loading Page Wait Completed");
		///Step 2
		for(int i=0; i<=2; i++) {
			try {
				driver.findElement(By.xpath("//*[contains(text(),'sign in & earn rewards')]")).click();
				break;
			}
			catch(Exception a) {
				Sysout(a.getMessage());
				System.out.println("	EXCEPTION: Login Click attemped "+(i+1)+" time(s)");
			}
		}
		System.out.println("3: Login Clicked");
		///Step 3
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("finlockertestdd+dominos@gmail.com"); 
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Spider1234!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("4: Login credentials entered");
		///Step 4
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[text()='Order Online']")).click();
		//driver.findElement(By.xpath("//li/a[contains(text(), 'Order Online')]")).click();
		driver.get("https://www.dominos.com/en/pages/order/");
		driver.findElement(By.xpath("//span[contains(@class,'circ-icons__icon--carryout')]")).click();
		
		driver.findElement(By.xpath("//input[@id='Postal_Code_Sep']")).sendKeys("63116");
		System.out.println("5: Carry out zip code entered");
		///Step 5
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2000); 
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-quid=\'locator-search-button']")));
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		System.out.println("6: Carry out address searched for");
		///Step 6
		Thread.sleep(2000); 
		System.out.println("Pizza Order Test Completed");
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		//driver.close();
		
	}

	private static void Sysout(String message) {
		// TODO Auto-generated method stub
		
	}

}

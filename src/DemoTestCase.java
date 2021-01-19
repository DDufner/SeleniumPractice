import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BasicClass testClass = new BasicClass();
		//testClass.validateHeader();
		
		System.out.println("test started");
		
		//System.setProperty("webdriver.chrome.driver", "/Users/dominickdufner/eclipse-workspace/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/dominickdufner/eclipse-workspace/geckodriver");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.bloody-disgusting.com");
		System.out.println(driver.getTitle());
		
		//NOTE: test using auto-generated x-path
		//System.out.println(testClass.validateHeader());
		/*driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/header/nav/div[2]/div/div/div/div/div[1]/div/div/div[2]/div/div/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/header/nav/div[2]/div/div/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys("Mandy");
		driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/div/div/div/div[1]/div/ul/li[1]/a/div/div[1]/img[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/div[2]/div/button/div/svg/path")).click();
		driver.close();*/ 
		
		
		//Xpath:  //TagName[@attribute='value']  so... By.expath(TagName[@attribute='value'])
		//CSSPath: TagName[attribute='value'] so...  By.cssSelector(TagName[attribute='value'])
		
		//driver.findElement(By.xpath("//div[@class='mvp-nav-bot-right left relative']")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/header/nav/div[2]/div/div/div/div/div[2]/span")).click();
		//driver.findElement(By.xpath("span.mvp-nav-search-but fa fa-search fa-2 mvp-search-click")).click();
		
		driver.findElement(By.xpath("//input[@id='s']")).sendKeys("Mandy");
		driver.findElement(By.xpath("//input[@id='s']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"mvp-main-body-wrap\"]/div/div/div/div/div[1]/div/ul/li[1]/a/div/div[2]/div/h2")).click();
		
		///html/body/div[3]/div[3]/div[2]/div/div/div/div/div/div[1]/div/ul/li[1]/a/div/div[2]/div/h2
		System.out.println("Test script completed");
	}
 

}
 
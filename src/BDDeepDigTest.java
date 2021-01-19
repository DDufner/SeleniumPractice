import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByChained;

public class BDDeepDigTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/dominickdufner/eclipse-workspace/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		//WebElement PodcastBox = driver.findElement(By.xpath("//iframe[@src='https://embed.acast.com/horror-queers']"));
		//WebElement PodcastPlayButton = driver.findElement(By.xpath("//div/button"));
		//WebElement PocastButtonClick = 
		By PodcastButton = new ByChained(By.xpath("//table//p/iframe[@src='https://embed.acast.com/horror-queers']"),By.xpath("//div//button//div/svg"));
		//title[contains(text,'Play')]
		System.out.println("BD Podcast Test Started");
		driver.get("https://www.bloody-disgusting.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Page Load Wait Completed");
		driver.getTitle();
		System.out.println("Searching for Podcast Button");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//ul[@id='menu-bd_mobile-1']//li/a[text()='PODCASTS']")).click();
		System.out.println("Podcasts Button Clicked");
		driver.findElement(By.xpath("//img[@class='aligncenter size-medium wp-image-3631360']")).click();
		System.out.println("Horror Queers Podcast Button Clicked");
		//Thread.sleep(2000);  
		//driver.findElement(By.xpath("//tbody//tr/td/a[@href='#horrorqueers']")).click();
		driver.findElement(PodcastButton).click();
		System.out.println("Podcast Show 'Horror Queers' Button Clicked");
		
		
		
		//driver.findElement(By.xpath("//iframe[@src='https://embed.acast.com/horror-queers']")).click();

		driver.findElement(By.xpath("//p/iframe[@src='https://embed.acast.com/horror-queers']//div/button[contains(text(),'Play')]")).click();
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/div[2]/div/button/div/svg/path")).click();
		//driver.findElement((By.xpath("//button[@h1='Micro Queers: Harmful Sensations (2014)'"))).click();
		System.out.println("Test completed");
		
	
	}

}

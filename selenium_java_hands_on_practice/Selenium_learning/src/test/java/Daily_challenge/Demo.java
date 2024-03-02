package Daily_challenge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	static WebDriver driver;
	String url="https://www.worldometers.info/world-population/";
//	String current_Population="//div[@class='maincounter-number']/span[@class='rts-counter']";
//	String todays_population="//div[text()='Today']//parent::div//span[@class='rts-counter']";
//	String this_year_population="//div[text()='This year']//parent::div//span[@class='rts-counter']";
	
@BeforeTest
public void bt() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(10000);
}
@Test
public static void test1_current() throws InterruptedException {
	System.out.println("----------the current population--------------");
	int count=1;
	while(count<=20) {
		System.out.println(count+" sec");
		if(count==21) break; 
	List<WebElement> ki=driver.findElements(By.xpath("//div[@class='maincounter-number']/span[@class='rts-counter']"));
	for(WebElement er:ki) {
		System.out.println(er.getText());
	}
	Thread.sleep(1000);
	count++;
	}
}
@Test
public static void test2_today_population() throws InterruptedException {
	System.out.println("---------The Today's Birthdays--------------");
	int count=1;
	while(count<=20) {
		System.out.println(count+" sec");
		if(count==21) break;
		List<WebElement> ki=driver.findElements(By.xpath("//div[text()='Today']//parent::div//span[@class='rts-counter']"));
		for(WebElement er:ki) {
			System.out.println(er.getText());
		}
		Thread.sleep(1000);
		count++;
		}
}
@Test
public static void test3_this_year() throws InterruptedException {
	System.out.println("----------This Year Birthdays--------------");
		int count=1;
		while(count<=20) {
		System.out.println(count+" sec");
		if(count==21) break;
		List<WebElement> ki=driver.findElements(By.xpath("//div[text()='This year']//parent::div//span[@class='rts-counter']"));
		for(WebElement er:ki) {
			System.out.println(er.getText());
		}
		Thread.sleep(1000);
		count++;
		}
}
}
	









package Daily_challenge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo6 {
	WebDriver driver;
	String url="https://www.noon.com/uae-en/";
	
@BeforeTest
public void bt() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}

@Test
public void test() {
	List<WebElement> kj=driver.findElements(By.xpath("//div[@class='componentArea-4']//div[2]//div[@class='sc-kCMKrZ ealOXE']"));
	int g=kj.size();
	System.out.println(g);
	
	
	
	
}
}

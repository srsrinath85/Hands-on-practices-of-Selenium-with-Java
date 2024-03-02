package Daily_challenge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo5 {
	WebDriver driver;
	String url="https://petdiseasealerts.org/forecast-map/#/";
	
@BeforeTest
public void bt() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}

@Test
public void test() {
	List<WebElement> kb=driver.findElements(By.xpath("//*[@class='region']"));
	int fl=kb.size();
	System.out.println(fl);
	for(WebElement g:kb) {
		String m=g.getAttribute("name");
		System.out.println(m);
	}
	
	
}

}

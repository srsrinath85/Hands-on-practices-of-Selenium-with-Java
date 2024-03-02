package Daily_challenge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice2 {
	WebDriver driver;
	String url="https://www.saucedemo.com/inventory.html";
	
@BeforeTest
public void bt() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}

//@Test
//public void test() {
//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	driver.findElement(By.id("login-button")).click();
////	List<WebElement> kj=driver.findElements(By.xpath("//div[@class='componentArea-4']//div[@class='sc-aXZVg Xziqo']"));
////	List<WebElement> kj=driver.findElements(By.xpath("//div[@class='componentArea-4']//div[@class='sc-fqkvVR kHSGGH']"));
//	List<WebElement> kj=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
//	int sf=kj.size();
//	System.out.println(sf);
//	double jh=kj.stream().mapToDouble(e-> Double.parseDouble(e.getText().trim().replace("$",""))).max().getAsDouble();
//	System.out.println(jh);
//	driver.findElement(By.xpath("//div[normalize-space()='$"+jh+"']/following-sibling::button[text()='Add to cart']")).click();
//	
//	List<WebElement> kjt=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
//	int sfr=kjt.size();
//	System.out.println(sfr);
//	double jhf=kjt.stream().mapToDouble(e-> Double.parseDouble(e.getText().trim().replace("$",""))).min().getAsDouble();
//	System.out.println(jhf);
//	driver.findElement(By.xpath("//div[normalize-space()='$"+jhf+"']/following-sibling::button[text()='Add to cart']")).click();
//			
//}
@Test
public void test1() {
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
//	List<WebElement> kj=driver.findElements(By.xpath("//div[@class='componentArea-4']//div[@class='sc-aXZVg Xziqo']"));
//	List<WebElement> kj=driver.findElements(By.xpath("//div[@class='componentArea-4']//div[@class='sc-fqkvVR kHSGGH']"));
	List<WebElement> kj=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
	int sf=kj.size();
	System.out.println(sf);
	double lar=0;
	for(WebElement fd:kj) {
		Double fds=Double.parseDouble(fd.getText().replace("$",""));
		if(lar<fds) {
			lar=fds;
		}
	}
	System.out.println(lar);
	driver.findElement(By.xpath("//div[normalize-space()='$"+lar+"']/following-sibling::button[text()='Add to cart']")).click();
	
	List<WebElement> kjt=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
	int sfr=kjt.size();
	System.out.println(sfr);
	double min=0;
	for(WebElement fdf:kj) {
		Double fdy=Double.parseDouble(fdf.getText().replace("$",""));
		if(fdy>min) {
			min=fdy;
		}
	}
	System.out.println(min);
	driver.findElement(By.xpath("//div[normalize-space()='$"+min+"']/following-sibling::button[text()='Add to cart']")).click();
			
}






}

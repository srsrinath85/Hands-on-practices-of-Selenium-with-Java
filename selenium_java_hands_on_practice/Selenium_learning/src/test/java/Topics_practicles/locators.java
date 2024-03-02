package Topics_practicles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {
WebDriver driver;
String url="https://bstackdemo.com/";
@BeforeTest
public void bt() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}

@Test
public void test1() {
	//Different scenarios we can use cssselector
	driver.findElement(By.cssSelector("a#sign[href='/offers']")).click();//tagname,id,attribute
	driver.findElement(By.cssSelector("a#offers[href='/offers']")).click();//tagname,id,attribute
	driver.findElement(By.cssSelector("a.Navbar_link__3Blki[href='/orders']")).click();//tagname,class,attribute
	driver.findElement(By.cssSelector("a[href='/favourites']")).click();//with out using id and class
	driver.findElement(By.cssSelector(".Navbar_logo__26S5Y")).click();//only class name
//	driver.findElement(By.cssSelector("a.Navbar_logo__26S5Y")).click();//tagname and classname
//	driver.findElement(By.cssSelector("a[class='Navbar_logo__26S5Y']")).click();//tagname and attribute 
	
	driver.findElement(By.cssSelector("a[class^='Navbar_logo']")).click();//Matching Prefix like substring Locate the web element 
	//using the substring that starts with a certain value
	
	driver.findElement(By.cssSelector("a[class$='26S5Y']")).click();//Matching suffix like substring Locate the web element 
	//using the substring that ending with a certain value
	
	driver.findElement(By.cssSelector("a[class*='logo']")).click();//Matching substring contains Locate the web element 
	//using the substring that matching with a certain value.
	
	driver.findElement(By.cssSelector("ul#fruit li:nth-of-type(2)"));//in the list we can select any one means use nth-of-type
	
	
	
}
@Test
public void test2() {
	//different scenarios like axes and functions for xpath locator
	driver.findElement(By.xpath("//div[@class='sort']/select")).click();//class attribute to select dropdown 
	
	
}

	
	
}

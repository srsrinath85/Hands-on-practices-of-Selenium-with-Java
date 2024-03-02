package Topics_practicles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class select_checkbox extends select_class_checkboxes_methods {
	WebDriver driver;
	String url="https://rahulshettyacademy.com/AutomationPractice/";

@BeforeTest
public void bt() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get(url);
	//driver.manage().window().maximize();
	Thread.sleep(6000);
}
@Test
public void test() throws InterruptedException {
	//WebElement ele=driver.findElement(By.id("checkBoxOption1"));
	//new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(ele));
	//checkbox_se(ele);
	WebElement ele3=driver.findElement(By.cssSelector("#checkBoxOption3"));
	all_checkbox(ele3,"Option3");
	
}
}

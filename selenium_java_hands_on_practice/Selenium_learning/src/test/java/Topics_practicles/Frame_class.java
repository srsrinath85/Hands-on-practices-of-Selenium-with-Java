package Topics_practicles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_class extends Frame_methods{
WebDriver driver;
String url="https://demo.automationtesting.in/Frames.html";

@BeforeTest
public void bt() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(6000);
}

@Test
public void test() throws InterruptedException {
//	WebElement rl=driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[4]"));
//	rl.click();
	WebElement tl=driver.findElement(By.xpath("//div[@class='tabpane']/ul/li[2]"));
	tl.click();
	WebElement elesa=driver.findElement(By.xpath("//div[@class='iframe-container']"));
	Thread.sleep(6000);
//	WebElement elesb=driver.findElement(By.cssSelector("iframe[srcdoc='<p>Child Iframe</p>']"));
	//sframe(elesa,elesb);
	oneframe(elesa);
}
}

package Topics_practicles;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert_class {
	WebDriver driver;
	String Url="https://demo.automationtesting.in/Alerts.html";
	
	@BeforeTest
	public void bt() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		Thread.sleep(6000);
	}
	@Test
	public void test() throws IOException {
		WebElement er=driver.findElement(By.xpath("//*[@class='btn btn-danger']"));
		er.click();
		Alert ar=driver.switchTo().alert();
		System.out.println(ar.getText());
		ar.accept();
		  TakesScreenshot scrShot =((TakesScreenshot)driver);
		    File SourceFile=scrShot.getScreenshotAs(OutputType.FILE);
		    File DestFile=new File("Desktop/srinath.png");
		    FileUtils.copyFile(SourceFile, DestFile);
		    //ar.dismiss();
		
		
	}
	

}

package Topics_practicles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven {
	
	WebDriver driver;
//	String url1="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//	String url2="https://practicetestautomation.com/practice-test-login/";
//	String url3="https://the-internet.herokuapp.com/";
	
	@BeforeTest
	public void bt() throws InterruptedException {
//		htreport=new ExtentHtmlReporter("demoreport.html");
//		extent=new ExtentReports();
//		extent.attachReporter(htreport);
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
//		driver.get(url1);
//		driver.manage().window().maximize();
		Thread.sleep(6000);
	}
	@Test
	public void test() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		//test=extent.createTest("MyFirst test");
		File f=new File("C://Users//Admin//Documents//demodata1.xlsx");//declare file location using file class
		FileInputStream fi=new FileInputStream(f);//it will read the Excel data with in the file
		XSSFWorkbook xw=new XSSFWorkbook(fi);//Now we are in workbook
		XSSFSheet xs=xw.getSheet("sheet1");//Now we are in sheet1 where exactly the data is present
		int rc=xs.getLastRowNum();
		System.out.println(rc);

//		for(int a=1;a<=rc;a++) {
//			String username=xs.getRow(a).getCell(0).getStringCellValue();//Admin,student
//			System.out.println(username);
//			//test.info("the excel sheet first row and first cell value is"+ username);
//			String password=xs.getRow(a).getCell(1).getStringCellValue();//admi123,Password123
//			System.out.println(password);
//			//test.info("the excel sheet first row and second cell value is"+ password);
//			Thread.sleep(6000);
//			driver.findElement(By.name("username")).sendKeys(username);
//			//test.info("the username is entered");
//			driver.findElement(By.name("password")).sendKeys(password);
//			//test.info("the password is entered");
//			driver.findElement(By.xpath("//button[@type='submit']")).click();
//			//test.info("the submit button is clicked");
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		}
	}
	

}

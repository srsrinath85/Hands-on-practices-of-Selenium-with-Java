package Topics_practicles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data_driven_testing {
	WebDriver driver;
	String url1="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String url2="https://practicetestautomation.com/practice-test-login/";
	String url3="https://the-internet.herokuapp.com/";
	//intialize the html reporter
	ExtentHtmlReporter htreport;
	//intialize the extent report and attach to html reporter
	ExtentReports extent;
	//creating test
	ExtentTest test;
	
	@BeforeTest
	public void bt() throws InterruptedException {
		htreport=new ExtentHtmlReporter("demoreport.html");
		extent=new ExtentReports();
		extent.attachReporter(htreport);
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get(url1);
		driver.manage().window().maximize();
		Thread.sleep(6000);
	}
	@Test
	public void test() throws IOException, InterruptedException {
		test=extent.createTest("MyFirst test");
		File f=new File("C://Users//Admin//Documents//demodata.xlsx");//declare file location using file class
		FileInputStream fi=new FileInputStream(f);//it will read the Excel data with in the file
		XSSFWorkbook xw=new XSSFWorkbook(fi);//Now we are in workbook
		XSSFSheet xs=xw.getSheet("sheet1");//Now we are in sheet1 where exactly the data is present
		int rc=xs.getLastRowNum();
		System.out.println(rc);
		for(int i=1;i<=rc;i++) {
			String username=xs.getRow(i).getCell(0).getStringCellValue();//Admin,student
			System.out.println(username);
			test.info("the excel sheet first row and first cell value is"+ username);
			String password=xs.getRow(i).getCell(1).getStringCellValue();//admi123,Password123
			System.out.println(password);
			test.info("the excel sheet first row and second cell value is"+ password);
			Thread.sleep(6000);
			driver.findElement(By.name("username")).sendKeys(username);
			test.info("the username is entered");
			driver.findElement(By.name("password")).sendKeys(password);
			test.info("the password is entered");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			test.info("the submit button is clicked");
			for(int j=2;j<=rc;j++) {
				driver.navigate().to(url2);
				String us=xs.getRow(j).getCell(0).getStringCellValue();
				test.info("the excel sheet second row and third cell value is"+  us);
				String ps=xs.getRow(j).getCell(1).getStringCellValue();
				test.info("the excel sheet second row and fourth cell value is"+ ps);
				driver.manage().window().maximize();
				Thread.sleep(6000);
				driver.findElement(By.id("username")).sendKeys(us);
				test.info("the username is entered");
				driver.findElement(By.id("password")).sendKeys(ps);
				test.info("the Password is entered");
				driver.findElement(By.xpath("//button[@class='btn']")).click();
				test.info("the login button is clicked");
				Thread.sleep(6000);
				break;
			}
			for(int k=3;k<=rc;k++) {
				driver.navigate().to("https://demo.guru99.com/V1/index.php");
				driver.manage().window().maximize();
				Thread.sleep(6000);
				String uss=xs.getRow(k).getCell(0).getStringCellValue();
				test.info("the excel sheet third row and fivth cell value is"+ uss);
				String pase=xs.getRow(k).getCell(1).getStringCellValue();
				test.info("the excel sheet third row and sixth cell value is"+ pase);
				System.out.println(uss);
				System.out.println(pase);
				driver.findElement(By.name("uid")).sendKeys(uss);
				test.info("the uid is entered");
				driver.findElement(By.name("password")).sendKeys(pase);
				test.info("the Password is entered");
				driver.findElement(By.name("btnLogin")).click();
				test.info("the login button is clicked");
				driver.findElement(By.partialLinkText("Basic")).click();
				Thread.sleep(6000);
				//Alert a=driver.switchTo().alert();
//				a.sendKeys(uss);
//				a.sendKeys(pase);
				//a.dismiss();
				break;
			}
			break;
			
		}
		
		driver.close();
		extent.flush();
		
		
	}

}














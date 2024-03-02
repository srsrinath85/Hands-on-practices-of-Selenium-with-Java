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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_driven_testing2 {
	
	
		WebDriver driver;
		String url1="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String url2="https://practicetestautomation.com/practice-test-login/";
		String url3="https://the-internet.herokuapp.com/";
//		//intialize the html reporter
//		ExtentHtmlReporter htreport;
//		//intialize the extent report and attach to html reporter
//		ExtentReports extent;
//		//creating test
//		ExtentTest test;
		
		@BeforeTest
		public void bt() throws InterruptedException {
//			htreport=new ExtentHtmlReporter("demoreport.html");
//			extent=new ExtentReports();
//			extent.attachReporter(htreport);
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(url1);
			driver.manage().window().maximize();
			Thread.sleep(6000);
		}
		@Test
		public void test() throws IOException, InterruptedException {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//test=extent.createTest("MyFirst test");
			File f=new File("C://Users//Admin//Documents//demodata.xlsx");//declare file location using file class
			FileInputStream fi=new FileInputStream(f);//it will read the Excel data with in the file
			XSSFWorkbook xw=new XSSFWorkbook(fi);//Now we are in workbook
			XSSFSheet xs=xw.getSheet("sheet1");//Now we are in sheet1 where exactly the data is present
			int rc=xs.getLastRowNum();
			System.out.println(rc);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			for(int a=1;a<=rc;a++) {
				String username=xs.getRow(a).getCell(0).getStringCellValue();//Admin,student
				System.out.println(username);
				//test.info("the excel sheet first row and first cell value is"+ username);
				String password=xs.getRow(a).getCell(1).getStringCellValue();//admi123,Password123
				System.out.println(password);
				//test.info("the excel sheet first row and second cell value is"+ password);
				Thread.sleep(6000);
				driver.findElement(By.name("username")).sendKeys(username);
				//test.info("the username is entered");
				driver.findElement(By.name("password")).sendKeys(password);
				//test.info("the password is entered");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				//test.info("the submit button is clicked");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				for(int b=2;b<=rc;b++) {
					driver.navigate().to(url2);
					String us=xs.getRow(b).getCell(0).getStringCellValue();
					//test.info("the excel sheet second row and third cell value is"+  us);
					String ps=xs.getRow(b).getCell(1).getStringCellValue();
					//test.info("the excel sheet second row and fourth cell value is"+ ps);
					driver.manage().window().maximize();
					Thread.sleep(6000);
					driver.findElement(By.id("username")).sendKeys(us);
					//test.info("the username is entered");
					driver.findElement(By.id("password")).sendKeys(ps);
					//test.info("the Password is entered");
					driver.findElement(By.xpath("//button[@class='btn']")).click();
					//test.info("the login button is clicked");
					Thread.sleep(6000);
					break;
				}
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				for(int c=3;c<=rc;c++) {
					driver.navigate().to("https://demo.guru99.com/V1/index.php");
					driver.manage().window().maximize();
					Thread.sleep(6000);
					String uss=xs.getRow(c).getCell(0).getStringCellValue();
					//test.info("the excel sheet third row and fivth cell value is"+ uss);
					String pase=xs.getRow(c).getCell(1).getStringCellValue();
					//test.info("the excel sheet third row and sixth cell value is"+ pase);
					System.out.println(uss);
					System.out.println(pase);
					driver.findElement(By.name("uid")).sendKeys(uss);
					//test.info("the uid is entered");
					driver.findElement(By.name("password")).sendKeys(pase);
					//test.info("the Password is entered");
					driver.findElement(By.name("btnLogin")).click();
					//test.info("the login button is clicked");
					driver.findElement(By.partialLinkText("Basic")).click();
					Thread.sleep(6000);
					//Alert a=driver.switchTo().alert();
//					a.sendKeys(uss);
//					a.sendKeys(pase);
					//a.dismiss();
					break;
				}
				break;
				
			}
			
			driver.close();
			//extent.flush();
			
			
		}

	}

















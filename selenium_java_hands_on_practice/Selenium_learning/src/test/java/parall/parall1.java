package parall;


	import org.testng.annotations.Test;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;


	public class parall1 extends base {
		
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		//public static WebDriver driver;	
		//@Parameters("mybrowser")

		@BeforeTest()
		@Parameters("mybrowser")
		public void test1(String mybrowser) {
		if(mybrowser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else if(mybrowser.equalsIgnoreCase("firefox")) {
			WebDriverManager.edgedriver().setup();
			driver=new FirefoxDriver();
			//driver.get(url);

		}
		}
		@Test
		public void test2() throws InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			
//			Thread.sleep(5000);
//			driver.findElement(By.name("username")).sendKeys("Admin");
//			driver.findElement(By.name("password")).sendKeys("admin123");
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//*[@type='submit']")).click();
							
			
		}
@AfterTest()
	public void at() throws InterruptedException {
		Thread.sleep(7000);
		driver.close();
	}
		}





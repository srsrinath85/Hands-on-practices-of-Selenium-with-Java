package parall;



	import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class parall2  extends base{
		//public static WebDriver driver;
		String url="https://www.flipkart.com";

		@BeforeTest
		@Parameters("mybrowser")
		public void test1(String mybrowser) {
		if(mybrowser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else if(mybrowser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			//driver.get(url);
		}
		}
	    @Test
	    public void testExample() {
	    
	    	driver.get(url);
			driver.manage().window().maximize();
	        // Perform test actions using the driver
	    }

	    @Test
	    public void testAnotherExample() {
	        // Perform another test using the same driver
	    	driver.get(url);
			driver.manage().window().maximize();
	    }

	      

	@AfterTest()
	public void ate() throws InterruptedException {
		Thread.sleep(7000);
		driver.close();
	}
		}





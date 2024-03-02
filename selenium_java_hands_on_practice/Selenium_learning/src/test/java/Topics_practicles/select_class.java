package Topics_practicles;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class select_class {
	WebDriver driver;
	String url="https://bstackdemo.com/";
	
@BeforeTest
public void bt() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(6000);
}

@Test
public void test1() throws InterruptedException {
	WebElement ele=driver.findElement(By.tagName("select"));
	Thread.sleep(6000);
	Select s=new Select(ele);//select is a class it provides useful methods for interacting with select options.we can
	//perform operations on a select dropdown and de-select operations using these methods(selectbyindex,selectbyvalue,
	//selectbyvisibletext,deselectindex.deselectbyvalue,deselectbyvisibletext,deselectall)
	//s.selectByIndex(2);
	s.selectByVisibleText("Lowest to highest");
	s.selectByVisibleText("Highest to lowest");
	Thread.sleep(6000);
	
	//select with multiple attribute
	
	//To get all the options present in the dropdown
//	List <WebElement> alloption=s.getOptions();
//	for(WebElement element : alloption) {
//		System.out.println(element.getText());
//	}
	
	//List all the selected options in the dropdown
		List <WebElement> seoptions=s.getAllSelectedOptions();
		for(WebElement eles : seoptions) {
			System.out.println("you have selected::"+eles.getText());
		}
		
	//getting First selected options
		WebElement els=s.getFirstSelectedOption();
		System.out.println("First selected option::"+els.getText());
		
		if(s.isMultiple()) {
			System.out.println("select allows multiple selections");
		}else {
			System.out.println("select does not allow multiple selections");
		}
	
			
	
}	
@Test
public void select_dropdown_byvisibletext(WebElement elet,String svisibletext) {
	
	try {
		Select ses=new Select(elet);
		ses.selectByValue(svisibletext);
	}
	catch(NoSuchElementException e) {
		System.out.println("option value not found in dropdown");
	}
	
}
@Test
public String getSelectedOption(WebElement elet) {
	Select sse=new Select(elet);
	WebElement	selectedele=sse.getFirstSelectedOption();
	String seoption=selectedele.getText();
	return seoption;
}
@Test
public void test4() throws InterruptedException {
	WebElement elet=driver.findElement(By.tagName("select"));
	Thread.sleep(6000);
	select_dropdown_byvisibletext(elet, "Highest to lowest");
	assertEquals("Highest to lowest", getSelectedOption(elet),"selected value is not displaying");
}


@Test
public void selected_byIndex(WebElement elet,int svisibleindex) {
	try {
		Select sej=new Select(elet);
		sej.selectByIndex(svisibleindex);
	}
	catch(NoSuchElementException e) {
		System.out.println("Element value not found");
	}
	
}
@Test
public void test5() {
	WebElement eley=driver.findElement(By.tagName("select"));
	selected_byIndex(eley,2);
	assertEquals("Highest to lowest", getSelectedOption(eley),"Select value is not displaying");
}
	
@AfterTest
public void at() {
	driver.close();
}
	
	
	
	
	
	
	


}

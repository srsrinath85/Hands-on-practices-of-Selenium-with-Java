package Topics_practicles;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame_methods {
	WebDriver driver;
	public void sframe(WebElement pfra,WebElement cfra) {
		try {
			driver.switchTo().frame(pfra).switchTo().frame(cfra);
			System.out.println("Navigate to frame with id"+pfra+cfra);
			System.out.println(pfra.getText());
			System.out.println(cfra.getText());
		}
		catch(NoSuchElementException e) {
			System.out.println("Unable to locate frame with id"+pfra+e.getStackTrace());
		}
		catch(Exception e) {
			System.out.println("Unable  to Navigate frame with id"+pfra+e.getStackTrace());
		}
	}
	public void oneframe(WebElement pfra) {
		try {
			driver.switchTo().frame(pfra);
			//System.out.println("Navigate to frame with id"+pfra+cfra);
			System.out.println(pfra.getText());
			//System.out.println(cfra.getText());
		}
		catch(NoSuchElementException e) {
			System.out.println("Unable to locate frame with id"+pfra+e.getStackTrace());
		}
		catch(Exception e) {
			System.out.println("Unable  to Navigate frame with id"+pfra+e.getStackTrace());
		}
	}

}

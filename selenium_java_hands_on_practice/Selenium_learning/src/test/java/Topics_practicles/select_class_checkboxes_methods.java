package Topics_practicles;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;

public class select_class_checkboxes_methods {
	
	public void checkbox_se(WebElement element) {
		try {
			if(element.isSelected()) {
				System.out.println("Checkbox:"+element+"is selected");
			}else {
				element.click();
			}
		}catch(NoSuchElementException e) {
			System.out.println("Element not found");
		}
		
	}
	public void all_checkbox(WebElement element,String valuetoselect) throws InterruptedException {
		List <WebElement> lele=element.findElements(By.xpath("//div[@id='checkbox-example']/fieldset"));
		System.out.println(lele);
		Thread.sleep(6000);
		for(WebElement option:lele) {
			System.out.println("option value"+option.getText());
			//System.out.println("hello2");
			if(valuetoselect.equals(option.getText())) {
				//System.out.println("hello");
				option.click();
				break;
			}
		}
	}
	

}

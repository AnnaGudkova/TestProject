package unify;
import TestProject.*;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox{
	
	public void checkOption() {
	 List<WebElement> allCheckbox = driver.findElements(By.cssSelector("input:checked[type='checkbox']"));
	    for (WebElement ele : allCheckbox) {
	        if (ele.isSelected()) {
	            ele.click();
	        } 
	    }
	    }
	
	public void uncheckOption() {
		 List<WebElement> allCheckbox = driver.findElements(By.cssSelector("input:not(:checked)[type='checkbox']"));
		    for (WebElement ele : allCheckbox) {
		        if (!ele.isSelected()) {
		            ele.click();
		        } 
		    }
		    }	
}
	

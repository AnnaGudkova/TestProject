package unify;
import TestProject.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectClass extends BaseRunner{
	
	WebElement selectElem = driver.findElement(By.tagName("select"));
	Select select = new Select(selectElem);
	
	public void selectOption(WebElement element, String option) {
 		if (option != null && !option.equals("")) {
 			if (option.equals("rand")) {
 				Random random = new Random();
				List<WebElement> options = select.getOptions();
				int index = random.nextInt(options.size());
				while (!options.get(index).isEnabled()) {
					index = random.nextInt(options.size());
				}
				select.selectByIndex(index);
 		} else {
			select.selectByVisibleText(option);
 		}
 	}
 }	
	public WebElement getOption() {
		return select.getFirstSelectedOption();
 	}
 }	
	


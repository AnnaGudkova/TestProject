package unify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Button {
	WebElement element = driver.findElement(By.id("//*[@id=\"form-application\"]"));
	Actions actions = new Actions(driver);
	public void buttonOption(){
	actions.contextClick(element).perform();
	}
}

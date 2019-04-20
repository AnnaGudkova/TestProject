package TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    private WebElement q;
    WebDriver driver;
    
    public void searchFor(String text) {
        q.sendKeys(text);
        q.submit();
    }
    
    public void useSearchFor() {
        driver.get("http://www.google.ru/");
        GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);
        page.searchFor("мобайл тинькофф");
    }
    
    public void scrollDown(Keys key){
		 driver.findElement(By.name("q")).sendKeys(key);
	}

	public void scrollDown(String key) {
		 driver.findElement(By.name("q")).sendKeys(key);
	}
	 
	public void closePage() {
		 driver.close();
	 }
	
	public void findElement(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		}

} 
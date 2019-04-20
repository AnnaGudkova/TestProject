package TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Page {
	
	WebDriver driver;
	String url = "https://www.tinkoff.ru/mobile-operator/tariffs/";
	By pageName = By.xpath("//*[@id=\"x1e2f1\"]/div/div/div/div/div/div/div[1]/h2"); 
	By fio = By.name("fio");
	By phone = By.name("phone_mobile");
	By email = By.name("email");	
	By resident = By.name("non_resident");
	By button = By.className("ui-form__component");
	By errorMsgTxt = By.className("ui-form-field-error-message");
	
	public Page(WebDriver driver){
		this.driver = driver;
	}
	
	public void getPage() {
        driver.get(url);
        Page page = PageFactory.initElements(driver, Page.class);
    }
	
	public String getPageUrl(){
		 return	driver.getCurrentUrl();
	}
	
	public String getPageName(){
		 return	driver.findElement(pageName).getText();
		}
	
	public void setFio(String inputFio){
		driver.findElement(fio).sendKeys(inputFio);
	}
	
	public void setPhone(String inputPhone){
		 driver.findElement(phone).sendKeys(inputPhone);
	}
	
	public void setEmail(String inputEmail){
		 driver.findElement(email).sendKeys(inputEmail);
	}
	
	public void setResidence(String inputRes){
		 driver.findElement(resident).sendKeys(inputRes);
	}
	
	public void clickButton(){
			driver.findElement(button).click();
	}

	public void orderSimCard(String inputFio,String inputPhone,String inputEmail,String inputRes){
		this.setFio(inputFio);
		this.setPhone(inputPhone);
		this.setEmail(inputEmail);
		this.setResidence(inputRes);
		this.clickButton();			
	}
	
	public String getErrorMessage() {
		String strErrorMsg = null;
		WebElement errorMsg = driver.findElement(errorMsgTxt);
		if(errorMsg.isDisplayed()&&errorMsg.isEnabled())
		strErrorMsg = errorMsg.getText();
		return strErrorMsg;
		}

	public void findElement(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		}
	
	public String getText(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
		}
	
	public void findElementByCss(String css) {
		driver.findElement(By.cssSelector(css)).click();
		}
}

package TestProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Tests extends BaseRunner {
	WebDriver driver;
	
	GoogleSearchPage objGoogleSearchPage;
	Page objPage = new Page(driver);
	Logger logger = Logger.getLogger(Tests.class);
	
	@Test
	public void test(){
		objPage = new Page(driver);
		logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		objPage.orderSimCard("test", "9777777777", "mail@mail.com","res");
		logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		assertEquals(objPage.getPageName(),"Тарифы Тинькофф Мобайла");
		logger.info(driver.manage().logs().getAvailableLogTypes().toString());
	}	
	
	 @Test
	  public void test1()  {
		 objGoogleSearchPage.useSearchFor();
		 logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		 objGoogleSearchPage.scrollDown(Keys.DOWN);
		 logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		 objGoogleSearchPage.scrollDown(Keys.DOWN);
		 logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		 objGoogleSearchPage.scrollDown("tinkoff mobile тарифы");
		 logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		 objGoogleSearchPage.scrollDown(Keys.ENTER);  		
		 logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		 objGoogleSearchPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Все результаты'])[3]/following::h3[1]");
		 logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		 objGoogleSearchPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='регион'])[1]/following::p[1]");
		 logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		 assertEquals(objPage.getPageName(),"Тарифы Тинькофф Мобайла");
		 logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		 assertEquals("https://www.tinkoff.ru/mobile-operator/tariffs/", objPage.getPageUrl());
		 logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		 objGoogleSearchPage.closePage();
		 logger.info(driver.manage().logs().getAvailableLogTypes().toString());
	 }

	  @Test
	  public void test2() {
		  	objPage.getPage();
		  	logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		  	objPage.findElementByCss("div.Icon__icon_16twq.Icon__icon_fillColor_black_bL05P.Icon__icon_size_24_2Nwuj > svg");
		  	logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Да'])[1]/following::span[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Город'])[1]/following::div[5]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Москва и Московская область'])[1]/following::div[7]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    assertEquals("Москва и Московская область", objPage.getText("(.//*[normalize-space(text()) and normalize-space(.)='Точки продаж'])[1]/following::div[13]"));
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    String mscPrice1 = objPage.getText("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    assertEquals("Общая цена: 316 ₽", mscPrice1);
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Точки продаж'])[1]/following::div[13]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Костромская обл.'])[1]/following::div[2]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    String krsPrice1 = objPage.getText("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    assertEquals("Общая цена: 296 ₽", krsPrice1);
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    assertNotEquals(mscPrice1, krsPrice1);
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Точки продаж'])[1]/following::div[13]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Город'])[1]/following::div[5]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Интернет'])[1]/following::span[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::div[5]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет'])[3]/following::div[7]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::form[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет в приложениях'])[1]/following::label[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::label[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    String mscPrice2 = objPage.getText("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    assertEquals("Общая цена: 2 546 ₽", mscPrice2);
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Точки продаж'])[1]/following::div[13]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Костромская обл.'])[1]/following::div[2]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='на 30 дней'])[1]/following::div[9]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::div[5]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет'])[3]/following::div[7]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::div[5]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет в приложениях'])[1]/following::label[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::div[6]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    assertEquals("Общая цена: 2 546 ₽", objPage.getText("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]"));
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    String krsPrice2 = objPage.getText("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    assertEquals(mscPrice2, krsPrice2);
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
	  }
	  
	  @Test
	  public void test3()  {
		  	objPage.getPage();
		  	logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет в приложениях'])[1]/following::div[6]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитные минуты'])[2]/following::div[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::div[4]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Интернет'])[1]/following::span[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='на 30 дней'])[1]/following::div[4]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Интернет с данным пакетом недоступен'])[1]/following::div[7]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Интернет с данным пакетом недоступен'])[1]/following::div[2]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    assertEquals("Общая цена: 0 ₽", objPage.getText("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]"));
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
		    objPage.findElementByCss("svg.LoaderRound__svg__vlZE.LoaderRound__svg_coverParent_omksn");    
		    logger.info(driver.manage().logs().getAvailableLogTypes().toString());
	  }
}

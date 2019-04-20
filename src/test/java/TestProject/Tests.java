package TestProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Tests extends BaseRunner {
	WebDriver driver;
	
	GoogleSearchPage objGoogleSearchPage;
	Page objPage = new Page(driver);
	
	@Test
	public void test(){
		objPage = new Page(driver);
		objPage.orderSimCard("test", "9777777777", "mail@mail.com","res");
		assertEquals(objPage.getPageName(),"Тарифы Тинькофф Мобайла");
	}	
	
	 @Test
	  public void test1()  {
		 objGoogleSearchPage.useSearchFor();
		 objGoogleSearchPage.scrollDown(Keys.DOWN);
		 objGoogleSearchPage.scrollDown(Keys.DOWN);
		 objGoogleSearchPage.scrollDown("tinkoff mobile тарифы");
		 objGoogleSearchPage.scrollDown(Keys.ENTER);  		 
		 objGoogleSearchPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Все результаты'])[3]/following::h3[1]");
		 objGoogleSearchPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='регион'])[1]/following::p[1]");
		 assertEquals(objPage.getPageName(),"Тарифы Тинькофф Мобайла");
		 assertEquals("https://www.tinkoff.ru/mobile-operator/tariffs/", objPage.getPageUrl());
		 objGoogleSearchPage.closePage();
	 }

	  @Test
	  public void test2() {
		  	objPage.getPage();
		  	objPage.findElementByCss("div.Icon__icon_16twq.Icon__icon_fillColor_black_bL05P.Icon__icon_size_24_2Nwuj > svg");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Да'])[1]/following::span[1]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Город'])[1]/following::div[5]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Москва и Московская область'])[1]/following::div[7]");
		    assertEquals("Москва и Московская область", objPage.getText("(.//*[normalize-space(text()) and normalize-space(.)='Точки продаж'])[1]/following::div[13]"));
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    String mscPrice1 = objPage.getText("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    assertEquals("Общая цена: 316 ₽", mscPrice1);
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Точки продаж'])[1]/following::div[13]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Костромская обл.'])[1]/following::div[2]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    String krsPrice1 = objPage.getText("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    assertEquals("Общая цена: 296 ₽", krsPrice1);
		    assertNotEquals(mscPrice1, krsPrice1);
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Точки продаж'])[1]/following::div[13]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Город'])[1]/following::div[5]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Интернет'])[1]/following::span[1]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::div[5]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет'])[3]/following::div[7]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::form[1]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет в приложениях'])[1]/following::label[1]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::label[1]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    String mscPrice2 = objPage.getText("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    assertEquals("Общая цена: 2 546 ₽", mscPrice2);
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Точки продаж'])[1]/following::div[13]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Костромская обл.'])[1]/following::div[2]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='на 30 дней'])[1]/following::div[9]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::div[5]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет'])[3]/following::div[7]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::div[5]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет в приложениях'])[1]/following::label[1]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::div[6]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    assertEquals("Общая цена: 2 546 ₽", objPage.getText("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]"));
		    String krsPrice2 = objPage.getText("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    assertEquals(mscPrice2, krsPrice2);
	  }
	  
	  @Test
	  public void test3()  {
		  driver.get("https://www.tinkoff.ru/mobile-operator/tariffs/");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет в приложениях'])[1]/following::div[6]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитные минуты'])[2]/following::div[1]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::div[4]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Интернет'])[1]/following::span[1]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='на 30 дней'])[1]/following::div[4]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Интернет с данным пакетом недоступен'])[1]/following::div[7]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Интернет с данным пакетом недоступен'])[1]/following::div[2]");
		    objPage.findElement("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]");
		    assertEquals("Общая цена: 0 ₽", objPage.getText("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]"));
		    objPage.findElementByCss("svg.LoaderRound__svg__vlZE.LoaderRound__svg_coverParent_omksn");    
	  }
}

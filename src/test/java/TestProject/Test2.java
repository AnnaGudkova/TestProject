package TestProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class Test2 extends BaseRunner {
 
  @Test
  public void test1()  {
	  driver.get("https://www.google.ru/search?newwindow=1&source=hp&ei=nyyuXJj9F8no6QT34ZGgCA&q=%D0%BC%D0%BE%D0%B1%D0%B0%D0%B9%D0%BB+%D1%82%D0%B8%D0%BD%D1%8C%D0%BA%D0%BE%D1%84%D1%84&btnK=%D0%9F%D0%BE%D0%B8%D1%81%D0%BA+%D0%B2+Google&oq=%D0%BC%D0%BE%D0%B1%D0%B0%D0%B9%D0%BB+%D1%82%D0%B8%D0%BD%D1%8C%D0%BA%D0%BE%D1%84%D1%84&gs_l=psy-ab.3..0i22i30l10.2428.2428..3825...0.0..0.116.116.0j1......0....2j1..gws-wiz.....0._Rr4Q6Cl8Io");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Войти'])[1]/following::img[1]")).click();
	    driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
	    driver.findElement(By.name("q")).sendKeys(Keys.DOWN); 
	    driver.findElement(By.name("q")).sendKeys("tinkoff mobile тарифы");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Все результаты'])[3]/following::h3[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='регион'])[1]/following::p[1]")).click();
	    assertEquals("Тарифы Тинькофф Мобайла", driver.getTitle());
	    assertEquals("https://www.tinkoff.ru/mobile-operator/tariffs/", driver.getCurrentUrl());
	    driver.close();
	    }

  @Test
  public void test2() {
	  driver.get("https://www.tinkoff.ru/mobile-operator/tariffs/");
	    driver.findElement(By.cssSelector("div.Icon__icon_16twq.Icon__icon_fillColor_black_bL05P.Icon__icon_size_24_2Nwuj > svg")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Да'])[1]/following::span[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Город'])[1]/following::div[5]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва и Московская область'])[1]/following::div[7]")).click();
	    assertEquals("Москва и Московская область", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Точки продаж'])[1]/following::div[13]")).getText());
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]")).click();
	    String mscPrice1 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]")).getText();
	    assertEquals("Общая цена: 316 ₽", mscPrice1);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Точки продаж'])[1]/following::div[13]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Костромская обл.'])[1]/following::div[2]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]")).click();
	    String krsPrice1 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]")).getText();
	    assertEquals("Общая цена: 296 ₽", krsPrice1);
	    assertNotEquals(mscPrice1, krsPrice1);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Точки продаж'])[1]/following::div[13]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Город'])[1]/following::div[5]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Интернет'])[1]/following::span[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::div[5]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет'])[3]/following::div[7]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::form[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет в приложениях'])[1]/following::label[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::label[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]")).click();
	    String mscPrice2 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]")).getText();
	    assertEquals("Общая цена: 2 546 ₽", mscPrice2);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Точки продаж'])[1]/following::div[13]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Костромская обл.'])[1]/following::div[2]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='на 30 дней'])[1]/following::div[9]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::div[5]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет'])[3]/following::div[7]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::div[5]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет в приложениях'])[1]/following::label[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::div[6]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]")).click();
	    assertEquals("Общая цена: 2 546 ₽", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]")).getText());
	    String krsPrice2 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]")).getText();
	    assertEquals(mscPrice2, krsPrice2);
  }
  
  @Test
  public void test3()  {
	  driver.get("https://www.tinkoff.ru/mobile-operator/tariffs/");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитный интернет в приложениях'])[1]/following::div[6]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Безлимитные минуты'])[2]/following::div[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::div[4]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Интернет'])[1]/following::span[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='на 30 дней'])[1]/following::div[4]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Интернет с данным пакетом недоступен'])[1]/following::div[7]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Интернет с данным пакетом недоступен'])[1]/following::div[2]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]")).click();
	    assertEquals("Общая цена: 0 ₽", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите пакеты услуг'])[1]/following::h3[1]")).getText());
	    driver.findElement(By.cssSelector("svg.LoaderRound__svg__vlZE.LoaderRound__svg_coverParent_omksn")).click();    
  }
}

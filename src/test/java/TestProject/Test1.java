package TestProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
public class Test1 extends BaseRunner {
 
  @Test
  public void test1()  {
      driver.get("https://www.tinkoff.ru/career/vacancies/");
      driver.findElement(By.name("name")).click();
      driver.findElement(By.name("birthday")).click();
      driver.findElement(By.name("city")).click();
      driver.findElement(By.name("email")).click();
      driver.findElement(By.name("phone")).click();
      driver.findElement(By.className("ui-upload__item-link"));
      driver.findElement(By.className("Text__text_2Vhh9 Text__text_size_17_28jfD"));
      driver.findElement(By.className("Button__button_ZsAp- Button__button_color_black_3jFBq Button__button_rounded_1Eg4W Button__button_wideOnMobile_WlSWa Button__button_size_xxl_1_2X-"));
      assertEquals("", driver.findElement(By.name("name")).getAttribute("value"));
      assertEquals("", driver.findElement(By.name("birthday")).getAttribute("value"));
      assertEquals("", driver.findElement(By.name("city")).getAttribute("value"));
      assertEquals("", driver.findElement(By.name("email")).getAttribute("value"));
      assertEquals("+7(", driver.findElement(By.name("phone")).getAttribute("value"));
      assertEquals("Поле обязательное", driver
              .findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Перетащите файлы сюда'])[1]/following::p[3]")).getText());
  }

  @Test
  public void test2() {
	  driver.get("https://www.tinkoff.ru/career/vacancies/");
	    driver.findElement(By.name("name")).click();
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("f");
	    driver.findElement(By.name("birthday")).click();
	    driver.findElement(By.name("birthday")).clear();
	    driver.findElement(By.name("birthday")).sendKeys("87.11.1111");
	    driver.findElement(By.name("city")).click();
	    driver.findElement(By.name("city")).clear();
	    driver.findElement(By.name("city")).sendKeys("4");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("nl");
	    driver.findElement(By.name("phone")).click();
	    driver.findElement(By.name("phone")).clear();
	    driver.findElement(By.name("phone")).sendKeys("+7(888) 8");
	    driver.findElement(By.name("socialLink0")).click();
	    assertEquals("87.11.1111", driver.findElement(By.name("birthday")).getText());
	    assertEquals("Допустимо использовать только буквы русского алфавита и дефис", driver.findElement(By.name("name")).getText());
	    assertEquals("Поле заполнено некорректно", driver.findElement(By.name("birthday")).getText());
	    assertEquals("Введите корректный адрес эл. почты", driver.findElement(By.name("email")).getText());
	    assertEquals("Номер телефона должен состоять из 10 цифр, начиная с кода оператора", driver.findElement(By.name("phone")).getText());   
  }
}

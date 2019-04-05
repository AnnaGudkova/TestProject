package TestProject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class Test1 extends BaseRunner {
  private WebDriver driver;
  private String baseUrl;
 
  @Test
  public void test1()  {
    driver.get("https://www.tinkoff.ru/career/vacancies/");
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='условиями передачи информации'])[1]/following::button[1]")).click();
    driver.findElement(By.name("birthday")).click();
    driver.findElement(By.name("birthday")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='условиями передачи информации'])[1]/following::button[1]")).click();
    driver.findElement(By.name("city")).click();
    driver.findElement(By.name("city")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='условиями передачи информации'])[1]/following::button[1]")).click();
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='условиями передачи информации'])[1]/following::button[1]")).click();
    driver.findElement(By.name("phone")).click();
    driver.findElement(By.name("phone")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Перетащите файлы сюда'])[1]/following::div[5]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Перетащите файлы сюда'])[1]/following::span[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Добавить ещё ссылку'])[1]/following::div[8]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Поле обязательное'])[7]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Добавить ещё ссылку'])[1]/following::label[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='условиями передачи информации'])[1]/following::button[1]")).click();
  }

  @Test
  public void test2() {
    driver.get("https://www.tinkoff.ru/career/vacancies/");
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("1");
    driver.findElement(By.name("birthday")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("birthday")).click();
    driver.findElement(By.name("birthday")).clear();
    driver.findElement(By.name("birthday")).sendKeys("11.00.0000");
    driver.findElement(By.name("city")).click();
    driver.findElement(By.name("city")).clear();
    driver.findElement(By.name("city")).sendKeys("1");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("s");
    driver.findElement(By.name("phone")).click();
    driver.findElement(By.name("phone")).click();
    driver.findElement(By.name("phone")).clear();
    driver.findElement(By.name("phone")).sendKeys("+7(000)");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Перетащите файлы сюда'])[1]/following::span[2]")).click();
    driver.findElement(By.name("socialLink0")).click();
    driver.findElement(By.name("socialLink0")).clear();
    driver.findElement(By.name("socialLink0")).sendKeys("s");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Добавить ещё ссылку'])[1]/following::div[6]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Поле обязательное'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Добавить ещё ссылку'])[1]/following::label[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='условиями передачи информации'])[1]/following::span[1]")).click();
  }
}

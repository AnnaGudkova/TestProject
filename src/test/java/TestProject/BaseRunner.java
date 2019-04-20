package TestProject;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseRunner {
   protected WebDriver driver;
   public String baseUrl;

    
    @Before
    public void setUp(){
    	System.setProperty("webdriver.chrome.driver", "/C:/Users/Anna Gudkova/chromedriver.exe");
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "https://www.tinkoff.ru/career/vacancies/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            driver.quit();
            driver = null;
        }));
    }
    
    @After
    public void tearDown()  {
      driver.quit();
    }
}
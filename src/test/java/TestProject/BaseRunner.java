package TestProject;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class BaseRunner {
    private static ThreadLocal<WebDriver> tl = new ThreadLocal<>();
    WebDriver driver;
    private String browserName = System.getProperty("browser");
    String baseUrl;

    
    @Before
    public void setUp(){
        if (tl.get() != null) {
            driver = tl.get();
        } else {
            driver = getDriver();
            tl.set(driver);
        }
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

    private WebDriver getDriver() {
        try {
            BrowserFactory.valueOf(System.getProperty("browser"));
        } catch (NullPointerException | IllegalArgumentException e) {
            browserName = BrowserFactory.values()[0].toString();
            System.setProperty("browser", browserName);
        }
        return BrowserFactory.valueOf(browserName).create();
    }
}
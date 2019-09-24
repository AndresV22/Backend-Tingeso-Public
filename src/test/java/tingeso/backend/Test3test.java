package tingeso.backend;// Generated by Selenium IDE
import lombok.ToString;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.TimeUnit;
import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
@ToString
public class Test3test {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setPlatform(Platform.LINUX);
        capabilities.setVersion("");
        driver = new RemoteWebDriver(new URL("http://157.230.231.153:4444/wd/hub"), capabilities);
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test3() throws InterruptedException {
        driver.get("http://157.230.231.153/");
        driver.manage().window().setSize(new Dimension(687, 687));
        driver.findElement(By.id("input-10")).click();
        driver.findElement(By.id("input-10")).sendKeys("Julio");
        driver.findElement(By.id("input-13")).sendKeys("19700195k");
        driver.findElement(By.cssSelector(".mdi-menu-down")).click();
        driver.findElement(By.cssSelector(".v-list-item:nth-child(1) > .v-list-item__content")).click();
        driver.findElement(By.id("input-17")).click();
        Thread.sleep(2000);
        WebElement year1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/div/div/button"));
        year1.click();
        Thread.sleep(2000);
        WebElement year3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/div/div/button"));
        year3.click();
        Thread.sleep(2000);
        WebElement year2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/ul/li[101]"));
        year2.click();
        Thread.sleep(2000);

        WebElement month = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/button/div"));
        month.click();
        Thread.sleep(2000);
        WebElement day = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/table/tbody/tr[4]/td[3]/button/div"));
        day.click();
        Thread.sleep(2000);
        WebElement ok = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/button[2]/span"));
        ok.click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".v-btn--contained > .v-btn__content")).click();
        Thread.sleep(2000);

    }
}

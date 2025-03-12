package CI_CDTEST;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {

    WebDriver driver;
    
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://localhost:8083/");
    }


    @Test
    public void shouldAnswerWithTrue() {
        System.out.println("hi jabir");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}

package CI_CDTEST;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.junit.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {

    WebDriver driver;
    
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }


    @Test
    public void shouldAnswerWithTrue() {
        driver=new ChromeDriver();
        System.out.println("hi jabir");
        driver.get("http://localhost:8083/");
    	driver.findElement(By.id("employeeName")).sendKeys("jabir");
    	driver.findElement(By.id("employeeEmail")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("employeePosition")).sendKeys("engineer");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test
    public void verifyPageTittle() {
        driver=new ChromeDriver();
        String actualTittle=driver.getTitle();
    	String expectedTittle="Employee Management";
    	Assert.assertEquals(actualTittle, expectedTittle);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}

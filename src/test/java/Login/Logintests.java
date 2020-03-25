package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Logintests {

    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);

        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("email")).sendKeys("joyekong123@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("081355145");
        driver.findElement(By.id("loginbutton")).click();
    }

    public static void main(String args[]) throws InterruptedException {
        Logintests tests = new Logintests();
        tests.setUp();


    }
}

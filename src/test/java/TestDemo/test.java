package TestDemo;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

    public static void main(String[] args) throws InterruptedException {
        /*
         * Simple openning & close a site with implicit time
         * 
         */

        WebDriverManager.chromedriver().driverVersion("109.0.5414.74").setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://google.com/");
        driver.navigate().to("https://facebook.com/");
        /* Add Some Action and print it in terminal 
         * getURL , print title and other navigation
        */
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.navigate().back();
        Thread.sleep(2000);
        
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        
        Thread.sleep(2000);
        driver.close();

    }

}

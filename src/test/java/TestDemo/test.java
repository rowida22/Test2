package TestDemo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
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
        // String firstTab = driver.getWindowHandle(); // Switching
        // driver.navigate().to("https://facebook.com/");

        /*
         * Add Some Action and print it in terminal
         * getURL , print title and other navigation
         */

        // System.out.println(driver.getCurrentUrl());
        // System.out.println(driver.getTitle());

        // driver.navigate().back();
        // Thread.sleep(2000);

        // driver.navigate().forward();
        // Thread.sleep(2000);
        // driver.navigate().refresh();

        /*
         * Swithing to the original tabs
         * open it in new tab or window
         */

        // driver.switchTo().newWindow(WindowType.WINDOW);
        // driver.switchTo().newWindow(WindowType.TAB);
        // driver.switchTo().window(firstTab);

        driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("ActiveSession")).click();

        // driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        // WebElement frame = driver.findElement(By.name("packageFrame"));
        // driver.switchTo().frame(frame);
        // Thread.sleep(1000);
        // driver.findElement(By.linkText("Action")).click();
        // Thread.sleep(3000);
        // driver.close(); // Close only the last openned tab
        // driver.quit(); // Close the entire browser

    }

}

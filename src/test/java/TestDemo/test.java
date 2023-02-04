package TestDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

    public static void main(String[] args) throws InterruptedException, IOException {
        /*
         * Simple openning & close a site with implicit time
         * 
         */

        WebDriverManager.chromedriver().driverVersion("109.0.5414.74").setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        // driver.get("https://google.com/");
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
        driver.switchTo().defaultContent();

        // driver.manage().window().getSize().getWidth();
        // driver.manage().window().getSize().getHeight();

        // Dimension size = driver.manage().window().getSize();
        // System.out.println(size.getHeight());
        // System.out.println(size.getWidth());

        driver.manage().window().setSize(new Dimension(800, 600)); // set new dimension

        // driver.manage().window().getPosition().getX();
        // driver.manage().window().getPosition().getY();

        // Point position = driver.manage().window().getPosition();
        // System.out.println(position.getX());
        // System.out.println(position.getY());

        // driver.manage().window().setPosition(new Point(100, 100));
        // driver.manage().window().fullscreen();

        /* Get screenshot of testing */
        File ScreenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenShot, new File("./image.png"));

        // Thread.sleep(3000);
        // driver.close(); // Close only the last openned tab
        driver.quit(); // Close the entire browser

    }

}

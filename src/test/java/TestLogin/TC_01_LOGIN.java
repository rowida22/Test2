/* Passing valid email & password TC_01_LOGIN  */
package TestLogin;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01_LOGIN {
  public static void main(String[] args) throws IOException {

    WebDriverManager.chromedriver().driverVersion("109.0.5414.74").setup();
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    driver.switchTo().newWindow(WindowType.TAB);
    driver.navigate().to("https://www.facebook.com/");

    driver.findElement(By.id("email")).sendKeys("laila@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("test1234");
    driver.findElement(By.name("login")).click();

    File Fimg = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(Fimg, new File("I:\\Test2\\Test2\\ScreenShots\\img1.png"));

    driver.quit();

  }

}

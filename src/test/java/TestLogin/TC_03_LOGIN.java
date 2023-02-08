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

public class TC_03_LOGIN {
  public static void main(String[] args) throws IOException {

    WebDriverManager.chromedriver().driverVersion("109.0.5414.74").setup();
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    driver.switchTo().newWindow(WindowType.TAB);
    driver.navigate().to("https://www.facebook.com/");

    driver.findElement(By.name("email")).sendKeys("noha@gmail.com");
    driver.findElement(By.name("pass")).sendKeys("tetsgfuij");
    driver.findElement(By.id("loginbutton")).click();
    driver.findElement(By.className("._9ay7")).getText();

    File Timg = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(Timg, new File("I:\\Test2\\Test2\\ScreenShots\\img3.png"));

    driver.quit();

  }

}

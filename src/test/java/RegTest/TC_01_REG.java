package RegTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01_REG {
  public static void main(String[] args) throws IOException {

    WebDriverManager.chromedriver().driverVersion("109.0.5414.74").setup();
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    driver.switchTo().newWindow(WindowType.TAB);
    driver.navigate().to("https://www.facebook.com/");

    driver.findElement(By.id("u_0_0_LE")).click();
    // driver.findElement(By.name("firstname")).sendKeys("soha");
    // driver.findElement(By.name("lastname")).sendKeys("ahmed");
    // driver.findElement(By.name("reg_email__")).sendKeys("sohaahmed23@gmail.com");
    // driver.findElement(By.id("password_step_input")).sendKeys("blahbalsh1234");
    // // missing 2 featuers Date and gender
    // driver.findElement(By.id("u_8_s_qH")).click();

    // File R1img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    // FileUtils.copyFile(R1img, new
    // File("I:\\Test2\\Test2\\ScreenShots\\R1img.png"));

    driver.quit();

  }

}

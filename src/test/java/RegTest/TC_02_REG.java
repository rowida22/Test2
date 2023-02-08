/* Registration form with blank field data TC_01_REG  */
package RegTest;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_02_REG {
  public static void main(String[] args) throws IOException {

    WebDriverManager.chromedriver().driverVersion("109.0.5414.74").setup();
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("https://www.google.com/");
    driver.switchTo().newWindow(WindowType.TAB);
    driver.navigate().to("https://www.facebook.com/signup");

    driver.findElement(By.name("firstname")).sendKeys("soha");
    driver.findElement(By.name("lastname")).sendKeys("ahmed");
    driver.findElement(By.name("reg_email__")).sendKeys("sohaahmed637@gmail.com");
    driver.findElement(By.cssSelector("[name='reg_email_confirmation__']")).sendKeys("sohaahmed637@gmail.com");
    driver.findElement(By.cssSelector("[id='password_step_input']")).sendKeys("olabakdjkh123");

    Select selDay = new Select(driver.findElement(By.id("day")));
    selDay.selectByValue("2");
    Select selMonth = new Select(driver.findElement(By.id("month")));
    selMonth.selectByVisibleText("Mar");
    Select selYear = new Select(driver.findElement(By.name("birthday_year")));
    selYear.selectByValue("2002");
    // driver.findElement(By.cssSelector("[class='_8esa']")).click(); // radio
    // button gender female only
    driver.findElement(By.cssSelector("[name='websubmit']")).click();

    File R2img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(R2img, new File("I:\\Test2\\Test2\\ScreenShots\\R2img.png"));

    driver.quit();

  }

}

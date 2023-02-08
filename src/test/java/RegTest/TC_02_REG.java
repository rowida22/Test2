/* Registration form with valid data TC_01_REG  */
package RegTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_02_REG {
  public static void main(String[] args) {

    WebDriverManager.chromedriver().driverVersion("109.0.5414.74").setup();
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("https://www.google.com/");
    driver.switchTo().newWindow(WindowType.TAB);
    driver.navigate().to("https://www.facebook.com/signup");

    driver.findElement(By.name("firstname")).sendKeys("soha");
    driver.findElement(By.name("lastname")).sendKeys("ahmed");
    driver.findElement(By.name("reg_email__")).sendKeys("walaOthman@gmail.com");
    driver.findElement(By.cssSelector("[name='reg_email_confirmation__']")).sendKeys("walaOthman@gmail.com");
    
    driver.findElement(By.cssSelector("[id='password_step_input']")).sendKeys("olabakdjkh123");

    // driver.quit();

  }

}

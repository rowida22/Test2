/* Registration form with valid data TC_01_REG  */
package RegTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import page.WelcomePage;

public class TC_01_REG {
  // public static void main(String[] args) throws IOException {

  //   WebDriverManager.chromedriver().driverVersion("109.0.5414.74").setup();
  //   WebDriver driver = new ChromeDriver();

  //   driver.manage().window().maximize();
  //   driver.get("https://www.google.com/");
  //   driver.switchTo().newWindow(WindowType.TAB);
  //   driver.navigate().to("https://www.facebook.com/signup");

  //   driver.findElement(By.name("firstname")).sendKeys("walaa");
  //   driver.findElement(By.name("lastname")).sendKeys("othman");
  //   driver.findElement(By.name("reg_email__")).sendKeys("walaOthman@gmail.com");
  //   driver.findElement(By.cssSelector("[name='reg_email_confirmation__']")).sendKeys("walaOthman@gmail.com");
  //   driver.findElement(By.cssSelector("[id='password_step_input']")).sendKeys("olabakdjkh123");

  //   Select selDay = new Select(driver.findElement(By.id("day")));
  //   selDay.selectByVisibleText("25");
  //   Select selMonth = new Select(driver.findElement(By.id("month")));
  //   selMonth.selectByVisibleText("May");
  //   Select SelYear = new Select(driver.findElement(By.id("year")));
  //   SelYear.selectByValue("1992");
  //   driver.findElement(By.cssSelector("[class='_8esa']")).click(); // radio button gender female only
  //   driver.findElement(By.cssSelector("[name='websubmit']")).click();

  //   File R1img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  //   FileUtils.copyFile(R1img, new File("I:\\Test2\\Test2\\ScreenShots\\R1img.png"));

  //   driver.quit();

  // }

    //POM
  @Test
  public void WelcomePage() {

    WebDriver driver = null;
    driver.manage().window().maximize();
    driver = new ChromeDriver();
    WelcomePage welcomePage = new welcomePage(driver);
    driver.get("https://google.com/");
    driver.switchTo().newWindow(WindowType.TAB);
    driver.navigate().to("https://www.facebook.com/signup");
    welcomePage.click();

  }

}


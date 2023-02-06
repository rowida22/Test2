/* Passing valid email & password TC_01_LOGIN  */
package TestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ftest {

  public static void main(String[] args) {

    WebDriverManager.chromedriver().driverVersion("109.0.5414.74").setup();
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    driver.switchTo().newWindow(WindowType.TAB);
    driver.navigate().to("https://facebook.com/");

    driver.findElement(By.id("email"));
    driver.findElement(By.id("passContainer"));
    driver.findElement(By.name("login"));

    driver.quit();

  }

}

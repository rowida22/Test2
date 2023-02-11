package CheckAllBefore;

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
public class AllFeature {
  public static void main(String[] args) {
    
    WebDriverManager.chromedriver().driverVersion("109.0.5414.74").setup();
    WebDriver driver  = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("http://www.google.com");
    driver.switchTo().newWindow(WindowType.TAB);
    driver.navigate().to("https://www.facebook.com");

    Boolean ExEmail = driver.findElement(By.cssSelector("[data-testid='royal_email']")).isDisplay();
    System.out.println(ExEmail);
    String ExPass = driver.findElement(By.cssSelector("[data-test='royal_pass']")).getAcessibleName();
    System.out.println(ExPass);
    /*
     * And do the same for each element
     * isEnable () to check if there ability to write in
     */

  }
  
}

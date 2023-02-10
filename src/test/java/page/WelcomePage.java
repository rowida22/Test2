package page;

import org.openqa.selenium.By;

public class WelcomePage {

  private By createNewAccount = By.cssSelector("[data-testid='open-registration-form-button']");
  private WebDriver driver;

  //Constractor
  public <WebDriver> WelcomePage(WebDriver driver)
  {
      
    this.driver = (page.WebDriver) driver;
  }
  
  public void clickCreateAccount(){
    driver.findElement(createNewAccount).click();

  }


  public void click() {
  }
}

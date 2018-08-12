package com.inss.atmn.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

  @FindBy(id = "username")
  private WebElement usernameInput;

  @FindBy(id = "password")
  private WebElement passwordInput;

  @FindBy(xpath = ".//button[@type='submit']")
  private WebElement submitButton;

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public void enterUsername(String str) {
    usernameInput.sendKeys(str);
  }

  public void enterPassword (String str) {
    passwordInput.sendKeys(str);
  }

  public void clickSubmitButton() {
    submitButton.click();

  }
}

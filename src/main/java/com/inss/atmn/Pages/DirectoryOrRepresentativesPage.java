package com.inss.atmn.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectoryOrRepresentativesPage extends BasePage {

  @FindBy(xpath = "//a[contains(@href,'state')]")
  private WebElement alphabethLink;

  public DirectoryOrRepresentativesPage(WebDriver driver) {
    super(driver);
  }

  public WebElement gotoState(String stateName) {

    String stateTableXpath = String
        .format("//caption[contains(@id, 'state')] and contains(text(), '%s')", stateName);
    return driver.findElement(By.xpath(stateTableXpath));
  }

  private List<WebElement> getDistrictWebElementsByState() {
    String districtTableNameXpath = "//tbody//tr//td[1]";
    return driver.findElements(By.xpath(districtTableNameXpath));
  }

  public String getDistrictTexts(String stateName) {
    gotoState(stateName)
  }


  String representativeNameTableXpath = "//tbody//tr//td[2]";
  String partyTableXpath = "//tbody//tr//td[3]";
  String officeRoomTableXpath = "//tbody//tr//td[4]";
  String phoneTableXpath = "//tbody//tr//td[5]";
  String comitteeTableXpath = "//tbody//tr//td[6]";

}

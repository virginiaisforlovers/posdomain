package com.inss.atmn.Pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


//https://www.house.gov/representatives
public class DirectoryOrRepresentativesPage extends BasePage {

  @FindBy(xpath = "//a[contains(@href,'state')]")
  private WebElement alphabethLink;

  public DirectoryOrRepresentativesPage(WebDriver driver) {
    super(driver);
  }


  private List<WebElement> getDistrictWebElementsByState(String state) {
    String districtXpath = String.format(
        "//table[@class='table' and caption[contains(@id, 'state') and contains(text(), '%s')]]//tbody//tr//td[1]", state);
    return driver.findElements(By.xpath(districtXpath));
  }

  public void getDistrictsByState(String state) {
    List<WebElement> listDistrict = new ArrayList<WebElement>();
    for (int i=0; i<listDistrict.size(); i++){
      System.out.println(listDistrict.get(i).getText());
    }
  }


  String representativeNameTableXpath = "//tbody//tr//td[2]";
  String partyTableXpath = "//tbody//tr//td[3]";
  String officeRoomTableXpath = "//tbody//tr//td[4]";
  String phoneTableXpath = "//tbody//tr//td[5]";
  String comitteeTableXpath = "//tbody//tr//td[6]";

}

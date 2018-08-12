package com.inss.atmn.Pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


//https://www.house.gov/representatives
public class RepresentativesPage extends BasePage {

  @FindBy(xpath = "//a[contains(@href,'state')]")
  private WebElement alphabethLink;

  public RepresentativesPage(WebDriver driver) {
    super(driver);
  }


  private List<WebElement> getWebElementsByState(String state, int columnNumber) {
    String districtXpath = String.format(
          "//table[@class='table' and caption[contains(@id, 'state') and contains(text(), '%s')]]//tbody//tr//td[%d]",
        state, columnNumber);
    return driver.findElements(By.xpath(districtXpath));
  }

  public List<String> getDistrictsByState(String state) {
    List<WebElement> listDistrict = getWebElementsByState(state, 1);
    List<String> stringList = new ArrayList<String>();
    for (int i=0; i<listDistrict.size(); i++) {
      stringList.add(listDistrict.get(i).getText());
    }
    return stringList;
  }

  public void getRepresentativeNameByState(String state) {
    List<WebElement> listDistrict = getWebElementsByState(state, 2);
    for (int i = 0; i < listDistrict.size(); i++) {
      System.out.println(listDistrict.get(i).getText());
    }
  }

  public void getPartyByState(String state) {
    List<WebElement> listDistrict = getWebElementsByState(state, 3);
    for (int i = 0; i < listDistrict.size(); i++) {
      System.out.println(listDistrict.get(i).getText());
    }
  }

  public void getOfficerRoomByState(String state) {
    List<WebElement> listDistrict = getWebElementsByState(state, 4);
    for (int i = 0; i < listDistrict.size(); i++) {
      System.out.println(listDistrict.get(i).getText());
    }
  }

  public void getPhoneByState(String state) {
    List<WebElement> listDistrict = getWebElementsByState(state, 5);
    for (int i = 0; i < listDistrict.size(); i++) {
      System.out.println(listDistrict.get(i).getText());
    }
  }

  public void getCommitteeByState(String state) {
    List<WebElement> listDistrict = getWebElementsByState(state, 6);
    for (int i = 0; i < listDistrict.size(); i++) {
      System.out.println(listDistrict.get(i).getText());
    }
  }

}

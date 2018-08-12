package com.inss.atmn.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaseManagementPage extends BasePage {

  @FindBy(id = "Nav_CreateCase")
  public WebElement createEventLink;

  @FindBy(id = "Nav_SearchCase")
  private WebElement searchEventtLink;

  @FindBy(id = "Nav_Workflows")
  private WebElement workflowLink;

  @FindBy(id = "Nav_UpdateRoster")
  private WebElement importRosterLink;

  @FindBy(id = "Nav_ReferenceParties")
  private WebElement updateRosterLink;

  @FindBy(id = "Nav_ImportCases")
  private WebElement importEventsLink;

  @FindBy(id = "Nav_ExportCases")
  private WebElement exportEventsLink;

  @FindBy(xpath = ".//h1[@class = 'pageTitle' and contains(text(), 'Import Cases')]")
  private WebElement ImportCasesHeader;


  public CaseManagementPage(WebDriver driver) {
    super(driver);
  }

  public void clickImportEventsLink() {
    importEventsLink.click();
  }

  public void clickExportEventsLink() {
    exportEventsLink.click();
  }

  public String getImportCasesHeaderText() {
    return ImportCasesHeader.getText();
  }

}

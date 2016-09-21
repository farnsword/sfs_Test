package com.sfs.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Oleksii on 21.09.2016.
 */
public class DeclarationPage {
    private WebDriver driver;

//    "Anchor" to check if the page opened
    @FindBy(xpath = ".//span[@id=\"templ:tpt_l4::text\"]")
    private WebElement anchorHeader;

//    Constructor
    public DeclarationPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    Method to check if the page opened - assertion
    public boolean isPageOpened(){
        return anchorHeader.getText().toString().contains("Декларація про майновий стан");
    }

    @FindBy(css = "div#HZ")
    private WebElement declarType;

    @FindBy(xpath = ".//input[@id = \"0_HZY\"]")
    private WebElement declarYear;

    @FindBy(xpath = ".//input[@id=\"0_HNAME\"]")
    private WebElement payerName;

    @FindBy(xpath = ".//input[@id = \"0_HTIN\"]")
    private WebElement registrOrPassport;

    @FindBy (xpath = ".//input[@id=\"0_HREG\"]")
    private WebElement payerObl;

    @FindBy (css = "#HRAJ")
    private WebElement payerRegion;

    @FindBy (css = "#HCITY")
    private WebElement payerCity;

    @FindBy (xpath = ".//input[@id=\"0_HSTREET\"]")
    private WebElement payerStreet;

    @FindBy (xpath = ".//input[@id=\"0_HBUILD\"]")
    private WebElement payerBuild;

    @FindBy (xpath = ".//input[@id=\"0_HCORP\"]")
    private WebElement payerCorp;




    public void setDeclareType(){

    }


    public void setDeclarYear(String year) {
        declarYear.clear();
        declarYear.sendKeys(year);
    }

    public void setPayerName(String name) {
        payerName.clear();
        payerName.sendKeys(name);
    }

    public void setRegistrOrPassport(String number) {
        registrOrPassport.clear();
        registrOrPassport.sendKeys(number);
    }

    public void setPayerObl(String obl) {
        payerObl.clear();
        payerObl.sendKeys(obl);
    }

    public void setPayerRegion(String region) {
        payerRegion.clear();
        payerRegion.sendKeys(region);
    }

    public void setPayerCity(String city) {
        payerCity.clear();
        payerCity.sendKeys(city);
    }

    public void setPayerStreet(String street) {
        payerStreet.clear();
        payerStreet.sendKeys(street);
    }

    public void setPayerBuild(String build) {
        payerBuild.clear();
        payerBuild.sendKeys(build);
    }

    public void setPayerCorp(String corp) {
        payerCorp.clear();
        payerCorp.sendKeys(corp);
    }
}

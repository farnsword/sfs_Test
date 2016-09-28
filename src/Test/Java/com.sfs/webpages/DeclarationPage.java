package com.sfs.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Oleksii on 21.09.2016.
 */
public class DeclarationPage {
    private WebDriver driver;


    public DeclarationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean isPageOpened() {
        return driver.findElements(By.xpath(".//span[@id=\"templ:tpt_l4::text\"]")).size() > 0;
    }

    @FindBy(css = "div#HZ")
    public WebElement declarType;

    @FindBy(id = "HZY")
    public WebElement preDeclarYear;
    @FindBy(xpath = ".//input[@id = \"0_HZY\"]")
    private WebElement declarYear;

    @FindBy(id = "HNAME")
    public WebElement prePayerName;
    @FindBy(xpath = ".//input[@id=\"0_HNAME\"]")
    private WebElement payerName;

    @FindBy(id = "HTIN")
    public WebElement preRegisrOrPassport;
    @FindBy(xpath = ".//input[@id = \"0_HTIN\"]")
    private WebElement registrOrPassport;

    @FindBy(id = "HREG")
    public WebElement prePayerObl;
    @FindBy(xpath = ".//input[@id=\"0_HREG\"]")
    private WebElement payerObl;

    @FindBy(id = "HRAJ")
    public WebElement prePayerRegion;
    @FindBy(xpath = ".//input[@id=\"0_HRAJ\"]")
    private WebElement payerRegion;

    @FindBy(id = "HCITY")
    public WebElement prePayerCity;
    @FindBy(xpath = ".//input[@id=\"0_HCITY\"]")
    private WebElement payerCity;

    @FindBy(id = "HSTREET")
    public WebElement prePayerStreet;
    @FindBy(xpath = ".//input[@id=\"0_HSTREET\"]")
    private WebElement payerStreet;

    @FindBy(id = "HBUILD")
    public WebElement prePayerBuild;
    @FindBy(xpath = ".//input[@id=\"0_HBUILD\"]")
    private WebElement payerBuild;

    @FindBy(id = "HCORP")
    public WebElement prePayerCorp;
    @FindBy(xpath = ".//input[@id=\"0_HCORP\"]")
    private WebElement payerCorp;

    @FindBy(id = "HAPT")
    public WebElement prePayerApt;
    @FindBy(xpath = ".//input[@id=\"0_HAPT\"]")
    private WebElement payerApt;

    @FindBy(id = "HZIP")
    public WebElement prePayerZip;
    @FindBy(xpath = ".//input[@id=\"0_HZIP\"]")
    private WebElement payerZip;

    @FindBy(id = "HTEL")
    public WebElement prePayerTel;
    @FindBy(xpath = ".//input[@id=\"0_HTEL\"]")
    private WebElement payerTel;

    @FindBy(id = "HEMAIL")
    public WebElement prePayerEmail;
    @FindBy(xpath = ".//input[@id=\"0_HEMAIL\"]")
    private WebElement payerEmail;

    @FindBy(id = "HSTI")
    public WebElement preAuthority;
    @FindBy(xpath = ".//input[@id=\"0_HSTI\"]")
    private WebElement authority;

    @FindBy(id = "H01")
    public WebElement residentStatus;

    @FindBy(id = "H03")
    public WebElement whoFilled;

    @FindBy(id = "H05")
    public WebElement payerCategory;

    @FindBy(id = "R010G3")
    public WebElement preSumIncome;
    @FindBy(xpath = ".//input[@id=\"0_R010G3\"]")
    private WebElement sumIncome;

//    @FindBy(id = "R010G4")
//    private WebElement
//    @FindBy(xpath = ".//input[@id=\"0_R010G4\"]")
//    private WebElement

//    @FindBy(id = "R010G5")
//    private WebElement
//    @FindBy(xpath = ".//input[@id=\"0_R010G5\"]")


//    public void setDeclareType() {
//
//    }

    public void clickPreElement(WebElement preElem) {
        preElem.click();
    }

//    public void setValue(WebElement elem, String value) {
//        elem.clear();
//        elem.sendKeys(value);
//    }


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

    public void setPayerApt(String apt) {
        payerApt.clear();
        payerApt.sendKeys(apt);
    }

    public void setPayerZip(String zip){
        payerZip.clear();
        payerZip.sendKeys(zip);
    }

    public void setPayerTel(String tel){
        payerTel.clear();
        payerTel.sendKeys(tel);
    }

    public void setPayerEmail(String email){
        payerEmail.clear();
        payerEmail.sendKeys(email);
    }

    public void setAuthority(String auth){
        authority.clear();
        authority.sendKeys(auth);
    }

    public void setSumIncome(String inc){
        sumIncome.clear();
        sumIncome.sendKeys(inc);
    }

}

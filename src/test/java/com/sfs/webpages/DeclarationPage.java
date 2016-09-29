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
    public WebElement declarationType;

    @FindBy(id = "HZY")
    public WebElement preDeclarationYear;
    @FindBy(xpath = ".//input[@id = \"0_HZY\"]")
    private WebElement declarationYear;

    @FindBy(id = "HNAME")
    public WebElement prePayerName;
    @FindBy(xpath = ".//input[@id=\"0_HNAME\"]")
    private WebElement payerName;

    @FindBy(id = "HTIN")
    public WebElement preRegisterOrPassport;
    @FindBy(xpath = ".//input[@id = \"0_HTIN\"]")
    private WebElement registerOrPassport;

    @FindBy(id = "HREG")
    public WebElement prePayerRegion;
    @FindBy(xpath = ".//input[@id=\"0_HREG\"]")
    private WebElement payerRegion;

    @FindBy(id = "HRAJ")
    public WebElement prePayerDistrict;
    @FindBy(xpath = ".//input[@id=\"0_HRAJ\"]")
    private WebElement payerDistrict;

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
    public WebElement prePayerHousing;
    @FindBy(xpath = ".//input[@id=\"0_HCORP\"]")
    private WebElement payerHousing;

    @FindBy(id = "HAPT")
    public WebElement prePayerApartment;
    @FindBy(xpath = ".//input[@id=\"0_HAPT\"]")
    private WebElement payerApartment;

    @FindBy(id = "HZIP")
    public WebElement prePayerZip;
    @FindBy(xpath = ".//input[@id=\"0_HZIP\"]")
    private WebElement payerZip;

    @FindBy(id = "HTEL")
    public WebElement prePayerTelephone;
    @FindBy(xpath = ".//input[@id=\"0_HTEL\"]")
    private WebElement payerTelephone;

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
    public WebElement preSummaryIncome;
    @FindBy(xpath = ".//input[@id=\"0_R010G3\"]")
    private WebElement summaryIncome;

    @FindBy(id = "HBOS")
    public WebElement prePayer;
    @FindBy(xpath = ".//input[@id=\"0_HBOS\"]")
    private WebElement payer;


    public void clickPreElement(WebElement preElem) {
        preElem.click();
    }

    public void setDeclarationYear(String year) {
        declarationYear.clear();
        declarationYear.sendKeys(year);
    }

    public void setPayerName(String name) {
        payerName.clear();
        payerName.sendKeys(name);
    }

    public void setRegisterOrPassport(String number) {
        registerOrPassport.clear();
        registerOrPassport.sendKeys(number);
    }

    public void setPayerRegion(String obl) {
        payerRegion.clear();
        payerRegion.sendKeys(obl);
    }

    public void setPayerDistrict(String region) {
        payerDistrict.clear();
        payerDistrict.sendKeys(region);
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

    public void setPayerHousing(String corp) {
        payerHousing.clear();
        payerHousing.sendKeys(corp);
    }

    public void setPayerApartment(String apt) {
        payerApartment.clear();
        payerApartment.sendKeys(apt);
    }

    public void setPayerZip(String zip){
        payerZip.clear();
        payerZip.sendKeys(zip);
    }

    public void setPayerTelephone(String tel){
        payerTelephone.clear();
        payerTelephone.sendKeys(tel);
    }

    public void setPayerEmail(String email){
        payerEmail.clear();
        payerEmail.sendKeys(email);
    }

    public void setAuthority(String auth){
        authority.clear();
        authority.sendKeys(auth);
    }

    public void setSummaryIncome(String inc){
        summaryIncome.clear();
        summaryIncome.sendKeys(inc);
    }

    public void setPayer(String pay){
        payer.clear();
        payer.sendKeys(pay);
    }

}

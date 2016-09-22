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

    @FindBy(id = HZY)
	private WebElement preDeclarYear;
    @FindBy(xpath = ".//input[@id = \"0_HZY\"]")
    private WebElement declarYear;
   	
 	@FindBy(id = HNAME)
	private WebElement prePayerName;
    @FindBy(xpath = ".//input[@id=\"0_HNAME\"]")
    private WebElement payerName;
   	
 	@FindBy(id = HTIN)
	private WebElement prePegisrOrPassport;
    @FindBy(xpath = ".//input[@id = \"0_HTIN\"]")
    private WebElement registrOrPassport;
   	
 	@FindBy(id = HREG)
	private WebElement prePayerObl;
    @FindBy (xpath = ".//input[@id=\"0_HREG\"]")
    private WebElement payerObl;
   	
 	@FindBy(id = HRAJ)
    private WebElement prePayerRegion;
    @FindBy (xpath = ".//input[@id=\”0_HRAJ\"]”)
    private WebElement payerRegion;
   	
 	@FindBy(id = HCITY)
	private WebElement prePayerCity;
    @FindBy (xpath = ".//input[@id=\”0_HCITY\"]”)
    private WebElement payerCity;
   	
 	@FindBy(id = HSTREET)
	private WebElement prePayerStreet;
    @FindBy (xpath = ".//input[@id=\"0_HSTREET\"]")
    private WebElement payerStreet;
   	
 	@FindBy(id = HBUILD)
	private WebElement prePayerBuild;
    @FindBy (xpath = ".//input[@id=\"0_HBUILD\"]")
    private WebElement payerBuild;
   	
    @FindBy(id = HCORP)
    private WebElement prePayerCorp;
    @FindBy (xpath = ".//input[@id=\"0_HCORP\"]")
    private WebElement payerCorp;
   	
    @FindBy(id = HAPT)
    private WebElement prePayerApt;
    @FindBy (xpath = “.//input[@id=\”0_HAPT\”]”
    private WebElement payerApt;

	@FindBy(id = HZIP)
	private WebElement prePayerZip
	@FindBy(xpath = “.//input[@id=\”0_HZIP\”]”)
	private WebElement payerZip;

	@FindBy(id = HTEL)
	private WebElement prePayerTel;
	@FindBy(xpath = “.//input[@id=\”0_HTEL\”]”)
	private WebElement payerTel;

	@FindBy(id = HEMAIL)
	private WebElement prePayerEmail;
	@FindBy(xpath = “.//input[@id=\”0_HEMAIL\”]”)
	private WebElement payerEmail;
            	
    @FindBy(id = HSTI)
    private WebElement preAuthority;
    @FindBy(xpath = “.//input[@id=\”0_HSTI\”]”)
    private WebElement authority;

    @FindBy(id = H01)
    private WebElement residentStatus;

    @FindBy(id = H03)
    private WebElement whoFilled;




    public void setDeclareType(){

    }
    
    public void clickPreElement(WebElement preElem){
        preElem.click();
    }
    
    public void setValue(WebElement elem, String value){
        elem.clear();
        elem.sendKeys(value);
    }

/*
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
*/
}

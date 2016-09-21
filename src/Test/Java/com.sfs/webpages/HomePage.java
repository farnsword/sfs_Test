package com.sfs.webpages;

/**
 * Created by Oleksii on 21.09.2016.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    //Target page url
    private static String WEB_PAGE_URL = "https://cabinet.sfs.gov.ua/cabinet/faces/index.jspx";

    //"Декларація про майновий стан" link
    @FindBy(xpath = ".//div[@id=\"templ:b16\"]/a")
    private WebElement declar;

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get(WEB_PAGE_URL);
        PageFactory.initElements(driver, this);
    }

//    Clicking "Декларація про майновий стан" button method
    public void clickDeclarButton(){
        declar.click();
    }


}

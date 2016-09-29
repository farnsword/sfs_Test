package com.sfs.webpages;

/**
 * Created by Oleksii on 21.09.2016.
 */

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    private WebDriver driver;

    private static
    String WEB_PAGE_URL = "https://cabinet.sfs.gov.ua/cabinet/faces/index.jspx";

    @FindBy(xpath = ".//div[@id=\"templ:b16\"]/a/span")
    private WebElement declar;

    @FindBy(xpath = ".//div[@id=\"templ:b16\"]/a")
    private WebElement linkToCheck;



    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get(WEB_PAGE_URL);
        PageFactory.initElements(driver, this);
    }


    public void clickDeclarButton() {
        String jsVisChange = "arguments[0].style.visibility='visible';";
        ((JavascriptExecutor) driver).executeScript(jsVisChange, linkToCheck);
        String jsFocus = "arguments[0].focus();return false;";
        ((JavascriptExecutor) driver).executeScript(jsFocus, linkToCheck);
//        linkToCheck.click();

        Actions cl = new Actions(driver);
        cl.moveToElement(linkToCheck).click().perform();

    }

    public String textOfDeclarButton(){
        return declar.getText();
    }

}

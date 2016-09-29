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
    private WebElement declaration;

    @FindBy(xpath = ".//div[@id=\"templ:b16\"]/a")
    private WebElement linkOfDeclarationButton;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get(WEB_PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickDeclarationButton() {
        String jsVisibleChange = "arguments[0].style.visibility='visible';";
        ((JavascriptExecutor) driver).executeScript(jsVisibleChange, linkOfDeclarationButton);
        String jsFocus = "arguments[0].focus();return false;";
        ((JavascriptExecutor) driver).executeScript(jsFocus, linkOfDeclarationButton);

        Actions cl = new Actions(driver);
        cl.moveToElement(linkOfDeclarationButton).click().perform();
    }

    public String textOfDeclarButton(){
        return declaration.getText();
    }
}

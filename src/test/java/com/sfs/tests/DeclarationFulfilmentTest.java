package com.sfs.tests;

import com.sfs.webpages.DeclarationPage;
import com.sfs.webpages.HomePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


/**
 * Created by Oleksii on 22.09.2016.
 */
public class DeclarationFulfilmentTest {

    WebDriver driver;

    @Before
    public void setup(){
//        System.setProperty("webdriver.gecko.driver", "D:\\Job\\Testing\\geckodriver\\geckodriver.exe");
//        System.setProperty("webdriver.chrome.driver", "D:\\Job\\Testing\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "D:\\Job\\Testing\\MicrosoftWebDriver.exe");

        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testFillingDeclaration(){
        HomePage testHomePage = new HomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//div[@id=\"templ:b16\"]/a")));
        Assert.assertEquals("Декларація про майновий стан", testHomePage.textOfDeclarButton());
        testHomePage.clickDeclarationButton();

        DeclarationPage testDeclarationPage = new DeclarationPage(driver);
        Assert.assertTrue(testDeclarationPage.isPageOpened());
        driver.switchTo().frame("templ:r1:0:iffarmeData::f");

        testDeclarationPage.declarationType.click();

        testDeclarationPage.clickPreElement(testDeclarationPage.preDeclarationYear);
        testDeclarationPage.setDeclarationYear("2015");

        testDeclarationPage.clickPreElement(testDeclarationPage.prePayerName);
        testDeclarationPage.setPayerName("Іванов Іван Іванович");

        testDeclarationPage.clickPreElement(testDeclarationPage.preRegisterOrPassport);
        testDeclarationPage.setRegisterOrPassport("АА000000");

        testDeclarationPage.clickPreElement(testDeclarationPage.prePayerRegion);
        testDeclarationPage.setPayerRegion("Київська");

        testDeclarationPage.clickPreElement(testDeclarationPage.prePayerDistrict);
        testDeclarationPage.setPayerDistrict("Київський");

        testDeclarationPage.clickPreElement(testDeclarationPage.prePayerCity);
        testDeclarationPage.setPayerCity("Київ");

        testDeclarationPage.clickPreElement(testDeclarationPage.prePayerStreet);
        testDeclarationPage.setPayerStreet("Петра Малицького");

        testDeclarationPage.clickPreElement(testDeclarationPage.prePayerBuild);
        testDeclarationPage.setPayerBuild("15");

        testDeclarationPage.clickPreElement(testDeclarationPage.prePayerHousing);
        testDeclarationPage.setPayerHousing("1");

        testDeclarationPage.clickPreElement(testDeclarationPage.prePayerApartment);
        testDeclarationPage.setPayerApartment("42");

        testDeclarationPage.clickPreElement(testDeclarationPage.prePayerZip);
        testDeclarationPage.setPayerZip("00000");

        testDeclarationPage.clickPreElement(testDeclarationPage.prePayerTelephone);
        testDeclarationPage.setPayerTelephone("+380440000000");

        testDeclarationPage.clickPreElement(testDeclarationPage.prePayerEmail);
        testDeclarationPage.setPayerEmail("test@test.test");

//        by the time of performing the test this field has no input
//        so there was no way to fill it
//        testDeclarationPage.clickPreElement(testDeclarationPage.preAuthority);
//        testDeclarationPage.setAuthority("Податкова інспекція");

        testDeclarationPage.residentStatus.click();

        testDeclarationPage.whoFilled.click();

        testDeclarationPage.payerCategory.click();

        testDeclarationPage.clickPreElement(testDeclarationPage.preSummaryIncome);
        testDeclarationPage.setSummaryIncome("40000");

        testDeclarationPage.clickPreElement((testDeclarationPage.prePayer));
        testDeclarationPage.setPayer("Іванов Іван Іванович");

    }

}

package com.sfs.tests;

import com.sfs.webpages.DeclarationPage;
import com.sfs.webpages.HomePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        System.setProperty("webdriver.chrome.driver", "D:\\Job\\Testing\\chromedriver\\chromedriver.exe");
//
//        System.setProperty("webdriver.edge.driver", "D:\\Job\\Testing\\MicrosoftWebDriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testMethod(){
        HomePage testHomePage = new HomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//div[@id=\"templ:b16\"]/a")));
        Assert.assertEquals("Декларація про майновий стан", testHomePage.textOfDeclarButton());
        testHomePage.clickDeclarButton();

        DeclarationPage testDeclarPage = new DeclarationPage(driver);
        Assert.assertTrue(testDeclarPage.isPageOpened());
        driver.switchTo().frame("templ:r1:0:iffarmeData::f");

        testDeclarPage.declarType.click();

        testDeclarPage.clickPreElement(testDeclarPage.preDeclarYear);
        testDeclarPage.setDeclarYear("2015");

        testDeclarPage.clickPreElement(testDeclarPage.prePayerName);
        testDeclarPage.setPayerName("Іванов Іван Іванович");

        testDeclarPage.clickPreElement(testDeclarPage.preRegisrOrPassport);
        testDeclarPage.setRegistrOrPassport("АА000000");

        testDeclarPage.clickPreElement(testDeclarPage.prePayerObl);
        testDeclarPage.setPayerObl("Київська");

        testDeclarPage.clickPreElement(testDeclarPage.prePayerRegion);
        testDeclarPage.setPayerRegion("Київський");

        testDeclarPage.clickPreElement(testDeclarPage.prePayerCity);
        testDeclarPage.setPayerCity("Київ");

        testDeclarPage.clickPreElement(testDeclarPage.prePayerStreet);
        testDeclarPage.setPayerStreet("Петра Малицького");

        testDeclarPage.clickPreElement(testDeclarPage.prePayerBuild);
        testDeclarPage.setPayerBuild("15");

        testDeclarPage.clickPreElement(testDeclarPage.prePayerCorp);
        testDeclarPage.setPayerCorp("1");

        testDeclarPage.clickPreElement(testDeclarPage.prePayerApt);
        testDeclarPage.setPayerApt("42");

        testDeclarPage.clickPreElement(testDeclarPage.prePayerZip);
        testDeclarPage.setPayerZip("00000");

        testDeclarPage.clickPreElement(testDeclarPage.prePayerTel);
        testDeclarPage.setPayerTel("+380440000000");

        testDeclarPage.clickPreElement(testDeclarPage.prePayerEmail);
        testDeclarPage.setPayerEmail("test@test.test");

//        testDeclarPage.clickPreElement(testDeclarPage.preAuthority);
//        testDeclarPage.setAuthority("Податкова інспекція");

        testDeclarPage.residentStatus.click();

        testDeclarPage.whoFilled.click();

        testDeclarPage.payerCategory.click();

        testDeclarPage.clickPreElement(testDeclarPage.preSumIncome);
        testDeclarPage.setSumIncome("40000");

        testDeclarPage.clickPreElement((testDeclarPage.prePayer));
        testDeclarPage.setPayer("Іванов Іван Іванович");

    }

}

package com.romio;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogingPageTestCase {


    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }

    @Test
    public void testLogInPage() {
        directOpenLogInPage();
        Assert.assertEquals(driver.findElement(By.xpath("//p[@class='lead']")).getText(), "Please login to make appointment.");
    }

    @Test
    public void testLogInPageWithValidInput() throws InterruptedException {
        logInPageWithValidInput();
    }

    public void directOpenLogInPage() {
        driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
        driver.findElement(By.xpath("//a[@ id='menu-toggle']")).click();
        driver.findElement(By.xpath("//a[text()='Login']")).click();

    }

    public void logInPageWithValidInput() throws InterruptedException {
        directOpenLogInPage();
        driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
        driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.xpath("//button[@id='btn-login']")).click();

//        try {
//            Alert alert = driver.switchTo().alert();
//            System.out.println("--------------------" + alert.getText());
//            alert.accept();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}

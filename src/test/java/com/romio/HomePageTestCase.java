package com.romio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomePageTestCase {

    WebDriver driver;

    @BeforeClass
    public void setup() {
         driver = new ChromeDriver();
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }

    @Test
    public void testHomePageWithDirectLink() {
        homePageOpen();
        Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='CURA Healthcare Service']")).getText(),"CURA Healthcare Service");

    }

    @Test
    public void testHomePageWithSideBar() {
        homepageThroughSideBar();
       Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='CURA Healthcare Service']")).getText(),"CURA Healthcare Service");
    }

    public void homePageOpen() {
        driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
    }

    public void homepageThroughSideBar() {
        homePageOpen();
        driver.findElement(By.xpath("//a[@ id='menu-toggle' ]")).click();
        driver.findElement(By.xpath("//a[text() ='Home' ]")).click();
    }


}



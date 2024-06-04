package com.romio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssignmentFormProtrector {
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
    public void openLogin() {

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("//input[@minlength='2']")).sendKeys("Romio Nandi");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("romionandi1997@gmail.com");
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("romio1234@");
        driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
        WebElement checkBox = driver.findElement(By.id("exampleFormControlSelect1"));
        Select protrectBox = new Select(checkBox);
        protrectBox.selectByVisibleText("Female");
        System.out.println(driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")).getAttribute("value"));
        Assert.assertEquals("Female", driver.findElement(By.id("exampleFormControlSelect1")).getAttribute("value"));
        driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
        driver.findElement(By.cssSelector("input[type='date']")).sendKeys("13,12,1997");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']/strong")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']/strong")).getText(), "Success!");
    }
}







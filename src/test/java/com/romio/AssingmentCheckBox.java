package com.romio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssingmentCheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement k= driver.findElement(By.id("checkBoxOption1"));
        k.click();

        Assert.assertTrue(k.isSelected());
        WebElement h = driver.findElement(By.id("checkBoxOption1"));


        Thread.sleep(2000);
        System.out.println(driver.findElements(By.xpath("//input[@ type='checkbox']")).size());
        Assert.assertEquals(3,driver.findElements(By.xpath("//input[@ type='checkbox']")).size());

        WebElement m= driver.findElement(By.id("checkBoxOption1"));
        m.click();

        Assert.assertFalse(m.isSelected());




    }
}
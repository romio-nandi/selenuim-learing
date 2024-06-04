package com.romio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PopUpWindowHandaling {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@ id='name']")).sendKeys("Romio");
        driver.findElement(By.xpath("//input[@ id='alertbtn']")).click();
        String alertText = driver.switchTo().alert().getText();
        Assert.assertEquals(alertText.toUpperCase(), "Hello Romio, share this practice page and share your knowledge".toUpperCase());
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//input[@ id='confirmbtn']")).click();
        String conformationText= driver.switchTo().alert().getText();
        Assert.assertEquals(conformationText.toUpperCase(),"Hello , Are you sure you want to confirm?".toUpperCase());
        driver.switchTo().alert().dismiss();


    }
}
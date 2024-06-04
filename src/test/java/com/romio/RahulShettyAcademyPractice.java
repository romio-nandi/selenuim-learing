package com.romio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class RahulShettyAcademyPractice {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(2000);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("john");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("romionandi@gmail.com");
        // driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9656958547");
        //  driver.findElement(By.xpath("//input[@ placeholder='Phone Number']")).sendKeys("9969586549");
        driver.findElement(By.xpath("//input[@ type='text'][3]")).sendKeys("922222222");
        driver.findElement(By.xpath("//div[@ class='forgot-pwd-btn-conainer']/ button[2]")).click();
        System.out.println(driver.findElement(By.cssSelector("p[class='infoMsg']")).getText());
        driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
        Thread.sleep(2000);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.className("submit")).click();
        System.out.println(driver.findElement(By.xpath("//p[@ style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//p[@ style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']")).getText(),"You are successfully logged in.");



    }
}
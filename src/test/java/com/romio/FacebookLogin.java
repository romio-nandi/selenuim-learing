package com.romio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FacebookLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348028");
        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement email = driver.findElement(By.id("email"));
       // System.out.println(email.getText());
        WebElement password = driver.findElement(By.id("pass"));
        WebElement submitButton = driver.findElement(By.id("loginbutton"));
        
        email.sendKeys("9609567494");
        password.sendKeys("romionandi123");

        submitButton.click();

      //  System.out.println(driver.findElement(By.id("message")).getText());

       driver.quit();
    }



    }


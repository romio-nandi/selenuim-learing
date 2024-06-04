package com.romio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class SeleniumPractice {

        public static void main(String[] args) throws InterruptedException {

            // Initiate the Webdriver
            WebDriver driver = new ChromeDriver();

            // adding implicit wait of 15 secs
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            // Opening the webpage where we will identify edit box to enter
            driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");

            // getting current URL
            System.out.println("Getting the Current URL: " + driver.getCurrentUrl());

            // Identify the input box with xpath locator
            WebElement e = driver.findElement(By.xpath("//*[@id='fullname']"));

            // enter text in input box
            e.sendKeys("Selenium");

           // Get the value entered
            String text = e.getAttribute("value");
            System.out.println("Entered text is: " + text);

            // clear the text entered
            e.clear();

            // Get no text after clearing text
             String text1 = e.getAttribute("value");
            System.out.println("Get text after clearing: " + text1);

            // Closing browser
            driver.quit();
        }
    }


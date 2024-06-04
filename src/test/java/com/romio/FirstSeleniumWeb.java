package com.romio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstSeleniumWeb {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement textBox1 = driver.findElement(By.name("my-text"));
        WebElement textBox = driver.findElement(By.name("my-password"));
        WebElement textBox2 = driver.findElement(By.name("my-textarea"));

        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox1.sendKeys("Selenium");
        textBox.sendKeys("1258@fg");
        textBox2.sendKeys("Hi my name is romio ");

        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        System.out.println(message.getText());
        driver.quit();
    }
}

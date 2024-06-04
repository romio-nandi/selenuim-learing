package com.romio;

import org.checkerframework.framework.qual.DefaultQualifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static com.romio.Constants.BASE_URL;
import static com.romio.Constants.names;

public class CartTheItem {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();

        Properties properties = new Properties();
        java.net.URL ol = ClassLoader.getSystemResource("Test.properties");

        try {
            properties.load(ol.openStream());
        } catch (Exception e) {
            //System.out.println(e);
        }

        //"https://rahulshettyacademy.com/seleniumPractise/"

        driver.get(properties.getProperty(BASE_URL));

        List<WebElement> products=  driver.findElements(By.xpath("//h4[@ class='product-name']"));
        for(int i=0;i<names.length;i++){
            for(int j=0;j<products.size();j++){
                if (products.get(j).getText().contains(names[i])){
                    driver.findElements(By.xpath("//div[@class='product-action']/button")).get(j).click();


                }
            }
        }
    }
}
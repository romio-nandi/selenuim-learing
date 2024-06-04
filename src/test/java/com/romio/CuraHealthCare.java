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

public class CuraHealthCare {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
    }
    @AfterClass
    public void closeDrive(){
        driver.quit();
    }


    @Test
    public void testHeader() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void testFooter() {
        Assert.assertEquals(1, 1);
    }


    private void findByIdAndClick(String id) {

        driver.findElement(By.id(id)).click();
    }

    @Test
    public void testFirstPage() throws InterruptedException {

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        try {

            findByIdAndClick("menu-toggle");
            // findByIdAndClick(driver, "Login");

            //driver.findElement(By.id("menu-toggle")).click();
            driver.findElement(By.linkText("Login")).click();
            driver.findElement(By.id("txt-username")).sendKeys("John Doe");
            driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
            driver.findElement(By.xpath("//button[@ class='btn btn-default']")).click();
            WebElement SelectButton = driver.findElement(By.id("combo_facility"));
            Select Button = new Select(SelectButton);
            Button.selectByVisibleText("Hongkong CURA Healthcare Center");
            System.out.println(Button.getFirstSelectedOption().getText());
            findByIdAndClick("chk_hospotal_readmission");
            findByIdAndClick("radio_program_medicaid");
            findByIdAndClick("txt_visit_date");

            //  driver.findElement(By.xpath("//td[@class='active day']")).click();
            //System.out.println(driver.findElement(By.id("txt_visit_date")).getText());
            driver.findElement(By.id("txt_comment")).sendKeys("HI DOC!!!");
            Thread.sleep(5000);
            System.out.println(driver.findElement(By.id("txt_comment")).getAttribute("value"));
            // Assert.assertEquals("HI DOC!!!",driver.findElement(By.id("txt_comment")).getAttribute("value"));
            driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
            System.out.println(driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).isSelected());


        } catch (Exception e) {
            System.out.println("Error-----" + e);
        }

    }
}
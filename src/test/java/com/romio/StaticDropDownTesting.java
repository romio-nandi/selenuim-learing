package com.romio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class StaticDropDownTesting {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
            WebElement webstatic = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
            driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
            Select dropdown = new Select(webstatic);
            dropdown.selectByIndex(0);
            System.out.println(dropdown.getFirstSelectedOption().getText());
            dropdown.selectByValue("INR");
            System.out.println(dropdown.getFirstSelectedOption().getText());
            dropdown.selectByVisibleText("USD");
            driver.findElement(By.id("divpaxinfo")).click();
            System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
            Thread.sleep(2000);
            for (int i = 1; i < 5; i++) {
                driver.findElement(By.id("hrefIncAdt")).click();
            }
            driver.findElement(By.id("btnclosepaxoption")).click();
            System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
            Assert.assertEquals((driver.findElement(By.id("divpaxinfo")).getText()), "5 Adult");
            driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
            driver.findElement(By.xpath("//a[@text='Goa (GOI)']")).click();
            Thread.sleep(2000);
            //  driver.findElement(By.xpath("(//a[@ text='Durgapur (RDP)']) [2]")).click();
            driver.findElement(By.xpath("//div[@ id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@ text='Durgapur (RDP)']")).click();
//        WebElement startDate = driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight"));
            WebElement startDate = driver.findElement(By.className("ui-state-highlight"));
            startDate.click();
          //  System.out.println(startDate.isSelected());
            if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5")) {
                Assert.assertTrue(true);
                System.out.println(0.5);
            }
            else{
                Assert.assertTrue(false);
            }

            // System.out.println(driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).getText());
            driver.findElement(By.id("autosuggest")).sendKeys("ind");
            Thread.sleep(5000);
            List<WebElement> options = driver.findElements(By.cssSelector("li[role='presentation'] a"));

            for (WebElement i : options) {
                if (i.getText().equalsIgnoreCase("india")) {
                    System.out.println(i.getText());
//                System.out.println(i.isDisplayed());

//                System.out.println(i.isSelected());
                    Thread.sleep(2000);
                    i.click();
                    // Assert.assertTrue(i.isSelected());
                    // System.out.println(i.isDisplayed());
                    break;
                }
            }
            driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
            Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
            System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
            driver.findElement(By.xpath("//input[@ id='ctl00_mainContent_btn_FindFlights']")).click();

        } catch (Exception e) {
            System.out.println("Error occured " + e);
        } finally {
            driver.quit();
        }
    }
}












package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            // Create a new Chrome browser session
            driver = new ChromeDriver();

            // Open the Google homepage
            driver.get("https://www.google.com");

            // Print the page title in the console
            System.out.println("Page title: " + driver.getTitle());
        } finally {
            // Close the browser properly even if something fails
            if (driver != null) {
                driver.quit();
            }
        }
    }
}

package FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.amazon.com");

        
        System.out.println("Page Title: " + driver.getTitle());
        
       // WebElement signInButton = driver.findElement(By.id("nav-link-accountList"));

        // Close the browser
        driver.quit();
    }
}

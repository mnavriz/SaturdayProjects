package Project13;

/*
        1) Navigate to  http://demoqa.com/text-box

        2) Maximize the window

        3) Enter full name as "Automation"

        4) Enter Email as "Testing@gmail.com"

        5) Enter Current Address as "Testing Current Address"

        6) Enter Permanent Address as "Testing Permanent Address"

        7) Click on submit button

        8) Print Name in the text box

        9) Print Email in the text box

        10) Print Current Address in the text box

        11) Print Permanent Address in the text box

 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Part1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/MN/Desktop/SeleniumS/chromedriver");
        WebDriver driver = new ChromeDriver();

//1) Navigate to  http://demoqa.com/text-box
        driver.get("http://demoqa.com/text-box");

//2) Maximize the window
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

// 3) Enter full name as "Automation"

        WebElement name = driver.findElement(By.cssSelector("#userName"));
        name.sendKeys("Automation");

//4) Enter Email as "Testing@gmail.com"
        WebElement email = driver.findElement(By.cssSelector("#userEmail"));
        email.sendKeys("Testing@gmail.com");

//5) Enter Current Address as "Testing Current Address"
        WebElement currentAddress = driver.findElement(By.cssSelector("#currentAddress"));
        currentAddress.sendKeys("Testing Current Address");

//6) Enter Permanent Address as "Testing Permanent Address"
        WebElement permanentAddress = driver.findElement(By.cssSelector("#permanentAddress"));
        permanentAddress.sendKeys("Testing Permanent Address");

       // Thread.sleep(5000);
 //  7) Click on submit button
        driver.findElement(By.id("submit")).click();

// 8) Print Name in the text box
        //String name11="Automation";
        String name1 = driver.findElement(By.id("name")).getText();
        System.out.println(name1);

//9) Print Email in the text box
        //String email11="Testing@gmail.com";
        String email1 = driver.findElement(By.id("email")).getText();
        System.out.println(email1);;

//10) Print Current Address in the text box
        //String currentAddress11 = "Testing Current Address";
        String currentAddress1 = driver.findElement(By.cssSelector("#output :nth-child(3)")).getText();
        System.out.println(currentAddress1);;

//11) Print Permanent Address in the text box
        //String permanentAddress11 = "Testing Permanent Address";
        String permanentAddress1 = driver.findElement(By.cssSelector("#output :nth-child(4)")).getText();
        System.out.println(permanentAddress1);

       // driver.findElement(By.cssSelector("#submit")).click();

        //Thread.sleep(15000);
       // driver.quit();


}}

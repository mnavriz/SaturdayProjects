package Project13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2 {
    // 1) Navigate to https://demo.applitools.com/

    //2) Maximize the window

     //3) Enter the username as "ttechno@gmail.com"

    //4) Enter the password as "techno123."

    //5) Click on sign in button

    //6) Get the header text in red color ( starts with "Your nearest branch ...") and assign it to a String str

    //7) Print the String str

    //8) Print the URL
     //

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/MN/Desktop/SeleniumS/chromedriver");
        WebDriver driver = new ChromeDriver();

//1) Navigate to  https://demo.applitools.com/
        driver.get("https://demo.applitools.com/");

//2) Maximize the window
        driver.manage().window().maximize();
//3) Enter the username as "ttechno@gmail.com"
        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("ttechno@gmail.com");
 //4) Enter the password as "techno123."
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("techno123.");
//5) Click on sign in button
        driver.findElement(By.cssSelector("#log-in")).click();
//6) Get the header text in red color ( starts with "Your nearest branch ...") and assign it to a String str
        WebElement element = driver.findElement(By.cssSelector("#time"));
        String elementText = element.getText();
//7) Print the String str

        System.out.println("Element text: "+ elementText);
//8) Print the URL

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl is " + currentUrl);
    }}

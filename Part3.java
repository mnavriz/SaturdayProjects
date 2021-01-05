package Project13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part3 {
    /*
        1) Navigate to https://www.snapdeal.com/

        2) Maximize the window

        3) Search for "teddy bear" and click on search button

        4) Get and print the following text -->> We've got .... results for 'teddy bear'

        5) Print the URL

        6) Click on logo snepdeal logo

        7) Print the URL

        8) Navigate back and check if the automatically written text in the search bar is "teddy bear"
           (Hint: You may use the "value" attribute of the input tag for the search bar)

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/MN/Desktop/SeleniumS/chromedriver");
        WebDriver driver = new ChromeDriver();

//1) Navigate to  https://www.snapdeal.com/
        driver.get("https://www.snapdeal.com/");

//2) Maximize the window
        driver.manage().window().maximize();
//3) Search for "teddy bear" and click on search button
        WebElement search = driver.findElement(By.cssSelector("#inputValEnter"));
        search.sendKeys("\"teddy bear\"");
        driver.findElement(By.cssSelector(".searchTextSpan")).click();
//4) Get and print the following text -->> We've got .... results for 'teddy bear'
        WebElement ResultText = driver.findElement(By.cssSelector(".nnn"));
        System.out.println(ResultText.getText());
//5) Print the URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl is " + currentUrl);

//6) Click on logo snepdeal logo
        driver.findElement(By.cssSelector("div>div>a .notIeLogoHeader")).click();

// 7) Print the URL
        String currentUrl2 = driver.getCurrentUrl();
        System.out.println("currentUrl is " + currentUrl2);

//8) Navigate back and check if the automatically written text in the search bar is "teddy bear"
//           (Hint: You may use the "value" attribute of the input tag for the search bar)
        driver.navigate().back();

    }}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    static String url = "https://www.amazon.com/";


    public static void main(String[] args) {
// For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "BrowserDriver/chromedriver");
// create a object for chromeDriver
        WebDriver driver = new ChromeDriver();
//driver.get(url);
        driver.navigate().to(url);
//driver.navigate().back();

        //driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone11Pro");
        //driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        // driver.close();
        //}
        //}


        String searchField = "#twotabsearchtextbox";
        String searchItem = "Iphone11Pro";
        driver.findElement(By.cssSelector(searchField)).sendKeys(searchItem);
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();




    }
}
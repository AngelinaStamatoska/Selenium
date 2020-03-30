import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {
    @Test
    public void firstTest() {
        System.out.println("Our first automation test.");

        //declare web driver;
        WebDriver driver;

        //locate WebDriver from local machine
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Angelina\\IdeaProjects\\BabyStepsWithAutomation\\src\\test\\BrowserDriver\\chromedriver.exe");

        //initialize chrome driver instance
        driver = new ChromeDriver();

        //start a new chrome browser
//        driver.get("https://www.google.com");

        //quit driver instance
        //closes chrome browser
//start a new browser
        driver.get("http://automationpractice.com/index.php");

        //find the contact us element
        driver.findElement(By.id("contact-link"));
        driver.findElement(By.name("search_query"));
        driver.findElement(By.className("col-sm-4"));
        driver.findElement(By.tagName("div"));



        driver.quit();

    }
}

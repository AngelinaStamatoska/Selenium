import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkTest {
    @Test
    public void homeworkTest() {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Angelina\\IdeaProjects\\BabyStepsWithAutomation\\src\\test\\BrowserDriver\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

        driver.findElement(By.id("firstName"));

        driver.findElement(By.name("lastName"));

        driver.findElement(By.className("whsOnd"));



        driver.quit();


    }
}

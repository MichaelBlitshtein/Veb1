
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
    WebDriver wd;

    @BeforeMethod
    public void preConditions(){
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.manage().window().maximize();
    }

    @Test
    public void trello1(){
        WebElement loginButton = wd.findElement(By.cssSelector("[href='/login']"));
        loginButton.click();   //click the Login button

        WebElement emailField = wd.findElement(By.cssSelector("#user"));
        emailField.click();
        emailField.clear();
        emailField.sendKeys("michael.blitshtein@gmail.com");

        WebElement logButton = wd.findElement(By.cssSelector("#login"));
        logButton.click();

        WebElement passwordInput = wd.findElement(By.cssSelector("#password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("зшявф2000");

        WebElement submitLogin = wd.findElement(By.cssSelector("#login-submit"));
        submitLogin.click();


    }


    @AfterMethod
    public void postConditions(){
        wd.close();
        wd.quit();
    }
}

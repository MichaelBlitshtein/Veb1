import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void startTrello() {
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.manage().window().maximize();
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.close();
        wd.quit();

    }
    WebElement el1 = wd.findElement(By.tagName("div"));
    WebElement el2 = wd.findElement(By.tagName("a"));
    WebElement el3 = wd.findElement(By.id("user"));
    WebElement el4 = wd.findElement(By.id("login-form"));
    //WebElement el5= wd.findElement(By.className("username-readonly hidden"));
    WebElement el6= wd.findElement(By.className("username-readonly"));
    WebElement el7= wd.findElement(By.className("css-164r41r"));
    WebElement el8 = wd.findElement(By.linkText("Log in"));
    WebElement el9 = wd.findElement(By.className("m2N684FcksCyfT"));
}
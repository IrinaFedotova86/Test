import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class PhoneBook {

    WebDriver wd;

    @BeforeClass
    public  void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public  void  selectors(){
        WebElement el1 = wd.findElement(By.cssSelector("h1"));
        WebElement el2 = wd.findElement(By.cssSelector("form"));
        WebElement el3 = wd.findElement(By.cssSelector("br"));

        List<WebElement> list1 = wd.findElements(By.cssSelector("div"));
        List<WebElement> list2 = wd.findElements(By.cssSelector("a"));
        List<WebElement> list3 = wd.findElements(By.cssSelector("input"));
        List<WebElement> list4 = wd.findElements(By.cssSelector("button"));

        WebElement el4 = wd.findElement(By.cssSelector(".container"));
        WebElement el5 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement el6 = wd.findElement(By.cssSelector(".login_login__3EHKB"));

        WebElement el7 = wd.findElement(By.cssSelector("#root"));
    }
}

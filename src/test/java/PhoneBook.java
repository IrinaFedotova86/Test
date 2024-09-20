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
    public  void  selectors() {
        WebElement el1 = wd.findElement(By.cssSelector("h1"));
        WebElement el2 = wd.findElement(By.cssSelector("form"));
        WebElement el3 = wd.findElement(By.cssSelector("br"));
        WebElement el11 = wd.findElement(By.xpath("//h1"));
        WebElement el12 = wd.findElement(By.xpath("//form"));
        WebElement el13 = wd.findElement(By.xpath("//br"));

        List<WebElement> list1 = wd.findElements(By.cssSelector("div"));
        List<WebElement> list2 = wd.findElements(By.cssSelector("a"));
        List<WebElement> list3 = wd.findElements(By.cssSelector("input"));
        List<WebElement> list4 = wd.findElements(By.cssSelector("button"));
        List<WebElement> list12 = wd.findElements(By.xpath("//div"));
        List<WebElement> list22 = wd.findElements(By.xpath("//a"));
        List<WebElement> list32 = wd.findElements(By.xpath("//input"));
        List<WebElement> list42 = wd.findElements(By.xpath("//button"));
        List<WebElement> list52 = wd.findElements(By.xpath("//meta"));


        WebElement el4 = wd.findElement(By.cssSelector(".container"));
        WebElement el5 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement el6 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement el8 = wd.findElement(By.className("container"));
        WebElement el41 = wd.findElement(By.xpath("//*[@class='container']"));
        WebElement el51 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));
        WebElement el61 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));
        WebElement el71 = wd.findElement(By.xpath("//*[@class='active']"));

        WebElement el7 = wd.findElement(By.cssSelector("#root"));
        WebElement el9 = wd.findElement(By.id("root"));
        WebElement el711= wd.findElement(By.xpath("//*[@id='root']"));

        //by atribut
        WebElement e11 = wd.findElement(By.cssSelector("[name='password']"));
        WebElement e21 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement e31 = wd.findElement(By.cssSelector("[charset='utf-8']"));
        WebElement e1 = wd.findElement(By.xpath("//*[@name='password']"));
        WebElement e2 = wd.findElement(By.xpath("//*[@href='/home']"));
        WebElement e3 = wd.findElement(By.xpath("//*[@charset='utf-8']"));

        //start
        WebElement el1221 = wd.findElement(By.cssSelector("[content ^= 'Web']"));
        WebElement el1231 = wd.findElement(By.cssSelector("[name ^= 'view']"));
        WebElement el122 = wd.findElement(By.xpath("//*[starts-with(@content,'Web')]"));
        WebElement el123 = wd.findElement(By.xpath("//*[starts-with(@name,'view')]"));
        //edn
        WebElement ell = wd.findElement(By.cssSelector("[content $= 'app']"));
        WebElement ell2 = wd.findElement(By.xpath("//*[contains(@content, 'app')]"));
        //contains
        WebElement ell3= wd.findElement(By.cssSelector("[content *= 'site']"));
        WebElement ell4 = wd.findElement(By.xpath("//*[contains(@content, 'site')]"));
    }

        @Test
                public void classWork() {
            WebElement el111 = wd.findElement(By.xpath("//h1/parent::*"));
            WebElement el112 = wd.findElement(By.xpath("//h1/.."));
            WebElement el113 = wd.findElement(By.xpath("//h1/parent::div"));

            WebElement ell5 = wd.findElement(By.xpath("//input/parent::*"));
            WebElement ell6 = wd.findElement(By.xpath("//input/.."));
            WebElement ell7 = wd.findElement(By.xpath("//input/parent::form"));

            //ancestor

            WebElement el114 = wd.findElement(By.xpath("//h1/ancestor::*")); //all
            WebElement el115 = wd.findElement(By.xpath("//h1/ancestor::div")); //two
            WebElement el116 = wd.findElement(By.xpath("//h1/ancestor::div[2]")); //one

            List<WebElement> lel = wd.findElements(By.xpath("//input/ancestor::*"));
            List<WebElement> lel2 = wd.findElements(By.xpath("//input/ancestor::div"));
            WebElement el1162 = wd.findElement(By.xpath("//input/ancestor::form")); //one

            //ancestor or self
            WebElement el117 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
            List<WebElement> list6 = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));
            List<WebElement> lel3 = wd.findElements(By.xpath("//input/ancestor-or-self::*"));

            //following-sibling
            WebElement el118 = wd.findElement(By.xpath("//h1/following-sibling::a[3]"));
            List<WebElement> list7 = wd.findElements(By.xpath("//h1/following-sibling::a"));
            WebElement el1181 = wd.findElement(By.xpath("//h1/following-sibling::a[1]"));

            List<WebElement> lel4 = wd.findElements(By.xpath("//input/following-sibling::*"));
            List<WebElement> lel5 = wd.findElements(By.xpath("//input/following-sibling::button"));
            WebElement el11812 = wd.findElement(By.xpath("//input/following-sibling::button[1]"));

            //preceding-sibling
            WebElement el119 = wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling::h1"));
            WebElement ell8 = wd.findElement(By.xpath("//button[@name='login']/preceding-sibling::*"));
        }
    }


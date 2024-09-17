import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void test(){
            wd = new ChromeDriver();
            //wd.get("https://demoqa.com/");
            wd.navigate().to("https://telranedu.web.app/home");
            wd.navigate().back();
            wd.navigate().forward();
            wd.navigate().refresh();

            wd.close(); //close one tab and browser
            wd.quit(); // close all tabs and browser
    }
 //   @Test
  //  public  void test1(){
  //      wd=new ChromeDriver();
  //      wd.get("https://telranedu.web.app/home");
  //  }
}


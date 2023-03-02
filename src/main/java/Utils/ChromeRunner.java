package Utils;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeTest

    public static void setUp(){

        open("https://officemart.ge/ge");
    }
    @AfterTest
    public static void close(){
//        Selenide.CloseWebDriver();
    }

}

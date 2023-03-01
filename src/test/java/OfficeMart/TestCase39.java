package OfficeMart;

import StepObject.MainPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.MainPageData.*;

public class TestCase39 extends ChromeRunner {
    @Test
    public void case39() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkMail(wrongMail2)
                .checkEmailRed();




    }
}
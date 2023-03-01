package OfficeMart;

import StepObject.MainPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.MainPageData.*;

public class TestCase35 extends ChromeRunner {
    @Test
    public void case35() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkDateRed()
                .checkDateShort(wrongDate)
                .clickBtn2()
                .checkDateRed();


    }
}
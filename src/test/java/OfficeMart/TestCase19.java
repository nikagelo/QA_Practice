package OfficeMart;

import StepObject.MainPageSteps;
import Utils.ChromeRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Assert;

import static DataObject.MainPageData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class TestCase19 extends ChromeRunner {
    @Test
    public void case19() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkNameRed();
    }
}
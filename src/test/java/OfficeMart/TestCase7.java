package OfficeMart;

import StepObject.MainPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.MainPageData.*;

public class TestCase7 extends ChromeRunner {
    @Test
    public void case7(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .checkID();
    }
}

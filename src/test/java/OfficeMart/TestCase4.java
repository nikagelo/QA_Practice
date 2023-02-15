package OfficeMart;

import StepObject.MainPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.MainPageData.*;

public class TestCase4 extends ChromeRunner {
    @Test
    public void case4(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt();
    }
}

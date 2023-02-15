package OfficeMart;

import StepObject.MainPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.MainPageData.*;

public class TestCase2 extends ChromeRunner {
    @Test
    public void case2(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .checkSearchedItem(searchItemData);
    }
}

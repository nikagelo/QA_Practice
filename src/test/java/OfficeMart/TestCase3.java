package OfficeMart;

import StepObject.MainPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.MainPageData.*;

public class TestCase3 extends ChromeRunner {
    @Test
    public void case3(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(SearchTestData)
                .checkSearchedTest(SearchTestData);
    }
}

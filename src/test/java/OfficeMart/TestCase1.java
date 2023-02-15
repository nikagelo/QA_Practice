package OfficeMart;

import StepObject.MainPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

public class TestCase1 extends ChromeRunner {
    @Test
            public void case1(){
    MainPageSteps steps = new MainPageSteps();
    steps.clickSearchBtn()
            .searchInputVisible();
    }
}

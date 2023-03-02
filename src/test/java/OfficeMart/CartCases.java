package OfficeMart;

import StepObject.MainPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.openqa.selenium.remote.DriverCommand;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static DataObject.MainPageData.*;
import static DataObject.MainPageData.num;

public class CartCases  extends ChromeRunner {

    @Step("Click on search button")
    @Description("Test Case 1")
    @Severity(SeverityLevel.BLOCKER)
    @Test

    public void case1(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchInputVisible();

    }

    @Step("Search Item")
    @Description("Test Case 2")
    @Severity(SeverityLevel.BLOCKER)

    @Test
    public void case2(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .checkSearchedItem(searchItemData);
    }
    @Test
    @Step("Check Search")

    @Description("Test Case 3")
    @Severity(SeverityLevel.BLOCKER)
    public void case3(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(SearchTestData)
                .checkSearchedTest(SearchTestData);

    }
    @Test

    @Description("Test Case 4")
    @Step("Add item to cart")
    @Severity(SeverityLevel.NORMAL)
    public void case4(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt();
    }
    @Test
    @Step("Check Cart")

    @Description("Test Case 5")
    @Severity(SeverityLevel.NORMAL)
    public void case5(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .checkName();
    }
    @Test
    @Step("Check color of item")
    @Severity(SeverityLevel.MINOR)

    @Description("Test Case 6")
    public void case6(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .checkColor();
    }

    @Test
    @Step("Check ID of item")

    @Description("Test Case 7")
    @Severity(SeverityLevel.MINOR)
    public void case7(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .checkID();
    }

    @Test
    @Step("Check quantity of item")

    @Description("Test Case 8")
    @Severity(SeverityLevel.MINOR)
    public void case8(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .checkNum();
    }

    @Test
    @Step("Check price of item")

    @Description("Test Case 9")
    @Severity(SeverityLevel.MINOR)
    public void case9(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .checkPrice();
    }
    @Test
    @Step("Check full price of item")

    @Description("Test Case 10")
    @Severity(SeverityLevel.MINOR)
    public void case10(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .checkFullPrice();
    }
    @Test
    @Step("Check if full price is equal to multiplied price")

    @Description("Test Case 11")
    @Severity(SeverityLevel.MINOR)
    public void case11(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .addNum(num);
        Assert.assertEquals(steps.price() * (num+1), steps.multipliedPrice());

    }
    @Test
    @Step("Check if full price is equal to multiplied price")

    @Description("Test Case 12")
    @Severity(SeverityLevel.MINOR)
    public void case12(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .addNum(num)
                .clickMinusBtn(num);
        Assert.assertEquals(steps.price(), steps.multipliedPrice());

    }
    @Test

    @Description("Test Case 13")
    @Severity(SeverityLevel.MINOR)
    public void case13(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .removeItemFromCart()
                .emptyCart();


    }
    @Test

    @Description("Test Case 14")
    @Severity(SeverityLevel.MINOR)
    public void case14(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clearCart();


    }
    @Test

    @Description("Test Case 15")
    @Severity(SeverityLevel.MINOR)
    public void case15(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clearCart()
                .CartIsEmpty();


    }

    @Test

    @Description("Test Case 16")
    @Severity(SeverityLevel.MINOR)
    public void case16(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clearCart()
                .noContinue();


    }

    @Test

    @Description("Test Case 17")
    @Severity(SeverityLevel.MINOR)
    public void case17(){
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clearCart()
                .noClearBtn();


    }
}

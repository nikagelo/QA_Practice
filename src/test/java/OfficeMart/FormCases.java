package OfficeMart;

import StepObject.MainPageSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static DataObject.MainPageData.*;

public class FormCases {
    @Test

    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 18")
    public void case18() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .checkLaw();
    }
    @Test

    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 19")
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
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 20")
    public void case20() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkPersIDRed();
    }
    @Test

    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 21")
    public void case21() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkAdressRed();
    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 22")
    public void case22() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkPhoneRed();
    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 23")
    public void case23() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkDateRed();
    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 24")
    public void case24() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkEmailRed();
    }
    @Test
    @Description("Test Case 25")
    @Severity(SeverityLevel.MINOR)
    public void case25() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkNameRed()
                .fillName();
    }
    @Test
    @Severity(SeverityLevel.MINOR)

    @Description("Test Case 26")
    public void case26() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .fillIdWrong();
    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 27")
    public void case27() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .fillIdShort(steps.wrongId);

    }
    @Test

    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 28")
    public void case28() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .fillLongId(longId);

    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 29")
    public void case29() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .fillId(correctId)
                .clickBtn2()
                .notRedId();

    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 30")
    public void case30() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkAdressRed()
                .fillAddress(address)
                .notRedAddress();


    }
    @Test
    @Severity(SeverityLevel.MINOR)

    @Description("Test Case 31")
    public void case31() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .fillPhone(address);



    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 32")
    public void case32() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .fillPhoneShort(phoneShort);



    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 33")
    public void case33() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .fillPhoneLong(phoneLong)
                .clickBtn2()
                .checkPhoneNotRed();



    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 34")
    public void case34() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkPhoneRed()
                .fillPhone(phoneRight)
                .checkPhoneNotRed();



    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 35")
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
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 36")
    public void case36() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkDateRed()
                .checkDate(correctDate)
                .clickBtn2()
                .checkDateRed();


    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 37")
    public void case37() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkMail(correctMail)
                .notRedMail();




    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 38")
    public void case38() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkMail(wrongMail)
                .checkEmailRed();




    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 39")
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
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test Case 40")
    public void case40() {
        MainPageSteps steps = new MainPageSteps();
        steps.clickSearchBtn()
                .searchItem(searchItemData)
                .addItemToCart()
                .itemAddedTxt()
                .openTheCart()
                .clickToContinue()
                .clickBtn2()
                .checkMail(wrongMail3)
                .checkEmailRed();




    }
}

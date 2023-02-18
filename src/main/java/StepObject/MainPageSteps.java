package StepObject;

import PageObject.MainPage;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.example.Main;
import org.testng.Assert;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selenide.sleep;
import com.codeborne.selenide.CollectionCondition.*;

public class MainPageSteps extends MainPage {
    public  MainPageSteps clickSearchBtn(){
        searchBtn.click();
        return this;
    }
    public MainPageSteps searchInputVisible(){
        searchInput.shouldBe(Condition.visible);

        return this;
    }
    public MainPageSteps searchItem(String searchItemData){
        searchInput.setValue(searchItemData).pressEnter();
        return this;
    }
    public MainPageSteps checkSearchedItem(String searchItemData){
        searchResult.shouldBe(Condition.matchText(searchItemData));
        return this;
    }
    public MainPageSteps checkSearchedTest(String searchTestData){
        nothingFound.shouldBe(Condition.visible);
        return this;
    }
    public MainPageSteps addItemToCart(){
        addToCart.scrollIntoView(false).click();
        return this;
    }
    public MainPageSteps itemAddedTxt(){
        addedItemTxt.shouldBe(Condition.visible);
        return this;
    }
    public MainPageSteps openTheCart(){
        goToCart.click();
        return this;
    }
    public MainPageSteps checkName(){
        itemTitle.shouldNotBe(Condition.empty);
        return this;
    }
    public MainPageSteps checkColor(){
        itemColor.shouldNotBe(Condition.empty);
        return this;
    }
    public MainPageSteps checkID(){
        itemID.shouldNotBe(Condition.empty);
        return this;
    }
    public MainPageSteps checkNum(){
        itemNum.shouldNotBe(Condition.empty);
        return this;
    }
    public MainPageSteps checkPrice(){
        itemPrice.shouldNotBe(Condition.empty);
        return this;
    }
    public MainPageSteps checkFullPrice(){
        itemFullPrice.shouldNotBe(Condition.empty);
        return this;
    }
    public MainPageSteps addNum(Integer num){
        for (int i=0; i<num; i++){
            plusBtn.click();
        }
        return this;
    }
    public double price(){
        return Double.parseDouble(String.valueOf(itemPrice.getOwnText()));
    }

    public double multipliedPrice(){
        return Double.parseDouble(String.valueOf(itemFullPrice.getOwnText()));
    }
    public  MainPageSteps clickMinusBtn(Integer num){
        for (int i = 0; i < num; i++){
            minusBtn.click();
        }
        return this;
    }
    public MainPageSteps removeItemFromCart(){
        removeBtn.click();
        return this;

    }
    public  MainPageSteps emptyCart(){
        itemTitle.shouldNotBe(Condition.visible);
        return this;
    }
    public  MainPageSteps clearCart(){
        clearCart.scrollIntoView(false).click();
        return this;
    }
    public MainPageSteps CartIsEmpty(){
        cartIsEmpty.shouldBe(Condition.visible);
        return this;
    }
    public MainPageSteps noContinue(){
        toContinue.shouldNotBe(Condition.visible);
        return this;
    }
    public MainPageSteps noClearBtn(){
        clearCart.shouldNotBe(Condition.visible);
        return this;
    }
    public MainPageSteps clickToContinue(){
        toContinue.click();
        return this;
    }
    public  MainPageSteps checkLaw(){
        pisPer.shouldBe(Condition.visible);
        iurPer.shouldBe(Condition.visible);
        return this;
    }
    public MainPageSteps clickBtn2(){
        submit2.click();
        return this;
    }
    public MainPageSteps checkNameRed(){
        name.getCssValue("red");
        return this;

    }
    public  MainPageSteps checkPersIDRed(){
        personalID.scrollIntoView(true).getCssValue("red");
        return this;
    }
    public  MainPageSteps checkAdressRed(){
        adress.scrollIntoView(true).getCssValue("red");
        return this;
    }
    public  MainPageSteps checkPhoneRed(){
        phone.scrollIntoView(true).getCssValue("red");
        return this;
    }
    public  MainPageSteps checkDateRed(){
        date.scrollIntoView(true).getCssValue("red");
        return this;
    }
    public  MainPageSteps checkEmailRed(){
        email.scrollIntoView(true).getCssValue("red");
        return this;
    }
    public MainPageSteps fillName(){
        name.scrollIntoView(true).setValue("Test");
        clickBtn2();
        name.getCssValue("rgb(69, 69, 69)");
        return this;
    }
    public  MainPageSteps fillIdWrong(){
        personalID.setValue("test").shouldBe(Condition.empty);
        return this;
    }
    public  MainPageSteps fillIdShort(String num){
        int i = wrongId.length();
        if (i != 9){
            personalID.scrollIntoView(true).getCssValue("red");
        }
        return this;
    }
    public MainPageSteps fillLongId (String num){
        personalID.setValue(num);
        personalID.getSize().equals(9);
        return this;
    }
    public MainPageSteps fillId(String num){
        personalID.setValue(num);
        return this;
    }
    public  MainPageSteps notRedId(){
        personalID.getCssValue("rgb(69, 69, 69)");
        return this;
    }


}

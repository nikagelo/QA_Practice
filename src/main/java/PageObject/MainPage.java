package PageObject;


import com.codeborne.selenide.SelenideElement;

import static DataObject.MainPageData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public SelenideElement searchBtn = $(byClassName("fa-search")),
    searchInput = $(byName("search")),
    searchResult = $(byText(searchItemData)),
    nothingFound = $(byText("ვერაფერი მოიძებნა")),
    addToCart = $(byClassName("add_cart"), 0),
    addedItemTxt = $(byText("პროდუქტი წარმატებით დაემატა კალათაში")),
    goToCart  = $(byClassName("junior-span")),
    itemTitle = $(byClassName("item_title")),
    itemColor = $(byClassName("choose_color")),
    itemID = $(byClassName("item_id")),
    itemNum = $(byName("quantity")),
    itemPrice = $(byXpath("/html/body/div[5]/div/div[3]/div[6]/div[2]/span[1]")),
    itemFullPrice = $(byClassName("fullPriceFor")),
    plusBtn = $(byClassName("fa-plus")),
    minusBtn = $(byClassName("fa-minus")),
    removeBtn = $(byClassName("fa-times")),
    clearCart = $(byText("კალათის გასუფთავება")),
    cartIsEmpty = $(byText("კალათა ცარიელია")),
    toContinue = $(byClassName("continue")),
    pisPer = $(byId("pis")),
    iurPer = $(byId("iur"));





}

package com.vytrack.step_definitions;

import com.vytrack.pages.CampaignsPage_ID;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US14_Filters_Marketing_StepDefs {
    CampaignsPage_ID marketingPage = new CampaignsPage_ID();
    List<WebElement> actualList;

    @Then("the user can see five filter options as checked by default")
    public void the_user_can_see_five_filter_options_as_checked_by_default(List<String> expectedList) {
        marketingPage.filterButton.click();
        marketingPage.manageFilterButton.click();
        Select select = new Select(marketingPage.selectDropdown);
        actualList = select.getOptions();

        for (int i = 0; i < actualList.size(); i++) {
            String optionTitle = actualList.get(i).getAttribute("title");
            boolean optionIsSelected = actualList.get(i).isSelected();

            Assert.assertEquals("option title mismatch at index " + i, expectedList.get(i), optionTitle);
            Assert.assertTrue("option is not selected at index " + 1, optionIsSelected);
        }
    }

    @Then("user can uncheck any amount of checked boxes")
    public void user_can_uncheck_any_amount_of_checked_boxes() {
        marketingPage.filterButton.click();
        marketingPage.manageFilterButton.click();
        marketingPage.filterOptionsCanBeUnselected();

    }
}

package com.vytrack.step_definitions;

import com.vytrack.pages.AccountsPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US12_AccountPageFilter_StepDefinitions {
    AccountsPage accountsPage = new AccountsPage();
    @When("user is on the {string} on {string} page")
    public void userIsOnTheOnPage(String tab, String module) {
        accountsPage.navigateToModule(tab, module);
    }

    @Then("user can see filter items below")
    public void userCanSeeFilterItemsBelow(List<String> expectedItems){
        accountsPage.filterButton.click();
        List<String> actualItems = new ArrayList<>();
        for (WebElement each : accountsPage.filterMenu) {
            actualItems.add(each.getAttribute("title"));

        }

        Assert.assertTrue(expectedItems.containsAll(actualItems));

    }



}

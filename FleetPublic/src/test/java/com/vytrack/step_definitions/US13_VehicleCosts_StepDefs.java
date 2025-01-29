package com.vytrack.step_definitions;

import com.vytrack.pages.VehicleCostsPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US13_VehicleCosts_StepDefs {
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();

    @Then("the user can see three columns on the Vehicle Costs page")
    public void the_user_can_see_three_columns_on_the_vehicle_costs_page(List<String> expectedColumns) {
        List<String> actualColumns = new ArrayList<>();

       // BrowserUtils.waitFor(2);

        actualColumns.add(vehicleCostsPage.typeItem.getText());
        actualColumns.add(vehicleCostsPage.totalPriceItem.getText());
        actualColumns.add(vehicleCostsPage.dateItem.getText());

        List<String> expectedColumnsLower = BrowserUtils.convertListToLowerCase(expectedColumns);
        List<String> actualColumnsLower = BrowserUtils.convertListToLowerCase(actualColumns);

        Assert.assertEquals(expectedColumnsLower, actualColumnsLower);


    }

    @And("users check the first checkbox to select All Vehicle Costs")
    public void usersCheckTheFirstCheckboxToSelectAllVehicleCosts() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
// Wait for the loader to disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loader-mask.shown")));
      //  Thread.sleep(2000);

        vehicleCostsPage.typeCheckBox.click();

    }

    @Then("user can see all vehicle costs selected")
    public void userCanSeeAllVehicleCostsSelected() {
        for (WebElement box : vehicleCostsPage.listCheckBoxes) {
            Assert.assertTrue(box.isSelected());

        }
    }
}
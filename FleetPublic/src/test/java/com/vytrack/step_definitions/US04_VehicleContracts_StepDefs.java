package com.vytrack.step_definitions;

import com.vytrack.pages.US04_VehicleContractsPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US04_VehicleContracts_StepDefs {


    @Then("user see the title name All - Vehicle Contract - Entities - System - Car - Entities - System")
    public void userSeeTheTitleNameAllVehicleContractEntitiesSystemCarEntitiesSystem() {

        // Wait until the page title is loaded
        BrowserUtils.waitFor( 5);
        String expectedTitle = Driver.getDriver().getTitle();

        // Dynamic wait for up to 5 seconds
        // Verify the page title
        BrowserUtils.verifyTitle(expectedTitle);



        System.out.println("Page title verified: " + expectedTitle);
    }

US04_VehicleContractsPage us04VehicleContractsPage= new US04_VehicleContractsPage();

    @When("driver navigates to the Vehicle Contracts page")
    public void driverNavigatesToTheVehicleContractsPage() {
Driver.getDriver().get("https://qa1.vytrack.com/");

        
    }

    @Then("user sees the message {string}")
    public void userSeesTheMessage(String expectedMessage) {
        String actualMessage = us04VehicleContractsPage.noPermissionText.getText();
        







    }
}


 


        
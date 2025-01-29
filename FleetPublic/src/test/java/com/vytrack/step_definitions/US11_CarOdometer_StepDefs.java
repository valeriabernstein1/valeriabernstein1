package com.vytrack.step_definitions;

import com.vytrack.pages.US11_VehicleOdometerPage_IonelaD;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US11_CarOdometer_StepDefs {

US11_VehicleOdometerPage_IonelaD vehicleOdometerPage = new US11_VehicleOdometerPage_IonelaD();
    @Then("user can see the error message {string}")
    public void user_can_see_the_error_message(String expectedErrorMessage) {
        String actualErrorMessage = vehicleOdometerPage.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }



    @Then("user can see the default page as {int}")
    public void user_can_see_the_default_page_as(Integer expectedPageNum) {
Integer actualPageNum = Integer.valueOf(vehicleOdometerPage.pageNum.getAttribute("value"));
        Assert.assertEquals(expectedPageNum, actualPageNum);
    }




    @Then("user can see the View Per Page as {int} by default.")
    public void user_can_see_the_view_per_page_as_by_default(Integer expected) {
        Integer actual = Integer.valueOf(vehicleOdometerPage.viewPerPage.getText());
        Assert.assertEquals(expected, actual);
    }

}

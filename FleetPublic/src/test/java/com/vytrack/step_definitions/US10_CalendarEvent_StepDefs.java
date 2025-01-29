package com.vytrack.step_definitions;

import com.vytrack.pages.US10_CalendarEventsPage_ID;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US10_CalendarEvent_StepDefs {
    US10_CalendarEventsPage_ID calendarEventsPage = new US10_CalendarEventsPage_ID();

    @When("user types {string} in to the Desription Field")
    public void user_types_in_to_the_desription_field(String message) {
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().frame(calendarEventsPage.iframe);
        calendarEventsPage.textBox.sendKeys(message);

    }

    @Then("{string} is displayed")
    public void is_displayed(String expectedMessage) {
        String actualMessage = calendarEventsPage.enteredText.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("user checks the repeat checkbox")
    public void userChecksTheRepeatCheckbox() {
        calendarEventsPage.repeatCheckBox.click();
    }


    @And("user clicks on the Create Calendar event button")
    public void userClicksOnTheCreateCalendarEventButton() {
        calendarEventsPage.createCalendarButton.click();
    }
}

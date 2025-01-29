package com.vytrack.step_definitions;

import com.vytrack.pages.DocumentationPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US2_OronicDocumentation_StepDefination {

    DocumentationPage documentationPage = new DocumentationPage();


    @When("user clicks the question mark icon")
    public void user_clicks_the_question_mark_icon() {
        documentationPage.link_help.click();
    }

    @When("user switch to the {string}")
    public void user_switch_to_the(String title) {
        System.out.println(title);
        BrowserUtils.switchToWindow(title);
    }

    @Then("the user sees URL {string}")
    public void the_user_sees_url(String expectedUrl) throws InterruptedException {
        Thread.sleep(2);

        System.out.println(expectedUrl);
        System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

      //  BrowserUtils.verifyTitleContains(expectedUrl);
        Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());

    }




}

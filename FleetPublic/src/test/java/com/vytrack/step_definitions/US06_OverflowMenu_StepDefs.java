package com.vytrack.step_definitions;

import com.vytrack.pages.VehiclesPage_ID;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class US06_OverflowMenu_StepDefs {
    VehiclesPage_ID vehiclesPage = new VehiclesPage_ID();
    Actions actions = new Actions(Driver.getDriver());
    int randomIndex = 0;
    List<String> actualOptions = new ArrayList<>();

    @When("user hover the mouse over the three dots")
    public void user_hover_the_mouse_over_the_three_dots() {
        Random random = new Random();
        BrowserUtils.waitFor(2);
        randomIndex = random.nextInt(vehiclesPage.overflowMenu.size());

        actions.moveToElement(vehiclesPage.overflowMenu.get(randomIndex)).perform();

        Assert.assertTrue(vehiclesPage.hiddenMenu.isDisplayed());

     //   Driver.getDriver().findElement(By.xpath("//div[@class='other-scroll']")).click();
        vehiclesPage.randomElementOutsideMenu.click();


    }


    @Then("user can see folowing options displayed")
    public void user_can_see_folowing_options_displayed(List<String> expectedOptions) {
        ;
        String locator = "(//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu'])[" + (randomIndex + 1) + "]/li/ul/li[@class='launcher-item']/a";
        List<WebElement> list = Driver.getDriver().findElements(By.xpath(locator));

        for (WebElement each : list) {
            actualOptions.add(each.getAttribute("title"));
        }
        Assert.assertEquals(actualOptions, expectedOptions);
    }
}

package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignsPage_ID extends BasePage {


    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterButton;
    @FindBy(xpath = "//button[contains(@class, 'ui-multiselect ui-corner-all select-filter-widget')]")
    public WebElement manageFilterButton;
    @FindBy(xpath = "//select[@data-action=\"add-filter-select\"]")
    public WebElement selectDropdown;


    public void filterOptionsCanBeUnselected() {
        for (int i = 1; i <= 5; i++) {
            String element = "(//input[@name='multiselect_0'])[" + i + "]";
            // String element = "(//input[starts-with(@name,'multiselect')])[" + i + "]";
            WebElement filterCheckBoxes = Driver.getDriver().findElement(By.xpath(element));
            filterCheckBoxes.click();
            BrowserUtils.sleep(1);
            filterCheckBoxes = Driver.getDriver().findElement(By.xpath(element));//not to get stale element reference exception
            Assert.assertFalse(filterCheckBoxes.isSelected());
        }
    }
}
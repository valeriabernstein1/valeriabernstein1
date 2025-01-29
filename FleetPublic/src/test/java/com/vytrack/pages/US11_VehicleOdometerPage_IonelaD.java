package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US11_VehicleOdometerPage_IonelaD extends BasePage {



    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement pageNum;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPage;
}

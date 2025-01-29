package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class US04_VehicleContractsPage extends BasePage {
    @FindBy(name="All-Vehicle Contract-Entities-System-Car-Entities-System")
    public WebElement titleName;
@FindBy(linkText="Vehicle Contracts")

    public WebElement vehicleLink;

@FindBy(xpath = "//*[contains(text(), 'You do not have permission to perform this action.')]")
    public WebElement noPermissionText;



}

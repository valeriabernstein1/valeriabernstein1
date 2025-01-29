package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class VehiclesPage_ID extends BasePage {
    public VehiclesPage_ID() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//div[@class='dropdown open']")
    public WebElement hiddenMenu;
    @FindBy(xpath = "//div[@class='dropdown']/a")
    public List<WebElement> overflowMenu;
    @FindBy(xpath = "//div[@class='other-scroll']")
    public WebElement randomElementOutsideMenu;


    }

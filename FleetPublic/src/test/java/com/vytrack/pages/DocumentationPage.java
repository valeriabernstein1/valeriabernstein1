package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentationPage {

    public DocumentationPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

   @FindBy(xpath ="//i[@class='fa-question-circle']" )
    public WebElement link_help;


    //"//i[@class='fa-question-circle']"
    //"//a[@class='help no-hash']"


}

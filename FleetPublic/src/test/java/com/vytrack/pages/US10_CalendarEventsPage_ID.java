package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US10_CalendarEventsPage_ID extends BasePage {


    @FindBy(xpath = "//input[contains(@id,'recurrence-repeat-view')]")
    public WebElement repeatCheckBox;
    @FindBy(xpath = "//a[@class=\"btn main-group btn-primary pull-right \"]")
    public WebElement createCalendarButton;
    @FindBy(xpath = "//iframe[contains(@id, \"oro_calendar_event_form_description-uid\")]")
    public WebElement iframe;
    @FindBy(id = "tinymce")
    public WebElement textBox;
@FindBy(xpath = "//body[@id='tinymce']/p")
    public WebElement enteredText;
}
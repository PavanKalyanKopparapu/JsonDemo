package ui;

import constants.LogConstants;
import constants.URLConstants;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ui.locators.RegisterLocators;
import util.UtilFactory;

public class Register extends PageObject  {

    private static Logger logger = LoggerFactory.getLogger(Register.class);

    public WebDriver driver;

    private UtilFactory utilFactory;

    public Register() {
        driver = super.getDriver();
        utilFactory = new UtilFactory(driver);

    }
    @FindBy(xpath = RegisterLocators.FIRSTNAME)
    private WebElement firstName;

    @FindBy(xpath = RegisterLocators.LASTNAME)
    private WebElement lastName;

    @FindBy(xpath = RegisterLocators.ADDRESS)
    private WebElement address1;

    @FindBy(xpath = RegisterLocators.EMAILADDRESS)
    private WebElement emailaddress1;

    @FindBy(xpath = RegisterLocators.PHONE)
    private WebElement phone1;

    public void openUrl(){
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        logger.info(URLConstants.setUrl());
        super.openUrl(URLConstants.setUrl());
    }
    public void enterData(String firstname, String lastname, String address, String emailaddress, String phone) throws InterruptedException {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        utilFactory.highlight(firstName);
        firstName.click();
        firstName.sendKeys(firstname);
        utilFactory.highlight(lastName);
        lastName.click();
        lastName.sendKeys(lastname);

        utilFactory.highlight(address1);
        address1.click();
        address1.sendKeys(address);
        utilFactory.highlight(emailaddress1);
        emailaddress1.click();
        emailaddress1.sendKeys(emailaddress);
        utilFactory.highlight(phone1);
        phone1.click();
        phone1.sendKeys(phone);
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());


    }
}

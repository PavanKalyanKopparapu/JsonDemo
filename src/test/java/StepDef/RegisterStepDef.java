package StepDef;
import constants.FeatureNameConstants;
import constants.LogConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ui.Register;
import util.UtilFactory;
import java.io.IOException;
import java.util.List;


public class RegisterStepDef extends PageObject {
    private static Logger logger = LoggerFactory.getLogger(RegisterStepDef.class);


    @Managed
    public WebDriver driver;
    Register register;

    UtilFactory utilFactory;

    public RegisterStepDef() {
        driver = super.getDriver();
        new UtilFactory(driver);
    }



    @Given("User is on Register homepage")
    public void user_is_on_register_homepage() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        logger.info("User is on home page");
        register.openUrl();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    @When("User fill the data")
    public void user_fill_the_data(List<List<String>> RegisterCredential) throws IOException, ParseException, InterruptedException {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        register.enterData(utilFactory.readJSON(FeatureNameConstants.REGISTER,RegisterCredential.get(0).get(0),"firstname",
                "Register.json"),
                utilFactory.readJSON(FeatureNameConstants.REGISTER,RegisterCredential.get(0).get(0),"lastname",
                        "Register.json"),
                utilFactory.readJSON(FeatureNameConstants.REGISTER,RegisterCredential.get(0).get(0),"address",
                        "Register.json"),
                utilFactory.readJSON(FeatureNameConstants.REGISTER,RegisterCredential.get(0).get(0),"emailaddress",
                        "Register.json"),
                utilFactory.readJSON(FeatureNameConstants.REGISTER,RegisterCredential.get(0).get(0),"phone",
                        "Register.json"));


    }
    @When("User clicks on submit button")
    public void user_clicks_on_submit_button() {

    }
    @Then("User should be Register Successfully")
    public void user_should_be_register_successfully() {

    }

}

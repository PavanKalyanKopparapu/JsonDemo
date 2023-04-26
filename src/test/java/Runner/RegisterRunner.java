package Runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {}, features = "C:\\Users\\Pavan.Kopparapu\\Downloads\\RegestrationLoginPage\\JsonDemo\\src\\test\\resources\\feature\\Register.feature", glue = "StepDef")

public class RegisterRunner {
}

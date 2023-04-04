package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("This method runs before every each scenario");
    }
    @After
    public void tearDown (Scenario scenario){
        System.out.println("This method runs after every each scenario");
        final byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if(scenario.isFailed()){
            scenario.attach(screenshot, "image/png", "screenshot");
        }
    }
}

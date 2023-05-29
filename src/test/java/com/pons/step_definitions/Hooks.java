package com.pons.step_definitions;

import com.pons.utilities.BrowserUtils;
import com.pons.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.plugin.event.Node;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void tearDownScenario() {
        Driver.closeDriver();
    }


    @After
    public void tearDownScenario(Scenario scenario) {
       /* System.out.println("====Closing browser using cucumber @After");
        System.out.println("====Scenario ended/ Take screenshot if failed!");

*/
        if (scenario.isFailed()) {
            if (scenario.getSourceTagNames().contains("@outline")) {
                byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            }
        }
        BrowserUtils.waitFor(5);
        Driver.closeDriver();

        System.out.println("Driver closed");
    }
}

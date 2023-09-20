package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.WebDriverManager;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HookSteps {
    private static final Logger logger = Logger.getLogger(HookSteps.class.getName());

    @Before(order = 0)
    public void beforeEachScenario() {
        try {
            WebDriverManager.getWebDriver();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error setting up log file: " + e.getMessage(), e);
        }
    }

    @After()
    public void afterEachScenario() {
        try {
            WebDriverManager.quitWebDriver();
        } catch (Exception e) {
            logger.severe("An error occurred while quitting WebDriver: " + e.getMessage());
        }
    }

    static {
        logger.setLevel(Level.SEVERE);

        try {
            Handler fileHandler = new FileHandler("webdriver-errors.log");
            fileHandler.setLevel(Level.SEVERE);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error setting up log file: " + e.getMessage(), e);
        }
    }
}


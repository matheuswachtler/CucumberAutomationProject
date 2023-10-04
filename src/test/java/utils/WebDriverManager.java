package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class WebDriverManager {
    protected static WebDriver webDriver;
    public static WebDriverWait webDriverWait;

    public static WebDriver getWebDriver() {
        try {
            webDriver = createWebDriverInstance(getProperties());
            webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(5L));
        } catch (Exception e) {
            System.out.println("Unable to start WebDriver " + e.getMessage());
        }
        return webDriver;
    }

    public static WebDriver createWebDriverInstance(String browser) {
        if (webDriver == null) {
            if (browser.equals("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
                options.addArguments("--headless");
                options.addArguments("--disable-extensions");
                options.addArguments("--disable-gpu");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--no-sandbox");
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                webDriver = new ChromeDriver(options);
                webDriver.manage().window().maximize();
            }
        }
        return webDriver;
    }

    private static String getProperties() {
        Properties properties = new Properties();
        String value = null;
        try {
            properties.load(new FileInputStream("src/test/resources/properties/browser"));
            value = properties.getProperty("browser");
        } catch (IOException e) {
            System.out.println("Unable to access properties file " + e.getMessage());
        }
        return value;
    }

    public static void quitWebDriver() {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }

}
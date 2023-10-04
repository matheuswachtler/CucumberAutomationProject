package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    private final WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }
    

    public void navigate(String url) {
        webDriver.get(url);
    }

    public boolean isThere(String url) {
        return webDriver.getCurrentUrl().equals(url);
    }

    public boolean findTextInPageSource(String data) {
        return webDriver.getPageSource().contains(data);
    }

    public String convertNullValueToEmptyString(String data) {
        if (data.equals("null_value")) {
            data = "";
            return data;
        }
        return data;
    }

}

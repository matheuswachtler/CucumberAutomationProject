package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver,this);
    }

    public static final String URL_ACCOUNT_PAGE = "https://www.marisa.com.br/my-account/profile";

}

package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver,this);
    }
    public static final String URL_LOGIN_PAGE = "https://www.marisa.com.br/login";
    public static final String URL_LOGIN_PAGE_ERROR = "https://www.marisa.com.br/login?error=true";
    @FindBy(id = "j_username")
    WebElement usernameLabel;
    @FindBy(id = "j_password")
    WebElement passwordLabel;
    public void attemptLoginWith(String username, String password) {
        usernameLabel.sendKeys(username);
        passwordLabel.sendKeys(password);
        passwordLabel.submit();
    }
}
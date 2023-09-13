package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.opentest4j.AssertionFailedError;
import pages.AccountPage;
import pages.LoginPage;
import utils.WebDriverManager;

public class LoginSteps {
    private final AccountPage accountPage;
    private final LoginPage loginPage;
    public LoginSteps() {
        WebDriver webDriver = WebDriverManager.getWebDriver();
        this.loginPage = new LoginPage(webDriver);
        this.accountPage = new AccountPage(webDriver);
    }

    @Given("I'm on the login page")
    public void i_m_on_the_login_page() {
        loginPage.navigate(LoginPage.URL_LOGIN_PAGE);
        Assertions.assertTrue(loginPage.isThere(LoginPage.URL_LOGIN_PAGE));
    }

    @When("I insert valid data")
    public void i_insert_valid_data() {
        loginPage.attemptLoginWith("fecarob338@tiuas.com", "SecretPassword@123");
    }

    @Then("I'm authenticated")
    public void i_m_authenticated() {
        Assertions.assertTrue(accountPage.isThere(AccountPage.URL_ACCOUNT_PAGE));
    }

    @When("I insert invalid {word} and invalid {word}")
    public void i_insert_invalid_email_and_invalid_password(String email, String password) {
        String updatedEmail = loginPage.convertNullValueToEmptyString(email);
        String updatedPassword = loginPage.convertNullValueToEmptyString(password);
        loginPage.attemptLoginWith(updatedEmail, updatedPassword);
    }

    @Then("I'm not authenticated")
    public void i_m_not_authenticated() {
        Assertions.assertTrue(loginPage.isThere(LoginPage.URL_LOGIN_PAGE_ERROR));
        try {
            Assertions.assertTrue(loginPage.findTextInPageSource("E-mail ou senha inválidos."));
        } catch (AssertionFailedError e) {
            Assertions.assertTrue(loginPage.findTextInPageSource("Informe um e-mail/CPF válido."));
        }
    }

    @When("I try acess some restrict page without being authenticated")
    public void i_try_acess_some_restrict_page() {
        loginPage.navigate(AccountPage.URL_ACCOUNT_PAGE);
    }

    @Then("I'm forwarded to the login page")
    public void i_m_forwarded_to_the_login_page() {
        Assertions.assertTrue(loginPage.isThere(LoginPage.URL_LOGIN_PAGE));
    }



}
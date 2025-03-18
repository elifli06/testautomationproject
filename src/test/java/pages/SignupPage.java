package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // URL
    private final String URL = "https://automationexercise.com/signup";

    // Locators
    private By nameField = By.name("name");
    private By emailField = By.cssSelector("input[data-qa='signup-email']");
    private By signupButton = By.cssSelector("button[data-qa='signup-button']");
    private By passwordField = By.cssSelector("input[data-qa='password']");
    private By firstNameField = By.cssSelector("input[data-qa='first_name']");
    private By lastNameField = By.cssSelector("input[data-qa='last_name']");
    private By addressField = By.cssSelector("input[data-qa='address']");
    private By cityField = By.cssSelector("input[data-qa='city']");
    private By stateField = By.cssSelector("input[data-qa='state']");
    private By zipcodeField = By.cssSelector("input[data-qa='zipcode']");
    private By mobileNumberField = By.cssSelector("input[data-qa='mobile_number']");
    private By createAccountButton = By.cssSelector("button[data-qa='create-account']");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void goToSignupPage() {
        driver.get(URL);
        wait.until(ExpectedConditions.urlContains("signup"));
    }

    public void enterInitialSignupDetails(String name, String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField));
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(signupButton).click();
    }

    public void fillSignupForm(String password, String firstName, String lastName,
                               String address, String city, String state,
                               String zipcode, String mobileNumber) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(stateField).sendKeys(state);
        driver.findElement(zipcodeField).sendKeys(zipcode);
        driver.findElement(mobileNumberField).sendKeys(mobileNumber);
        driver.findElement(createAccountButton).click();
    }
}
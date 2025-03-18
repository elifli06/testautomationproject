package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    private WebDriver driver;
    private final String URL = "https://automationexercise.com/signup";

    // Locators
    private By nameField = By.name("name");
    private By emailField = By.cssSelector("input[data-qa='signup-email']");
    private By signupButton = By.cssSelector("button[data-qa='signup-button']");
    private By passwordField = By.id("password");
    private By firstNameField = By.id("first_name");
    private By lastNameField = By.id("last_name");
    private By addressField = By.id("address1");
    private By cityField = By.id("city");
    private By stateField = By.id("state");
    private By zipcodeField = By.id("zipcode");
    private By mobileNumberField = By.id("mobile_number");
    private By createAccountButton = By.cssSelector("button[data-qa='create-account']");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToSignupPage() {
        driver.get(URL);
    }

    public void enterInitialSignupDetails(String name, String email) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(signupButton).click();
    }

    public void fillSignupForm(String password, String firstName, String lastName,
                               String address, String city, String state,
                               String zipcode, String mobileNumber) {
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
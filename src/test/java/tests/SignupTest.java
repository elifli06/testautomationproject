package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignupPage;

public class SignupTest extends BaseTest {
    private SignupPage signupPage;

    @BeforeMethod
    public void setUpTest() {
        super.setUp();
        signupPage = new SignupPage(driver);
    }

    @Test
    public void testSignup() {
        // Signup sayfasına git
        signupPage.goToSignupPage();

        // İlk kayıt detaylarını gir
        signupPage.enterInitialSignupDetails("Test User", "test" + System.currentTimeMillis() + "@test.com");

        // Form detaylarını doldur
        signupPage.fillSignupForm(
                "password123",
                "John",
                "Doe",
                "123 Test St",
                "Test City",
                "Test State",
                "12345",
                "1234567890"
        );
    }
}
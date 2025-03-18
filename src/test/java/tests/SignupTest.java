package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SignupPage;

public class SignupTest extends BaseTest {

    @Test
    public void testSignup() throws InterruptedException {
        String testEmail = "ceravelif@gmail.com";

        SignupPage signupPage = new SignupPage(driver);
        signupPage.goToSignupPage();
        Thread.sleep(2000); // 2 saniye bekle

        signupPage.enterInitialSignupDetails("Elif Cerav", testEmail);
        Thread.sleep(2000); // 2 saniye bekle

        signupPage.fillSignupForm(
                "Test123!", // password
                "Elif", // firstName
                "Cerav", // lastName
                "123 Türkiye Sokak", // address
                "Ankara", // city
                "Ankara", // state
                "202525", // zipcode
                "1234567890" // mobile
        );

        // Test tamamlandıktan sonra 5 saniye bekle
        Thread.sleep(5000);
    }
}
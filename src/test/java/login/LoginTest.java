package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.io.FileNotFoundException;

public class LoginTest extends BaseTests {
    @Test
    public void testLoginValidCredentials() throws FileNotFoundException, InterruptedException {

        LoginPage loginPage1 = loginPage;
        loginPage1.insertEmailLoginBtn(dataModel().LoginForm.ValidCredentials.EmailLogin);
        loginPage1.insertPasswordLoginBtn(dataModel().LoginForm.ValidCredentials.Password);
        HomePage homePage=loginPage1.clickOnLoginBtn();

        Assert.assertEquals(homePage.getWelcomeHomePage(),"Welcome to Facebook, Ahmed");
    }
    @Test
    public void testLoginInValidCredentials() throws FileNotFoundException, InterruptedException {
        LoginPage loginPage2 = loginPage;
        loginPage2.insertEmailLoginBtn(dataModel().LoginForm.InvalidCredentials.InvalidEmail.EmailLogin);
        loginPage2.insertPasswordLoginBtn(dataModel().LoginForm.InvalidCredentials.InvalidPassword.Password);
        HomePage homePage=loginPage2.clickOnLoginBtn();
        Assert.assertEquals(loginPage2.getErrorLoginMessage(),"The email address you entered isn't connected to an account. Find your account and log in.");
    }
}

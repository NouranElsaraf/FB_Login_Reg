package registerForm;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MoreInfoPage;
import pages.RegisterFormPage;

import java.io.FileNotFoundException;

public class RegisterTests extends BaseTests {




    @Test
    public void testRegisterFormWithInvalidData() throws FileNotFoundException, InterruptedException {

        RegisterFormPage register = loginPage.clickOnCreateAccount();
        register.registerFormActions(dataModel().RegisterForm.ValidCredentials.FirstName
                        ,dataModel().RegisterForm.ValidCredentials.Surname
                        ,dataModel().RegisterForm.ValidCredentials.RegisterBirthDay
                        ,dataModel().RegisterForm.ValidCredentials.RegisterBirthMonth
                        ,dataModel().RegisterForm.ValidCredentials.RegisterBirthYear
                        ,dataModel().RegisterForm.InvalidCredentials.InvalidEmail.Email
                        ,dataModel().RegisterForm.ValidCredentials.NewPassword);

             register.clickOnSignUpBtn();
        Assert.assertEquals(register.getErrorRegisterMessage() , "It looks like you may have entered an incorrect email address. Please correct it if necessary, then click to continue." );
    }

    @Test
    public void testRegisterFormWithValidData() throws FileNotFoundException, InterruptedException {

        RegisterFormPage registerSuccess = loginPage.clickOnCreateAccount();
        registerSuccess.registerFormActions(dataModel().RegisterForm.ValidCredentials.FirstName
                ,dataModel().RegisterForm.ValidCredentials.Surname
                ,dataModel().RegisterForm.ValidCredentials.RegisterBirthDay
                ,dataModel().RegisterForm.ValidCredentials.RegisterBirthMonth
                ,dataModel().RegisterForm.ValidCredentials.RegisterBirthYear
                ,dataModel().RegisterForm.ValidCredentials.Email
                ,dataModel().RegisterForm.ValidCredentials.NewPassword);


            MoreInfoPage getText = registerSuccess.clickOnSignUpBtn();
            Assert.assertEquals(getText.getMoreInfoText() , "We need more information");

        }
    }

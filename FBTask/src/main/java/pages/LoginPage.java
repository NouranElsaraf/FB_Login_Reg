package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private final By emailLoginInput = By.cssSelector("#email");
    private final By passwordLoginInput = By.cssSelector("#pass");
    private final By createAccountBtn = By.xpath("(//a[normalize-space()='Create new account'])[1]");
    private final By loginBtn = By.cssSelector("#loginbutton");


    public void insertEmailLoginBtn(String email){
        sendKeys(emailLoginInput,3,email);
    }
    public void insertPasswordLoginBtn(String password){
        sendKeys(passwordLoginInput,3,password);
    }
    public HomePage clickOnLoginBtn(){
        click(loginBtn,3);
        return new HomePage(driver);
    }

public RegisterFormPage clickOnCreateAccount()
{
        click(createAccountBtn,3);
        return new RegisterFormPage(driver);
}
public String getAlertErrorMessage()
{
      return getTextAlert();

}

}

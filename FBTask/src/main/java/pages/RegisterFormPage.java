package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.MethodHandles;

public class RegisterFormPage extends MethodHandles {
    public RegisterFormPage(WebDriver driver) {
        super(driver);
    }

    Select select;


    private final By firstNameInput = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    private final By surNameInput = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
    private final By dayInput = By.cssSelector("#day");
    private final By monthInput = By.cssSelector("#month");
    private final By yearInput = By.cssSelector("#year");
    private final By genderRadioBtn = By.xpath("(//input[@id='sex'])[1]");
    private final By emailInput = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]");
    private final By passwordInput = By.cssSelector("#password_step_input");

    private final By signUpBtn = By.cssSelector("input[value='REGISTER']");
    public String getAlertErrorLoginMessage()
{
    return getTextAlert();
}


    public void insertFirstName(String firstName){
        sendKeys(firstNameInput , 3 , firstName );
    }

    public void insertSurNameInput(String surName){
        sendKeys(surNameInput , 3 , surName );
    }

    public void selectBirthDay(String day){
        select = new Select(driver.findElement(dayInput));
        select.selectByVisibleText(day);
    }

    public void selectMonth(String month){
        select = new Select(driver.findElement(monthInput));
        select.selectByVisibleText(month);
    }
    public void selectYear(String year){
        select = new Select(driver.findElement(yearInput));
        select.selectByVisibleText(year);
    }

   public void chooseGender(){
        click(genderRadioBtn,3);
   }

    public void insertEmailInput(String email){
        sendKeys(emailInput , 3 , email );
    }

    public void insertPassword(String password){

        sendKeys(passwordInput,3,password);
    }
    public MoreInfoPage clickOnSignUpBtn(){
        click(signUpBtn , 15);
        return new MoreInfoPage(driver);
    }
    public void registerFormActions(String firstName,String Surname,String day, String month,String year,String email,String password)
    {
        insertFirstName(firstName);
        insertSurNameInput(Surname);
        selectBirthDay(day);
        selectMonth(month);
        selectYear(year);
        chooseGender();
        insertEmailInput(email);
        insertPassword(password);
        clickOnSignUpBtn();
    }


}

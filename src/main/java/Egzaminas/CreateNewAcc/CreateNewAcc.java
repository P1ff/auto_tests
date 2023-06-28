package Egzaminas.CreateNewAcc;

import Egzaminas.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewAcc extends AbstractPage {

    @FindBy(id="username")
    private WebElement UserName;

    @FindBy (id = "password")
    private WebElement Password;

    @FindBy (id = "passwordConfirm")
    private WebElement PasswordConfirm;

    @FindBy (xpath = "//*[@id=\"userForm\"]/button")
    private WebElement Submit;

    public CreateNewAcc(WebDriver driver) {
        super(driver);
    }
    public void NameClick(){UserName.click();}
    public void Name(String userName) {UserName.sendKeys(userName);}

    public void PasswordClick(){Password.click();}
    public void PasswordInput(String passInput){Password.sendKeys(passInput);}

    public void PasswordConfirmClick(){PasswordConfirm.click();}
    public void PasswordConfirmInput(String passConfirmInput){PasswordConfirm.sendKeys(passConfirmInput);}

    public void SubmitButton(){Submit.click();}

}



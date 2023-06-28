package Egzaminas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage{
 @FindBy (xpath = "/html/body/div/form/div/h4/a")
 private WebElement NavigateToCreateNewAcc;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void NavigateToCreateNewAcc (){
        NavigateToCreateNewAcc.click();
    }

    @FindBy (xpath = "/html/body/div/form/div/input[1]")
    private WebElement LoginVardas;

    @FindBy (xpath = "/html/body/div/form/div/input[2]")
    private WebElement LoginPassword;

    @FindBy (xpath = "/html/body/div/form/div/button")
    private WebElement LogInButton;

    public void VardasClick(){LoginVardas.click();}
    public void VardasInput(String Vardas){LoginVardas.sendKeys(Vardas);}

    public void PasswdClick(){LoginPassword.click();}

    public void passwdInput(String Passwd){LoginPassword.sendKeys(Passwd);}

    public void Submit(){LogInButton.click();}
}

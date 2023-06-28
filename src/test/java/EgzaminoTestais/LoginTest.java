package EgzaminoTestais;

import Egzaminas.HomePage;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest{
    HomePage homePage;

    @Test
    public void Login(){
        homePage = new HomePage(driver);
        homePage.VardasClick();
        homePage.VardasInput("pifas");
        homePage.PasswdClick();
        homePage.passwdInput("abc");
        homePage.Submit();
    }


}

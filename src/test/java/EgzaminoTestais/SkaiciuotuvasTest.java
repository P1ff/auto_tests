package EgzaminoTestais;

import Egzaminas.HomePage;
import Egzaminas.Main.Skaiciuotuvas;
import org.junit.jupiter.api.Test;

public class SkaiciuotuvasTest extends BaseTest{

    Skaiciuotuvas sk;

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
    @Test
    public void Skaiciuotuvas(){
        sk = new Skaiciuotuvas(driver);
        sk.PirmasSkClick();
        //sk.PirmasInput("2");
        sk.PirmasSkClear();
    }

}

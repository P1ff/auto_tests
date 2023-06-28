package EgzaminoTestais;

import Egzaminas.CreateNewAcc.CreateNewAcc;
import Egzaminas.HomePage;
import org.junit.jupiter.api.Test;

public class CreateAccTest extends BaseTest {
    HomePage homePage;
    CreateNewAcc createAcc;
    @Test
    public void createNewAcc(){
        homePage = new HomePage(driver);
        createAcc = new CreateNewAcc(driver);

        homePage.NavigateToCreateNewAcc();

        createAcc.NameClick();
        createAcc.Name("pifas");
       // String userName = RandomUtils.randomNumber(6);//
        createAcc.PasswordClick();
        createAcc.PasswordInput("abc");

        createAcc.PasswordConfirmClick();
        createAcc.PasswordConfirmInput("abc");
        createAcc.SubmitButton();
    }


}

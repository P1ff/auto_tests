package Egzaminas.Main;

import Egzaminas.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Skaiciuotuvas extends AbstractPage {
    public Skaiciuotuvas(WebDriver driver) {super(driver);}

    @FindBy (id = "sk1")
    private WebElement PirmasSkaicius;

    @FindBy (id = "sk2")
    private WebElement AntrasSkaicius;

    @FindBy (xpath = "//*[@id=\"number\"]/input[3]")
    private WebElement Skaiciuoti;

    public void PirmasSkClick(){PirmasSkaicius.click();}
    //public void PirmasControl(){PirmasSkaicius.sendKeys(Keys.CONTROL + "a");}
    //public void PirmasDelete(){PirmasSkaicius.sendKeys(Keys.DELETE);}
    //public void PirmasInput(String Skc){PirmasSkaicius.sendKeys(Skc);}
    public void PirmasSkClear(){PirmasSkaicius.clear();}
}

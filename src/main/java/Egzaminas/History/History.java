package Egzaminas.History;

import Egzaminas.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class History extends AbstractPage {
    public History(WebDriver driver) {super(driver);}

    @FindBy (xpath = "/html/body/nav/div/ul[1]/li/a")
    private WebElement Istorija;



}

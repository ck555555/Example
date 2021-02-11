package fixture;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeMethod;
import steps.Steps;
import steps.StepsB2B;
import steps.StepsCatalog;

public class Fixture {

    public Steps step = new Steps();
    public StepsCatalog catalog = new StepsCatalog();
    public StepsB2B b2b = new StepsB2B();


    @BeforeMethod
    public void OpenPage() {
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(true));
        Configuration.timeout = 40000;
        Selenide.open("http://www.lubimogroup.com/");

    }

    public void CloseBrouser() {
        Selenide.closeWebDriver();
    }
}

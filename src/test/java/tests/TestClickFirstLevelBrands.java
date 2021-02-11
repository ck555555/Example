package tests;

import com.codeborne.selenide.Condition;
import fixture.Fixture;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import steps.Steps;

import static com.codeborne.selenide.Selenide.$;

public class TestClickFirstLevelBrands extends Fixture {
    @Epic("Бренды")
    @Feature("Бренд Любинское")
    @Story("Информация")
    @Test(description = "Проверка перехода отображения бренда Любинское")
    public void lyubinskoe(){

        step.goMenu("Бренды");
        step.checkPage();
     $(By.xpath("//a[@href=\"/brands/lyubinskoe/\" ]")) .click();
        $(By.xpath("//a[@href=\"/brands/lyubinskoe/\" ]")) .shouldHave(Condition.text("Любинское"));
        $(By.xpath("//img[@class=\"img-fluid\"  and @alt=\"Lubimo Group\"]")).click();
    }
    @Epic("Бренды")
    @Feature("Бренд Lubimo & Zdravo")
    @Story("Информация")
    @Test(description = "Проверка перехода отображения бренда Lubimo & Zdravo")
    public void LubimoZdravo(){
        step.goMenu("Бренды");
        step.checkPage();
        $(By.xpath("//a[@href=\"/brands/lubimo-zdravo/\" ]")) .pressEnter().shouldHave(Condition.text("Lubimo & Zdravo"));
        $(By.xpath("//img[@class=\"img-fluid\"  and @alt=\"Lubimo Group\"]")).click();
    }
    @Epic("Бренды")
    @Feature("Бренд Kuč")
    @Story("Информация")
    @Test(description = "Проверка перехода отображения бренда Kuč")
    public void Kuc(){
        step.goMenu("Бренды");
        step.checkPage();
        $(By.xpath("//a[@href=\"/brands/kuc/\" ]")) .pressEnter().shouldHave(Condition.text("Kuč"));
        $(By.xpath("//img[@class=\"img-fluid\"  and @alt=\"Lubimo Group\"]")).click();
    }
    @Epic("Бренды")
    @Feature("Бренд Kozari")
    @Story("Информация")
    @Test(description = "Проверка перехода отображения бренда Kozari")
    public void Kozari(){
        step.goMenu("Бренды");
        step.checkPage();
        $(By.xpath("//a[@href=\"/brands/kozari/\" ]")) .pressEnter().shouldHave(Condition.text("Kozari"));
        $(By.xpath("//img[@class=\"img-fluid\"  and @alt=\"Lubimo Group\"]")).click();
    }
    @Epic("Бренды")
    @Feature("Бренд Carnex")
    @Story("Информация")
    @Test(description = "Проверка перехода отображения бренда Carnex")
    public void Carnex(){step.goMenu("Бренды");
        step.checkPage();
        $(By.xpath("//a[@href=\"/brands/Carnex//\" ]")) .pressEnter().shouldHave(Condition.text("Carnex"));
        $(By.xpath("//img[@class=\"img-fluid\"  and @alt=\"Lubimo Group\"]")).click();
    }



}

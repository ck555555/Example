package tests.Cataloge;

import com.codeborne.selenide.Condition;
import fixture.Fixture;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class TestFirstPageCatalog extends Fixture {
    @Epic("Верхняя шапка")
    @Feature("Кликабельность")
    @Story("Переход возможен")
    @Test(description = "Проверка отображения каталога ")

    public void CheckClickCatalog() {
        $(By.xpath("//a[@class=\"navbar__presentation\"]")).shouldBe(Condition.visible).click();
    }

}

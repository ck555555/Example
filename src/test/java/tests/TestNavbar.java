package tests;

import fixture.Fixture;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class TestNavbar extends Fixture {
    @Epic("Верхняя шапка")
    @Feature("Проверка содержание верхней шапки сайта")
    @Story("Информация")
    @Test(description = "Проверка наличия текста в верхней шапке сайта")
    public void Navbar() {
        String text = $(By.xpath("//header[@class=\"navbar\"]")).getText();
        System.out.println(text);
        Assert.assertEquals(text,
                "+7 473 200 87 40\n" +
                "СКАЧАТЬ\n" +
                "КАТАЛОГ В PDF\n" +
                "ПОДРОБНЕЕ\n" +
                "О КОМПАНИИ\n" +
                "БРЕНДЫ\n" +
                "КАТАЛОГ\n" +
                "B2B РЕШЕНИЯ\n" +
                "КОНТАКТЫ");
    }
}

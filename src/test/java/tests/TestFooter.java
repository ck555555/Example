package tests;

import fixture.Fixture;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class TestFooter extends Fixture {
    @Epic("Нижняя шапка")
    @Feature("Проверка содержание нижней шапки сайта")
    @Story("Информация")
    @Test(description = "Проверка наличия текста в нижней шапке сайта")
    public void Footer() {
        String text = $(By.xpath("//footer[@class=\"footer\"]")).getText();
        System.out.println(text);
        Assert.assertEquals(text, "г. Воронеж, ул. Комиссаржевской, д. 10, оф. 802\n" +
                "+7 (473) 200-87-40\n" +
                "info@lubimogroup.com\n" +
                "ПРОДУКТЫ ВЫСШЕГО КАЧЕСТВА ДЛЯ НАШИХ ПОКУПАТЕЛЕЙ!\n" +
                "WWW.LUBIMOGROUP.COM");
    }
}

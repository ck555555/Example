package tests.Cataloge;

import com.codeborne.selenide.Condition;
import fixture.Fixture;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class TestGoCataloge extends Fixture {
    @Epic("Молочная консервация")
    @Feature("Молочная консервация")
    @Story("Информация")
    @Test(description = "Проверка отображения каталога Молочная консервация ")
    public void milk() {
        catalog.go("Каталог");
        catalog.checkPage();
        $(By.xpath("//a[text()='Молочная консервация']")).shouldHave(Condition.text("Молочная консервация")).click();
        String text = $(By.xpath("//main[@class='content container']")).getText();
        System.out.println(text);
        Assert.assertEquals(text, "МОЛОЧНАЯ КОНСЕРВАЦИЯ\n" +
                "\n" +
                "«Любинское» сгущенное молоко - эталон качества и вкуса!\n" +
                "Молоко цельное сгущенное с сахаром «Любинское», 380 г\n" +
                "Молоко сгущенное с сахаром Вареное «Любинское», 380 г\n" +
                "Варенка с сахаром «Любинское», 380 г\n" +
                "Молоко сгущенное с сахаром и какао «Любинское», 380 г\n" +
                "Молоко цельное сгущенное с сахаром «Любинское», 270 г (дой-пак)\n" +
                "Молоко цельное сгущенное с сахаром «Дружба», 380 г\n" +
                "Молоко цельное сгущенное с сахаром с ключом «Дружба», 380 г\n" +
                "Молоко цельное сгущенное с сахаром д/п «Дружба», 280 г\n" +
                "Сгущенка с сахаром и какао «Дружба», 380 г\n" +
                "Варенка с сахаром ж/б «Дружба», 380 г\n" +
                "Молоко цельное сгущенное с сахаром пэт «Дружба», 500 г\n" +
                "Молоко цельное сгущенное с сахаром пэт «Дружба», 910 г\n" +
                "Варенка с сахаром ведро «Дружба», 730 г\n" +
                "Сгущенка с сахаром «Праздничная», 380 г\n" +
                "Варенка с сахаром «Праздничная», 380 г\n" +
                "Сгущенка с сахаром ПЭТ «Праздничная», 500 г\n" +
                "Сгущенка с сахаром «Праздничная», 910 г");
    }
    @Epic("Сыры")
    @Feature("Рассольные")
    @Story("Информация")
    @Test(description = "Проверка отображения каталога рассольных сыров")
    public void cheezerassol(){
        catalog.go("Каталог");
        catalog.checkPage();
        $(By.xpath("//a[text()='Рассольные молодые сыры']")).shouldHave(Condition.text("Рассольные молодые сыры")).click();
        String text = $(By.xpath("//main[@class='content container']")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"РАССОЛЬНЫЕ МОЛОДЫЕ СЫРЫ\n" +
                "Сербская брынза «Lubimo & Zdravo» 220г\n" +
                "Сербская брынза «Lubimo & Zdravo», 220 г\n" +
                "Сербский Мягкий Белый сыр «Lubimo & Zdravo», ≈250 г\n" +
                "Легкий мягкий сыр Сербская брынза «KUC», 250 г\n" +
                "Сербская брынза «KUC», 250 г\n" +
                "Сыр мягкий Сиртос «KUC», 250 г");
    }
    @Epic("Сыры")
    @Feature("Мягкие")
    @Story("Информация")
    @Test(description = "Проверка отображения каталога мягких сыров")
    public void cheezeMyagkie(){
        catalog.go("Каталог");
        catalog.checkPage();
        $(By.xpath("//a[text()='Мягкие творожно-сливочные сыры']")).shouldHave(Condition.text("Мягкие творожно-сливочные сыры")).click();
        String text = $(By.xpath("//main[@class='content container']")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"МЯГКИЕ ТВОРОЖНО-СЛИВОЧНЫЕ СЫРЫ\n" +
                "Сербский творожный сыр Классический «Lubimo & Zdravo», 150 г\n" +
                "Сербский творожный сыр с зеленью «Lubimo & Zdravo», 150 г\n" +
                "Сербский творожный сыр легкий «Lubimo & Zdravo», 150 г\n" +
                "Сливочно-творожный сыр Сербский Каймак «KUC», 150 г\n" +
                "Сливочно-творожный сыр Сербский Каймак «KUC», 100 г\n" +
                "Сливочно-творожный сыр Пикантный Каймак с перчиком «KUC», 150 г\n" +
                "Творожный сыр Кремко «KUC», 100 г\n" +
                "Сербский сливочный сыр Классический «Dr. Milk», 150 г\n" +
                "Сербский сливочный сыр cо спелым томатом и базиликом «Dr. Milk», 150 г\n" +
                "Сербский сливочный сыр c зеленью «Dr. Milk», 150 г\n" +
                "Сербский сливочный сыр c шампиньонами «Dr. Milk», 150 г\n" +
                "Творожный крем-сыр для кулинарии «Dr. Milk», 2 кг");
    }
    @Epic("Сыры")
    @Feature("Полутвердые")
    @Story("Информация")
    @Test(description = "Проверка отображения каталога полутвердых сыров")
    public void cheezeTverdye(){
        catalog.go("Каталог");
        catalog.checkPage();
        $(By.xpath("//a[text()='Твердые и полутвердые сыры']")).shouldHave(Condition.text("Твердые и полутвердые сыры")).click();
        String text = $(By.xpath("//main[@class='content container']")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"ТВЕРДЫЕ И ПОЛУТВЕРДЫЕ СЫРЫ\n" +
                "Сербский Горный сыр Эдам, «Lubimo & Zdravo»,≈2,2 кг\n" +
                "Сербский Горный сыр Качокавалло, «Lubimo & Zdravo», ≈2.2 кг\n" +
                "Сербский Горный сыр Качокавалло, «Lubimo & Zdravo», ≈600г\n" +
                "Сербский Горный сыр Эдам, «Lubimo & Zdravo», ≈600г\n" +
                "Сыр полутвердый козий «Сербский старый белый» со вкусом и ароматом копчения Kozari, 200 г\n" +
                "Сыр полутвердый козий «Сербский старый белый» Kozari, 200 г\n" +
                "Полутвердый сыр «Российский особый», 50% жир, брусок, 200 г\n" +
                "Полутвердый сыр «Сливочный», 50% жир, брусок, 200 г\n" +
                "Полутвердый сыр «Голландский премиум», 45% жир, брусок, 200 г\n" +
                "Полутвердый сыр «Тильзитский», 45% жир, брусок, 200 г\n" +
                "Полутвердый сыр «Голландский премиум», 45% жир., брус ≈3-4 кг\n" +
                "Полутвердый сыр «Барон», 45% жир., брус ≈6-8 кг\n" +
                "Полутвердый сыр «Костромской», 45% жир., голова ≈8-9 кг\n" +
                "Полутвердый сыр «Пошехонский», 45% жир., голова ≈8-9 кг\n" +
                "Полутвердый сыр «Альбери», 51% жир., голова ≈8,5-9,5 кг\n" +
                "Сыр «ГороденЪ», 45% жир., голова ≈6-7 кг\n" +
                "Сыр «Грювер особый», 45% жир., квадрат ≈7-8 кг\n" +
                "Сыр «Пармезан де Люкс», 45% жир., голова ≈6-7 кг\n" +
                "Сыр «Рочестер» выдержанный, 45% жир., голова ≈9-10 кг\n" +
                "Сыр «Сметанковый», 45% жир., голова ≈6-7 кг");
    }
    @Epic("Антипасти")
    @Feature("Антипасти")
    @Story("Информация")
    @Test(description = "Проверка отображения каталога антипасти")
    public void antipasti(){
        catalog.go("Каталог");
        catalog.checkPage();
        $(By.xpath("//a[text()='Антипасти']")).shouldHave(Condition.text("Антипасти")).click();
        String text = $(By.xpath("//main[@class='content container']")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"АНТИПАСТИ\n" +
                "АРОМАТНЫЕ, ЯРКИЕ ЗАКУСКИ, ПРИГОТОВЛЕННЫЕ ИЗ СВЕЖИХ НАТУРАЛЬНЫХ СЕРБСКИХ ПРОДУКТОВ. \n" +
                "\n" +
                "Только натуральные ингредиенты — без химикатов, добавок и красителей.\n" +
                "Маленькие плоды — мы специально используем миниатюрные сорта, поэтому наши овощи цельные, упругие, не разваливаются и отлично смотрятся на столе.\n" +
                "Отменный  вкус. \n" +
                "Ассорти перчики черри и шампиньоны фаршированные сыром «Lubimo & Zdravo»\n" +
                "Перчики черри фаршированные сыром «Lubimo & Zdravo»\n" +
                "Шампиньоны фаршированные сыром «Lubimo & Zdravo»\n" +
                "Томаты вяленые в масле «Lubimo & Zdravo»\n" +
                "Зеленые оливки без косточек «Lubimo & Zdravo»");
    }
    @Test
    public void meat(){
        catalog.go("Каталог");
        catalog.checkPage();
        $(By.xpath("//a[text()='Мясная продукция']")).shouldHave(Condition.text("Мясная продукция")).click();
        String text = $(By.xpath("//main[@class='content container']")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"МЯСНАЯ ПРОДУКЦИЯ\n" +
                "Паштет куриный Carnex Selection, 95 г\n" +
                "Паштет с копченым беконом Carnex Selection, 95 г\n" +
                "Паштет с кусочками мяса Carnex Selection, 95 г\n" +
                "Паштет куриный Carnex SMAZAliCE, 95 г");
    }

    public static class MainPageClickLinks extends Fixture {
        @Test
        public void ClickLinks() {
            $(By.xpath("//a[@href=\"/company/\"]")).shouldBe(Condition.visible).shouldHave(Condition.text("О компании")).click();
            $(By.xpath("//a[@href=\"/brands/\"]")).shouldBe(Condition.visible).pressEnter().shouldHave(Condition.text("Бренды"));
            $(By.xpath("//a[@href=\"/catalog/\"]")).shouldBe(Condition.visible).pressEnter().shouldHave(Condition.text("Каталог"));
            $(By.xpath("//a[@href=\"/businnes-to-businnes/\"]")).shouldBe(Condition.visible).pressEnter().shouldHave(Condition.text("B2B РЕШЕНИЯ"));
            $(By.xpath("//a[@href=\"/contacts/\"]")).shouldBe(Condition.visible).pressEnter().shouldHave(Condition.text("Контакты"));
        }
    }
}


package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StepsB2B {
    @Step("Переход в раздел {text}")
    public void go(String text) {
        $(By.xpath("//a[text()=\"" + text + "\"]")).click();
    }

    public void checkPage() {
        $(By.xpath("//h1[text()=\"B2B решения\"]")).shouldBe(Condition.exist);
    }
}

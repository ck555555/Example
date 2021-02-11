package steps;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Steps {
    public void goMenu(String text) {
        $(By.xpath("//a[text()=\""+text+"\"]")).click();
    }
    public void checkPage() {
        $(By.xpath("//h1[text()=\"Бренды\"]")).shouldBe(Condition.exist);
    }
}



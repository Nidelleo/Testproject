import org.apache.commons.lang3.builder.ToStringExclude;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.Test;
import org.openqa.selenium.By;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\drivers\\chromedriver.exe");

    }

    @Test
    public void OpenDodoandFoundPizza ()
    {
        //знаю, что здесь лучше обратиться к атрибуту, но не могу понять как правильно прописать синтаксис

        open("https://dodopizza.ru/krasnoyarsk");
            $("body").shouldHave(text("Песто"));
    }

    @Test
    public void Login ()
    {
        //афигеть оно реально работает даже у меня шок

        open("https://dodopizza.ru/krasnoyarsk/loyaltyprogram");
        $("button[data-type='tertiary']").click();
        $(By.id("phn-input")).setValue("9029676065").pressEnter();
    }
}

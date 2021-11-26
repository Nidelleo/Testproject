import com.codeborne.selenide.CollectionCondition;
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

    @Test
    public void InHeader10Links ()
    {
        open("https://dodopizza.ru/krasnoyarsk");
        $$(".ymp2tw-1.egnRch li.ymp2tw-2.gWaecf").shouldHave(CollectionCondition.size(10));
    }
}

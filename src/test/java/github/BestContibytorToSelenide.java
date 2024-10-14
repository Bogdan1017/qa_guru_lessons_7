package github;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContibytorToSelenide {

    @Test
   void andreiSontsevShouldBeFirstContributor(){
        open("https://github.com/selenide/selenide");
        //Подвести мышку к первому аватару блока Contributors

        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest(".BorderGrid-cell").$("ul li").hover();
//Проверка: В всплывающем окне есть текст Andrei Solntsev
        sleep(5000);
    }


}

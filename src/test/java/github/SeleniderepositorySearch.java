package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class SeleniderepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop(){
        //Open main page
        Selenide.open("https://github.com/");
        //Enter Selenide in search field and press Enter
        $("[placeholder='Search or jump to...']").click();
        $("input#query-builder-test.FormControl-input[data-target='query-builder.input']").
                setValue("selenide").pressEnter();
        //Click on the first repository in the search result
        $("a.Link__StyledLink-sc-14289xe-0.dIlPa[href='/selenide/selenide']").click();

        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        //Test - title = selenide/selenide
        sleep(5000);
    }

}

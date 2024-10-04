package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;


public class SeleniderepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop(){
        //Open main page
        Selenide.open();


        //Enter Selenide in search field and press Enter
        //Click on the first repository in the search result
        //Test - title = selenide/selenide
    }
}

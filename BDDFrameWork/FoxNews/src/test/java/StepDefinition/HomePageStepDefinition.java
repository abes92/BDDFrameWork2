package StepDefinition;

import common.WebAPI;

import homePage.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static homePage.HomePageWebElements.*;

public class HomePageStepDefinition extends WebAPI {
    static HomePage homePage;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
        }
    }
    @After
    public void closeBrowser(){
        cleanUp();
    }

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }

    @Given("I am in FoxNews homepage")
    public void i_am_in_fox_news_homepage() throws IOException{
openBrowser();
    }

    @Given("I click on life style")
    public void i_click_on_life_style() {
   homePage.clickSearchButton();
    }

    @Then("I verify life style is appear properly")
    public void i_verify_life_style_is_appear_properly() {
homePage.validate("Lifestyle");
    }
    @Given("I click on TV")
    public void i_click_on_tv() {
homePage.ClickTV();
    }
    @Then("I verify Shows are appearing properly")
    public void i_verify_shows_are_appearing_properly() {
homePage.validateTV("Fox News Shows");
    }




//    @Given("I am in FoxNews homepage1")
//    public void i_am_in_fox_news_homepage1() throws IOException{
//     openBrowser();
//    }
    @Given("I click more")
    public void i_click_more() {
        homePage.ClickMore();
    }
    @Then("I click Search box")
    public void i_click_search_box() {
      homePage.SearchBox("soccer news");
    }
    @Then("I send {string} to search box")
    public void i_send_to_search_box(String product) {
homePage.SearchBox(product);
    }
    @Then("I click search")
    public void i_click_search() {
   homePage.ClickButton();
    }

//    @Then("I verify {string} values")
//    public void i_verify_values(String product) {
//        homePage.validation(product);

  //  }
    @Then("I close browser")
    public void i_close_browser() {
    }



       //example with scenario using data table
//    @Given("I am in FoxNews homepage2")
//    public void i_am_in_fox_news_homepage2()throws IOException {
//     openBrowser();
//    }
    @Then("I click en log in")
    public void i_click_en_log_in() {
    driver.findElement(By.xpath(webElementLogIn)).click();
    }
    @Then("I click on create an account")
    public void i_click_on_create_an_account() {
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[2]/main/section/div/form/div[4]/button")).click();

    }
    @Then("I file the form given")
    public void i_file_the_form_given(DataTable credentials)throws Throwable {
        List<List<String>> data = credentials.asLists(String.class);
        for (int i = 0; i < data.size(); i++) {
            driver.findElement(By.xpath(webElementEmail)).sendKeys(data.get(i).get(0));
            driver.findElement(By.xpath(webElementPassWord)).sendKeys(data.get(i).get(1));
            driver.findElement(By.xpath(webElementFirstName)).sendKeys(data.get(i).get(2));
            driver.findElement(By.xpath(webElementLastName)).sendKeys(data.get(i).get(3));
        }

    }

///scenario # 3

    @Given("I click on tv1")
    public void i_click_on_tv1() {
    homePage. ClickTV();
    }
    @Given("I click on air personalities")
    public void i_click_on_air_personalities() {
homePage.clickAirPersonalities();
    }
    @Then("i verify on air personalities appears correctly")
    public void i_verify_on_air_personalities_appears_correctly() {
homePage.validate1("On Air Personalities");
    }
    //scenario #4
    @Given("I click on tv2")
    public void i_click_on_tv2() {
        homePage. ClickTV();
    }
    @Then("I click on view schedule")
    public void i_click_on_view_schedule() {
homePage.clickViewSchedule();
    }
    @Then("i verify schedule appears correctly")
    public void i_verify_schedule_appears_correctly() {
homePage.validateSchedule("Full Schedule");
    }
    //scenario #5
    @Given("I click on tv3")
    public void i_click_on_tv3() {
        homePage. ClickTV();
    }
    @Then("I click on watch live")
    public void i_click_on_watch_live() {
   homePage.clickWatchLive();
    }
    @Then("i verify watch live appears correctly")
    public void i_verify_watch_live_appears_correctly() {
   homePage.validateWatchLive("");
    }
    //scenario #6
    @Given("I scroll down to the bottom")
    public void I_scroll_down_to_the_bottom() {
        homePage.scrollDown();
    }
    @Then("I click on full episode")
    public void i_click_on_full_episode() {
        homePage.clickFullEpisode();
    }
    @Then("i verify full episode appears correctly")
    public void i_verify_full_episode_appears_correctly() {
     homePage.validateEpisode("Most Recent Episodes");
    }
    //scenario #7
    @Given("I scroll down to the life style")
    public void I_scroll_down_to_the_life_style() {
        homePage.scrollDown();
    }
    @Then("I click on Food and Drink")
    public void i_click_on_food_and_drink() {
      homePage.clickFoodDrink();
    }
    @Then("i verify Food and Drink appears correctly")
    public void i_verify_food_and_drink_appears_correctly() {
       homePage.validateDrink("Food & Drink");
    }
    //scenario #8
    @Given("I click on tv8")
    public void i_click_on_tv8() {
        homePage. ClickTV();
    }
    @Given("I click on watch live bottom")
    public void i_click_on_watch_live_bottom() {
        homePage.clickWatchLive();
    }
    @Then("I click on fox news flush")
    public void i_click_on_fox_news_flush() {
     homePage.clickFlash();
    }
    @Then("i verify fox news flash appears correctly")
    public void i_verify_fox_news_flash_appears_correctly() {
homePage.validateFlash("");
    }
//scenario # 9
@Given("I click on tv9")
public void i_click_on_tv9() {
    homePage. ClickTV();
}
    @Given("I click on watch live bottom1")
    public void i_click_on_watch_live_bottom1() {
        homePage.clickWatchLive();
    }
    @Then("I click on fox nation")
    public void i_click_on_fox_nation() {
    homePage.clickFoxNation();
    }
    @Then("i verify fox nation appears correctly")
    public void i_verify_fox_nation_appears_correctly() {
     homePage.validateFoxNation("");
    }
    //scenarion # 10

    @Then("I click on fox news radio")
    public void i_click_on_fox_news_radio() {
     homePage.clickFoxRadio();
    }
    @Then("i verify fox news radio appears correctly")
    public void i_verify_fox_news_radio_appears_correctly() {
     homePage.validateFoxRadio("FOX News Talk Web Stream");
    }
    //scenario # 11
    @Then("I click on news clips")
    public void i_click_on_news_clips() {
    homePage.clickNewsClips();
    }
    //scenario # 12
    @Then("I click on fox business")
    public void i_click_on_fox_business() {
    homePage.clickFoxBusiness();
    }
    @Then("I verify fox business appears properly")
    public void i_verify_fox_business_appears_properly() {
    homePage.validateFoxBusiness("Fox Business");
    }
    //scenario # 13
    @Then("I click on login")
    public void i_click_on_login() {
driver.findElement(By.xpath(webElementLogIn2)).click();
    }
    //scenario #14
    @Then("I click on faceBook")
    public void I_click_on_faceBook() {
        driver.findElement(By.xpath(webElementFaceBook)).click();
    }
    //scenario # 15
    @Then("I click on twitter")
    public void I_click_on_twitter() {
        driver.findElement(By.xpath(webElementTwitter)).click();
    }
    //scenario outline #16
    @Then("I enter {string} and {string}")
    public void i_enter_and(String email, String password) {
      driver.findElement(By.xpath(webElementEmail2)).sendKeys(email);
        driver.findElement(By.xpath(webElementPassWord2)).sendKeys(password);
    }
    @Then("i wil try to login")
    public void i_wil_try_to_login() {
        driver.findElement(By.xpath(webElementLogIn3)).click();
    }
    //scenario #17
    @Given("I pass details ")
    public void I_pass_details(DataTable dataTable) throws  Throwable{
        List<Map<String,String>> data=dataTable.asMaps(String.class,String.class);
        for(int index=0;index<data.size();index++) {
            driver.findElement(By.xpath(webElementEmail2)).sendKeys(data.get(index).get("email"));
            driver.findElement(By.xpath(webElementPassWord2)).sendKeys(data.get(index).get("password"));
        }
    }
    //scenario #22
    @Then("I pass details")
    public void i_pass_details(DataTable dataTable) {
//      for(Map<String, String> data = (Map<String, String>) dataTable.asMaps(String.class,String.class)) {
//
//          driver.findElement(By.xpath(webElementEmail2)).sendKeys(data.get("email"));
//          driver.findElement(By.xpath(webElementPassWord2)).sendKeys(data.get("password"));
    List<Map<String,String>> data1=dataTable.asMaps(String.class,String.class);
    for(int index=0;index<data1.size();index++){

        driver.findElement(By.xpath(webElementEmail2)).sendKeys(data1.get(index).get("email"));
        driver.findElement(By.xpath(webElementPassWord2)).sendKeys(data1.get(index).get("password"));
        driver.findElement(By.xpath(webElementLogIn3)).click();

    }

    }
    //sceario #18
    @Then("I try to log In")
    public void i_try_to_log_in(DataTable dataTable) {
       List<List<String>> data2=dataTable.asLists(String.class);
       for(int i=0;i<data2.size();i++) {
           driver.findElement(By.xpath(webElementEmail2)).sendKeys(data2.get(i).get(0));
           driver.findElement(By.xpath(webElementPassWord2)).sendKeys(data2.get(i).get(1));
       }
    }

    @Then("I click log")
    public void i_click_log() {
      driver.findElement(By.xpath(webElementLogIn3)).click();
    }

    @Then("I click on forget password")
    public void i_click_on_forget_password() {
        driver.findElement(By.xpath(webElementForgetPassword)).click();

    }

    @Then("i try to resend the password")
    public void i_try_to_resend_the_password() {
driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[2]/main/section/div/form/div[2]/input")).sendKeys("buotam@hotmail.com");
    }
//scenario #19
@Then("i click on coronavirus")
public void i_click_on_coronavirus() {
        driver.findElement(By.xpath(webElementCoronaVirus)).click();

}
//scenario #20
@Then("I click politics")
public void i_click_politics() {
   driver.findElement(By.xpath(webElementPolitics)).click();
}


}

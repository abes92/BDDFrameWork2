package StepDefinition;
import common.WebAPI;
import homePage.JetBlueHomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

import static homePage.HomePageWebElement.*;
public class HomePageStepDefinition extends WebAPI {

    static JetBlueHomePage homePage;
    @After
    public void closeBrowser(){
        cleanUp();
    }

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver,JetBlueHomePage.class);
    }
    @Given("I am on jet blue home page")
    public void i_am_on_jet_blue_home_page() throws IOException {
     openBrowser();
    }
//scenario #1
    @Then("I click on book")
    public void i_click_on_book() {
        driver.findElement(By.xpath(webElementBook)).click();
    }
    //scenario #2
    @Then("I click on travel info")
    public void I_click_on_travel_info() {
        driver.findElement(By.xpath(webElementTravelInfo)).click();
    }
    //scenario #3
    @Then("I click on my trip")
    public void I_click_on_my_trip() {
        driver.findElement(By.xpath(webElementMyTrip)).click();
    }
    //scenario #4
    @Then("I click on trueBlue")
    public void I_click_on_trueBlue() {
        driver.findElement(By.xpath(webElementTrueBlue)).click();
    }
    //scenario #5

    @Then("I click sign in")
    public void i_click_sign_in() {
driver.findElement(By.xpath(webElementSignIn)).click();
    }

    @Then("I verify sign in appears properly")
    public void i_verify_sign_in_appears_properly() {
        String expectedResult="Sign In";
  String actualResult=driver.findElement(By.xpath(webElementVerifySignIn)).getText();
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Then("I send {string} and {string}")
    public void i_send_and(String email, String password) {
        driver.findElement(By.id(webElementEmail)).sendKeys(email);
        driver.findElement(By.xpath(webElementPassword)).sendKeys(password);
    }

    @Then("I click log in")
    public void i_click_log_in() {
driver.findElement(By.xpath(webElementLogIn)).click();
    }
    //scenario #6
    @Then("I try to log in")
    public void i_try_to_log_in(DataTable dataTable) {
        List<List<String>> data=dataTable.asLists(String.class);
        for (int index=0;index<data.size();index++) {

            driver.findElement(By.cssSelector(webElementEmail)).sendKeys(data.get(index).get(0));
            driver.findElement(By.xpath(webElementPassword)).sendKeys(data.get(index).get(1));
        }
    }
    //scenario #7
    @Then("I click on travel bank credit")
    public void I_click_on_travel_bank_credit() {
        driver.findElement(By.xpath(webElementTravelBankCredit)).click();
    }
    //scenario # 8
    @Then("I click on check in")
    public void I_click_on_check_in() {
        driver.findElement(By.xpath(webElementCheckIn)).click();
    }
    //scenario #9
    @Then("I click on flight tracker")
    public void I_click_on_flight_tracker() {
        driver.findElement(By.xpath(webElementFlightTracker)).click();
    }
    //scenario #10
    @Then("I click on travel alerts")
    public void I_click_on_travel_alerts() {
        driver.findElement(By.xpath(webElementTravelAlerts)).click();
    }
    //scenario #11
    @Then("I click join")
    public void I_click_join() {
        driver.findElement(By.xpath(webElementJoin)).click();
    }
    //scenario #12
    @Then("I send variables")
    public void i_send_variables(DataTable dataTable) {
       List<List<String>>  data=dataTable.asLists(String.class);
       driver.findElement(By.xpath(webElementEmail1)).sendKeys(data.get(0).get(0));
    }

    @Then("I click sign in1")
    public void i_click_sign_in1() {
        driver.findElement(By.xpath(webElementNext)).click();

    }
    //scenario # 13

    @Then("i file the rest")
    public void i_file_the_rest(DataTable dataTable) {
      List<List<String>> data1=dataTable.asLists(String.class);
      driver.findElement(By.xpath(webElementFN)).sendKeys(data1.get(0).get(0));
        driver.findElement(By.xpath(webElementMN)).sendKeys(data1.get(0).get(1));
        driver.findElement(By.xpath(webElementLN)).sendKeys(data1.get(0).get(2));
        ((JavascriptExecutor)driver).executeScript("scroll(0,600)");
        driver.findElement(By.xpath("//*[@id=\"bday1SelectDesktop\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"bday1SelectDesktop\"]/option[7]")).click();
        driver.findElement(By.xpath("//*[@id=\"bday2SelectDesktop\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"bday2SelectDesktop\"]/option[11]")).click();
        driver.findElement(By.xpath("//*[@id=\"bday3SelectDesktop\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"bday3SelectDesktop\"]/option[2]")).click();
    }
    @Then("I click sign in2")
    public void i_click_sign_in2() {
        driver.findElement(By.xpath(webElementNext2)).click();
    }
    //scenario #15
    @Then("I click on round trip")
    public void I_click_on_round_trip() {
        driver.findElement(By.xpath(webElementRoundTrip)).click();
    }
    @Then("I send locations")
    public void i_send_locations(DataTable dataTable) {
       List<List<String>> data=dataTable.asLists(String.class);
       driver.findElement(By.xpath(webElementFromWhere)).click();
       driver.findElement(By.xpath(webElementFromWhere)).sendKeys(data.get(0).get(0));
        driver.findElement(By.xpath(webElementToWhere)).sendKeys(data.get(0).get(1));
        driver.findElement(By.xpath(webElementGo)).click();
    }
    //scenario # 16
    @Then("I click on book with out change or cancel")
    public void i_click_on_book_with_out_change_or_cancel() {
        driver.findElement(By.xpath(webElementGo)).click();
    }
    //scenario # 17
    @Then("i click on weather disruption")
    public void i_click_on_weather_disruption() {
        driver.findElement(By.xpath(webElementWeather)).click();
    }
    //scenario #18
    @Then("I click on fee weather button then link")
    public void I_click_on_fee_weather_button_then_link() {
        driver.findElement(By.xpath(webElementFeeWeather)).click();
        driver.findElement(By.xpath(webElementFeeWeatherLink)).click();
    }
    @Then("I verify weather fee appears properly")
    public void I_verify_weather_fee_appears_properly() {
        String expected="Travel Alerts";
        String actual=driver.findElement(By.xpath(webElementVerifyWeather)).getText();
        Assert.assertEquals(actual,expected);
    }
    //scenario # 19
    @Then("I click on cancelled")
    public void I_click_on_cancelled() {
        driver.findElement(By.xpath(webElementCancelled)).click();
    }
    //scenario # 20
    @Then("I click on changed flight")
    public void I_click_on_changed_flight() {
        driver.findElement(By.xpath(webElementChanged)).click();
    }
    //scenario # 21
    @Then("I click on voluntary")
    public void I_click_on_voluntary() {
        driver.findElement(By.xpath(webElementVoluntary)).click();
    }
    //scenario # 22
    @Then("I click on other important information")
    public void I_click_on_other_important_information() {
        driver.findElement(By.xpath(webElementOthers)).click();
    }
    //scenario # 23
    @Then("I click on Manage trip")
    public void I_click_on_Manage_trip() {
        driver.findElement(By.xpath(webElementManage)).submit();
    }
    @Then("I verify manage trip appears properly")
    public void I_verify_manage_trip_appears_properly() {
        String expected="Find your flight to";
        String actual=driver.findElement(By.xpath(webElementVerifyManage)).getText();
        Assert.assertEquals(actual,expected);
    }
    //scenario # 24
    @Then("I click on wifi")
    public void I_click_on_wifi() {
        driver.findElement(By.xpath(webElementFlyingWUs)).submit();
    }

}

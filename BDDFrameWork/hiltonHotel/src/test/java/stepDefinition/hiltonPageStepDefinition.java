package stepDefinition;

import common.WebAPI;
import hiltonPage.HiltonHomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

import static hiltonPage.HiltonHomePageWebElement.*;

public class hiltonPageStepDefinition extends WebAPI {

    static HiltonHomePage homePage;
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
        homePage= PageFactory.initElements(driver,HiltonHomePage.class);
    }
    @Given("I am on hilton hotel home page")
    public void I_am_on_hilton_hotel_home_page()throws IOException {
     openBrowser();
    }
    @Given("I click on sign in")
    public void I_click_on_sign_in() {
        driver.findElement(By.xpath("//*[@id=\"NavMenu\"]/div/div/div/a[2]")).click();
    }
    //scenario #2
    @Then("I click on find a hotel")
    public void i_click_on_find_a_hotel() {
       driver.findElement(By.xpath(webElementFindHotel)).click();
    }
    //scenario # 3
    @Then("I click on join")
    public void i_click_on_join() {
       driver.findElement(By.xpath(webElementJoin)).click();
    }
    //scenario # 4
    @Then("I follow the steps")
    public void i_follow_the_steps(DataTable dataTable) {
        List<List<String>> data=dataTable.asLists(String.class);
        for (int index=0;index<data.size();index++){
            driver.findElement(By.xpath(webElementFN)).sendKeys(data.get(index).get(0));
            driver.findElement(By.xpath(webElementLN)).sendKeys(data.get(index).get(1));
            driver.findElement(By.xpath(webElementPH)).sendKeys(data.get(index).get(2));
            driver.findElement(By.xpath(webElementEmail)).sendKeys(data.get(index).get(3));
            driver.findElement(By.xpath(webElementAddress)).sendKeys(data.get(index).get(4));
            driver.findElement(By.xpath(webElementZipCode)).sendKeys(data.get(index).get(5));
            driver.findElement(By.xpath(webElementPassWord)).sendKeys(data.get(index).get(6));
            driver.findElement(By.xpath(webElementPassWord1)).sendKeys(data.get(index).get(7));
        }
    }
    @Then("I register for free")
    public void i_register_for_free() {
      driver.findElement(By.xpath(webElementRegister)).click();
    }
    //scenario #5
    @Then("I try to find destination")
    public void i_try_to_find_destination() {
    driver.findElement(By.xpath(webElementWhereTo)).sendKeys("California");
    }
    //scenario #6
    @Then("I log in")
    public void i_log_in() {
       driver.findElement(By.xpath(webElementLogIn)).click();
    }
    //scenario #7
    @Then("I send {string} and {string}")
    public void i_send_and(String username, String password) {
      driver.findElement(By.xpath(webElementUN)).sendKeys(username);
        driver.findElement(By.xpath(webElementPW)).sendKeys(password);
        driver.findElement(By.xpath(webElementNotRobot)).click();
        driver.findElement(By.xpath(webElementSignIn1)).click();
    }
    //scenario #8
    @Then("I click location")
    public void I_click_location() {
        driver.findElement(By.xpath(webElementLocations)).click();
    }
    //scenario #9
    @Then("I click where to")
    public void i_click_where_to() {
        driver.findElement(By.xpath(webElementDestination)).sendKeys("jersey");
    }
    //scenario #10
    @Then("I click on Find event")
    public void I_click_on_Find_event() {
        driver.findElement(By.xpath(webElementFindEvent)).click();
    }
    //scenario #11
    @Then("I search for the event")
    public void i_search_for_the_event() {
        driver.findElement(By.xpath(webElementLocation)).sendKeys("brooklyn");
    }
    //scenario #12
    @Then("I click offers")
    public void I_click_offers() {
        driver.findElement(By.xpath(webElementOffers)).click();
    }
    //scenario #13
    @Then("I verify offers appears properly")
    public void i_verify_offers_appears_properly() {
        String expected="Hilton Honors";
       String actualResult=driver.findElement(By.xpath(webElementVerifyOffers)).getText();
       Assert.assertEquals(actualResult,expected);
    }
    //scenaro #14
    @Then("I click find hotel")
    public void I_click_find_hotel() {
        driver.findElement(By.xpath(webElementFindHotel1)).sendKeys("Philadelphia");
    }
    //scenario #15
    @Then("I choose arrival and departure time")
    public void I_choose_arrival_and_departure_time() {
        driver.findElement(By.xpath(webElementArrival)).sendKeys("09212020");
        driver.findElement(By.xpath(webElementDeparture)).sendKeys("09232020");
    }
    //scenario #16
    @Then("I choose arrival and departure time1")
    public void I_choose_arrival_and_departure_time1() {
        driver.findElement(By.xpath(webElementArrival1)).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-col0-dRow3-0-21\"]/a")).click();
        driver.findElement(By.xpath(webElementDeparture1)).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-col0-dRow3-0-22\"]/a")).click();
    }
//scenario #17
@Then("I choose room and adult")
public void I_choose_room_and_adult() {
    driver.findElement(By.xpath(webElementRooms)).click();
    driver.findElement(By.xpath(webElementAdults)).click();
}
//scenario #18
@Then("I click on support")
public void i_click_on_support() {
driver.findElement(By.xpath(webElementSupport)).click();
}
//scenario #19
@Then("I click on credit cards")
public void I_click_on_credit_cards() {
    driver.findElement(By.xpath(webElementCreditCards)).click();
}
//scenario #20
@Then("I Verify credit cards appears properly")
public void I_Verify_credit_cards_appears_properly() {
        String expectedResult="Credit Cards";
   String actualResult=driver.findElement(By.xpath(webElementVerifyCreditCards)).getText();
   Assert.assertEquals(actualResult,expectedResult);
}
//scenario #21
@Then("I click on travel Inspiration")
public void I_click_on_travel_Inspiration() {
    driver.findElement(By.xpath(webElementTravelInspiration)).click();
}
    //scenario #22
    @Then("I click on experiences")
    public void I_click_on_experiences() {
        driver.findElement(By.xpath(webElementExperiences)).click();
    }
    //scenario #23
    @Then("i click on points")
    public void i_click_on_points() {
        driver.findElement(By.xpath(webElementPoints)).click();
    }

    @Then("I verify points appears properly")
    public void i_verify_points_appears_properly() {
        String expectedResult="to the Points";
        String actualResult=driver.findElement(By.xpath(webElementToPoint)).getText();
        Assert.assertEquals(actualResult,expectedResult);
    }
    //scenario #24
    @Then("I click on member benefits")
    public void I_click_on_member_benefits() {
        driver.findElement(By.xpath(webElementMemberBenefits)).click();
    }

}


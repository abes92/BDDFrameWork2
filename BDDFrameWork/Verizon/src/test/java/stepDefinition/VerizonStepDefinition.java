package stepDefinition;

import common.WebAPI;
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
import whyVerizon.HomePage;
import static whyVerizon.WhyVerizonWebElement.*;
import java.io.IOException;
import java.util.List;

public class VerizonStepDefinition extends WebAPI {
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
    @Given("I am on verizon home page")
    public void i_am_on_verizon_home_page() throws IOException {
       openBrowser();
    }

    @Then("i click on why verizon")
    public void i_click_on_why_verizon() {
  driver.findElement(By.xpath(webElementWhyVerizon)).click();
    }
//scenario #1
    @Then("i click on 5G overview")
    public void i_click_on_5g_overview() {
        driver.findElement(By.xpath(webElement5G)).click();

    }
    //scenario #2
    @Then("i click on 5G coverage map")
    public void i_click_on_5G_coverage_map() {
        driver.findElement(By.xpath(webElement5GCoverage)).click();

    }
    //scenario #3
    @Then("i click on 5G labs")
    public void i_click_on_5G_labs() {
        driver.findElement(By.xpath(webElement5GLabs)).click();

    }
    //scenario #4
    @Then("i click on Network awards")
    public void i_click_on_Network_awards() {
        driver.findElement(By.xpath(webElementNetworkAwards)).click();

    }
    //scenario #5
    @Then("i click on Fios")
    public void i_click_on_Fios() {
        driver.findElement(By.xpath(webElementFios)).click();

    }
    //scenario #6
    @Then("i click on Global Coverage")
    public void i_click_on_Global_Coverage() {
        driver.findElement(By.xpath(webElementGlobalCoverage)).click();
    }
    //scenario #7
    @Then("i click on Devices")
    public void i_click_on_Devices() {
        driver.findElement(By.xpath(webElementDevices)).click();
    }
    //scenario #8
    @Then("i click on mobile")
    public void i_click_on_mobile() {
        driver.findElement(By.xpath(webElementMobile)).click();
    }
    //scenario #9
    @Then("i click on entertainment")
    public void i_click_on_entertainment() {
        driver.findElement(By.xpath(webElementEntertainment)).click();
    }
    //scenario #10
    @Then("i click on Verizon up")
    public void i_click_on_Verizon_up() {
        driver.findElement(By.xpath(webElementVerizonUp)).click();
    }
    //scenario #11
    @Then("i click on Visa Card")
    public void i_click_on_Visa_Card() {
        driver.findElement(By.xpath(webElementVisaCard)).click();
    }
    //scenario #12
    @Then("i click on Device protection")
    public void i_click_on_Device_protection() {
        driver.findElement(By.xpath(webElementProtection)).click();
    }
    //scenario #13
    @Then("i click on cloud")
    public void i_click_on_cloud() {
        driver.findElement(By.xpath(webElementCloud)).click();
    }
    //scenario #14
    @Then("i click on Responsibility")
    public void i_click_on_Responsibility() {
        driver.findElement(By.xpath(webElementResponsibility)).click();
    }
    //scenario #15
    @Then("i click on privacy")
    public void i_click_on_privacy() {
        driver.findElement(By.xpath(webElementPrivacy)).click();
    }
    //scenario #16
    @Then("I click on sign in")
    public void I_click_on_sign_in() {
        driver.findElement(By.xpath(webElementSignIn)).click();
    }
    //scenario #17
    @Then("I verify sign in appears properly")
    public void I_verify_sign_in_appears_properly() {
        String expected="Sign in";
       String actual= driver.findElement(By.xpath(webElementVerifySignIn)).getText();
        Assert.assertEquals(actual,expected);
    }
    //scenario #18
    @Then("I send {string} and {string}")
    public void i_send_and(String ID, String password) {
        driver.findElement(By.xpath(webElementID)).sendKeys(ID);
        driver.findElement(By.xpath(webElementPassword)).sendKeys(password);
        driver.findElement(By.xpath(webElementLogIn)).click();
    }
    //scenario #19
    @Then("I click register")
    public void I_click_register() {
        driver.findElement(By.xpath(webElementRegister)).click();
    }
    //scenario #20
    @Then("i click on continue")
    public void i_click_on_continue() {
        driver.findElement(By.xpath(webElementContinue)).click();
    }
    //scenario #21
    @Then("i click on i forgot my info")
    public void i_click_on_i_forgot_my_info() {
        driver.findElement(By.xpath(webElementForgotInfo)).click();
    }
    //scenario #22
    @Then("i click on make one time payment")
    public void i_click_on_make_one_time_payment() {
        driver.findElement(By.xpath(webElementMake1TimePayment)).click();
    }
    //scenario #23
    @Then("i try to log in")
    public void i_try_to_log_in(DataTable dataTable) {
        List<List<String>> data=dataTable.asLists(String.class);
        driver.findElement(By.xpath(webElementUserID)).sendKeys(data.get(0).get(0));
    }
    @Then("i click on continue1")
    public void i_click_on_continue1() {
        driver.findElement(By.xpath(webElementContinue1)).click();
    }
    //scenario #24
    @Then("i click on continue2")
    public void i_click_on_continue2() {
        driver.findElement(By.xpath(webElementContinue2)).click();

    }

    @Then("i click on wirless then i file the rest")
    public void i_click_on_wirless_then_i_file_the_rest(DataTable dataTable) {
       List<List<String>> data=dataTable.asLists(String.class);
        driver.findElement(By.xpath(webElementAccountType)).click();
        driver.findElement(By.xpath(webElementActiveAccount)).click();
        driver.findElement(By.xpath(webElementWirelessNum)).click();
        driver.findElement(By.xpath(webElementWirelessNum1)).sendKeys(data.get(0).get(0));
        driver.findElement(By.xpath(webElementWirelessNum2)).sendKeys(data.get(0).get(1));
        driver.findElement(By.xpath(webElementWirelessNum3)).sendKeys(data.get(0).get(2));
        driver.findElement(By.xpath(webElementZipCode)).sendKeys(data.get(0).get(3));
    }
    @Then("i click log1")
    public void i_click_log1() {
        driver.findElement(By.xpath(webElementLog)).click();
    }
    //scenario #25
    @Then("I click on in home")
    public void I_click_on_in_home () {
        driver.findElement(By.xpath(webElementInHome)).click();
    }
}

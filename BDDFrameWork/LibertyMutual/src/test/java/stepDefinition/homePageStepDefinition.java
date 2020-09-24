package stepDefinition;

import common.WebAPI;
import homePage.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static homePage.HomePageWebElement.*;
public class homePageStepDefinition extends WebAPI {
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

    @Given("i am on home page")
    public void i_am_on_home_page() throws IOException {
        openBrowser();
    }
    //scenario #1
    @Then("i click on auto")
    public void i_click_on_auto(){
        driver.findElement(By.xpath(webElementAuto)).click();
    }
    //scenario #2
    @Then("i send zip code")
    public void i_send_zip_code(DataTable dataTable) {
        List<List<String>> data=dataTable.asLists(String.class);
        driver.findElement(By.xpath(webElementZipCode)).sendKeys(data.get(0).get(0));
    }
    @Then("i click get my price")
    public void i_click_get_my_price() {
        driver.findElement(By.xpath(webElementGetPrice)).click();
    }
    //scenario #3
    @Then("i click on property")
    public void i_click_on_property() {
        driver.findElement(By.xpath(webElementProperty)).click();
    }
    //scenario #4
    @And("i click on home")
    public void i_click_on_home() {
        driver.findElement(By.xpath(webElementHome)).click();
    }
    //scenario #5
    @And("i click on renters")
    public void i_click_on_renters() {
        driver.findElement(By.xpath(webElementRenters)).click();
    }
    //scenario #6
    @And("i click on condo")
    public void i_click_on_condo() {
        driver.findElement(By.xpath(webElementCondo)).click();
    }
    //scenario #7
    @Then("i send zip code2")
    public void i_send_zip_code2(DataTable dataTable) {
        List<List<String>> data=dataTable.asLists(String.class);
        driver.findElement(By.xpath(webElementZipCode1)).sendKeys(data.get(0).get(0));
    }
    //scenario #8
    @Then("i click on bundle")
    public void i_click_on_bundle() {
    driver.findElement(By.xpath(webElementBundle)).click();
    }
    //scenario #9
    @Then("i click on autoHome")
    public void i_click_on_autoHome() {
        driver.findElement(By.xpath(webElementAutoHome)).click();
    }
    //scenario #10
    @Then("i click on AutoRenters")
    public void i_click_on_AutoRenters() {
        driver.findElement(By.xpath(webElementAutoRenters)).click();
    }
    //scenario #11
    @Then("i click on AutoCondo")
    public void i_click_on_AutoCondo() {
        driver.findElement(By.xpath(webElementAutoCondo)).click();
    }
    //scenario #12
    @Then("i click zip code")
    public void i_click_zip_code() {
        driver.findElement(By.cssSelector(webElementZipCode3)).sendKeys("11214");
    }
    //scenario #13
    @Then("i click on sign in")
    public void i_click_on_sign_in() {
        driver.findElement(By.xpath(webElementSignIn)).click();
    }
    //scenario #14
    @Then("i click on customer support")
    public void i_click_on_customer_support() {
        driver.findElement(By.xpath(webElementCustomerSupport)).click();
    }
    //scenario #15
    @Then("i click on claims")
    public void i_click_on_claims() {
        driver.findElement(By.xpath(webElementClaims)).click();
    }
    //scenario #16
    @Then("i click on shop insurance")
    public void i_click_on_shop_insurance() {
        driver.findElement(By.xpath(webElementShopInsurance)).click();
    }
    //scenario #17
    @Then("i send {string} and {string}")
    public void i_send_and(String username, String password) {
        driver.findElement(By.id(webElementUserName)).sendKeys(username);
        driver.findElement(By.xpath(webElementPassword)).sendKeys(password);
    }

    @Then("i click log in")
    public void i_click_log_in() {
        driver.findElement(By.xpath(webElementLogIn)).click();
    }
    //scenario #18
    @Then("i click on about")
    public void i_click_on_about() {
        driver.findElement(By.xpath(webElementAbout)).click();
    }
    //scenario #19
    @Then("i click on Business")
    public void i_click_on_Business() {
        driver.findElement(By.xpath(webElementBusiness)).click();
    }
    //scenario #19
    @Then("i click personal")
    public void i_click_personal() {
        driver.findElement(By.xpath(webElementPersonal)).click();
    }
    //scenario #21
    @Then("i click on home1")
    public void i_click_on_home1(DataTable dataTable)throws InterruptedException {
        List<Map<String, String>> data2= dataTable.asMaps(String.class,String.class);
        // for(int index=0;index<data.size();index++) {
        for (Map<String, String> i:data2) {
            System.out.println(i);

            driver.findElement(By.xpath("//*[@id=\"alphaNumericInput16-input\"]")).sendKeys( i.get("zipCode"));
            Thread.sleep(2000);
            driver.findElement(By.xpath(webElementBack)).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(webElementCondo)).click();
        }
    }
    //scenario #22
    @Then("i send zip codes")
    public void i_send_zip_codes(DataTable dataTable)throws InterruptedException {
        List<Map<String, String>> data1= dataTable.asMaps(String.class,String.class);
            for(int ind=0;ind<data1.size();ind++) {
            driver.findElement(By.xpath(webElementZipCode2)).sendKeys(data1.get(ind).get("zipCode"));
            Thread.sleep(2000);
            driver.findElement(By.xpath(webElementBack)).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(webElementRenters)).click();
        }
    }
    //scenario #23
    @Then("i send zip codes too")
    public void i_send_zip_codes_too(io.cucumber.datatable.DataTable dataTable)throws InterruptedException {
        List<Map<String, String>> data2= dataTable.asMaps(String.class,String.class);
            // for(int index=0;index<data.size();index++) {
        for (Map<String, String> i:data2) {
            System.out.println(i);

            driver.findElement(By.xpath(webElementZipCode4)).sendKeys( i.get("zipCode"));
            Thread.sleep(2000);
            driver.findElement(By.xpath(webElementBack)).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(webElementCondo)).click();
        }
    }
    //scenario #24
    @Then("i click on file a claims")
    public void i_click_on_file_a_claims() {
        ((JavascriptExecutor)driver).executeScript("scroll(0,200)");
        driver.findElement(By.xpath(webElementFileClaims)).click();
    }
    @And("i verify file claims appears properly")
    public void i_verify_file_claims_appears_properly() {
        String expected="Let's begin filing your claim.";
        String actual= driver.findElement(By.xpath(webElementVerifyClaims)).getText();
        Assert.assertEquals(actual,expected);
    }
    //scenario #25
    @Then("i click on manage claims")
    public void i_click_on_manage_claims() {
        ((JavascriptExecutor)driver).executeScript("scroll(0,200)");
        driver.findElement(By.xpath(webElementManageClaims)).click();
    }
    @And("i verify manage claim appears properly")
    public void i_verify_manage_claim_appears_properly () {
        String expected="Log in";
        String actual= driver.findElement(By.xpath(webElementVerifyManageClaims)).getText();
        Assert.assertEquals(actual,expected);
    }
}

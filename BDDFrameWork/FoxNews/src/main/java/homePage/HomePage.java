package homePage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homePage.HomePageWebElements.*;
public class HomePage extends WebAPI {

    String ExpectedResult;

    @FindBy(how = How.XPATH, using = webElementClickLifeStyle)
    public WebElement clickButton;
    @FindBy(how = How.XPATH, using = webElementClickTV)
    public WebElement tv;
    @FindBy(how = How.XPATH, using = webElementVerify)
    public WebElement verify;
    @FindBy(how = How.XPATH, using = webElementSearchItem)
    public WebElement Item;

    @FindBy(how = How.XPATH, using = webElementClickMore)
    public WebElement more;
    @FindBy(how = How.CLASS_NAME, using = webElementSearchBox)
    public WebElement search;
    @FindBy(how = How.CLASS_NAME, using = webElementClickSearchButton)
    public WebElement Button;
    @FindBy(how = How.XPATH, using = webElementLogIn)
    public WebElement log;
    @FindBy(how = How.CLASS_NAME, using =webElementCreateAccount_Class)
    public WebElement account;
    @FindBy(how = How.XPATH, using = webElementEmail)
    public WebElement email;
    @FindBy(how = How.XPATH, using = webElementPassWord)
    public WebElement passWord;
    @FindBy(how = How.XPATH, using = webElementFirstName)
    public WebElement FN;
    @FindBy(how = How.XPATH, using = webElementLastName)
    public WebElement LN;
    //scenario #3
    @FindBy(how = How.XPATH,using = webElementAirPersonality)public WebElement personalities;
    @FindBy(how = How.XPATH,using = webElementVerifyWord)public WebElement word;
   //scenario #4
    @FindBy(how = How.XPATH,using = webElementViewSchedule)public WebElement viewSchedule;
    @FindBy(how = How.XPATH,using = webElementVerifySchedule)public WebElement schedule;
  //scenario # 5
   @FindBy(how = How.XPATH,using = webElementWatchLive)public WebElement watchLive;
    @FindBy(how = How.XPATH,using = webElementVerifyWatchLive)public WebElement live;
    //scenario # 6
    @FindBy(how = How.XPATH,using = webElementFullEpisode)public WebElement FullEpisode;
    @FindBy(how = How.XPATH,using = webElementVerifyFullEpisode)public WebElement episode;
    //scenario # 7
    @FindBy(how = How.XPATH,using = webElementFoodDrink)public WebElement FullDrink;
    @FindBy(how = How.XPATH,using = webElementVerifyFoodDrink)public WebElement verifyFood;
    //scenario # 8
    @FindBy(how = How.XPATH,using = webElementFlash)public WebElement Flash;
    @FindBy(how = How.XPATH,using = webElementVerifyFlash)public WebElement verifyFlash;
    //scenario # 9
    @FindBy(how = How.XPATH,using = webElementFoxNation)public WebElement FoxNation;
    @FindBy(how = How.XPATH,using = webElementVerifyFoxNation)public WebElement nation;
    //scenario # 10
    @FindBy(how = How.XPATH,using = webElementFoxRadio)public WebElement FoxRadio;
    @FindBy(how = How.XPATH,using = webElementVerifyRadio)public WebElement radio;
    //scenario # 11
    @FindBy(how = How.XPATH,using = webElementNewsClips)public WebElement newsClips;
    //scenario #12
    @FindBy(how = How.XPATH,using =webElementFoxBusiness )public WebElement FoxBusiness;
    @FindBy(how = How.XPATH,using =webElementVerifyFoxBusiness )public WebElement Business;











    public void clickSearchButton() {
        clickButton.click();
    }

    public void validate(String ExpectedResult) {
        String actualResult = Item.getText();
        Assert.assertEquals("Search Item not match", ExpectedResult, actualResult);
    }

    public void ClickTV() {
        tv.click();
    }

    public void validateTV(String ExpectedResult) {
        String actualResult = verify.getText();
        Assert.assertEquals("Search Item not match", ExpectedResult, actualResult);
    }

    public void ClickMore() {
        more.click();
    }

    public void SearchBox(String product) {
        search.click();
        search.sendKeys();
    }
//        public void validation(String product){
//            String actualResult = search.getText();
//
//            Assert.assertEquals("Search Item not match",ExpectedResult,actualResult);


    public void ClickButton() {
        Button.click();
    }


    public void ClickLogIn() {
   log.click();
    }
    public void ClickAccount(){
        account.click();

    }
    public void FileForm(){

    }
    //scenario #3
    public void clickAirPersonalities(){
        personalities.click();
    }
    public void validate1(String ExpectedResult){
        String actualResult = word.getText();
        Assert.assertEquals("Search Item not match", ExpectedResult, actualResult);
    }
    //scenario # 4
    public void clickViewSchedule(){
        viewSchedule.click();
    }
    public void validateSchedule(String ExpectedResult){
        String actualResult = schedule.getText();
        Assert.assertEquals("Search Item not match", ExpectedResult, actualResult);
    }
    //scenario # 5
    public void clickWatchLive(){
        watchLive.click();
    }
    public void validateWatchLive(String ExpectedResult){
        String actualResult = live.getText();
        Assert.assertEquals("Search Item not match", ExpectedResult, actualResult);
    }
    //scenario # 6
    public void scrollDown(){
        ((JavascriptExecutor)driver).executeScript("scroll(0,150000)");
    }
    public void clickFullEpisode(){
        FullEpisode.click();
    }
    public void validateEpisode(String ExpectedResult){
        String actualResult = episode.getText();
        Assert.assertEquals("Search Item not match", ExpectedResult, actualResult);
    }
    //scenario # 7
    public void clickFoodDrink(){
        FullDrink.click();
    }
    public void validateDrink(String ExpectedResult){
        String actualResult = verifyFood.getText();
        Assert.assertEquals("Search Item not match", ExpectedResult, actualResult);
    }
    //scenario # 8
    public void clickFlash(){
        Flash.click();
    }
    public void validateFlash(String ExpectedResult){
        String actualResult = verifyFlash.getText();
        Assert.assertEquals("Search Item not match", ExpectedResult, actualResult);
    }
    //scenario # 9
    public void clickFoxNation(){
        FoxNation.click();
    }
    public void validateFoxNation(String ExpectedResult){
        String actualResult = nation.getText();
        Assert.assertEquals("Search Item not match", ExpectedResult, actualResult);
    }
    //scenario # 10
    public void clickFoxRadio(){
        FoxRadio.click();
    }
    public void validateFoxRadio(String ExpectedResult){
        String actualResult = radio.getText();
        Assert.assertEquals("Search Item not match", ExpectedResult, actualResult);
    }
    //scenario # 11
    public void clickNewsClips(){
        newsClips.click();
    }
    //scenario # 12
    public void clickFoxBusiness(){
        FoxBusiness.click();
    }
    public void validateFoxBusiness(String ExpectedResult){
        String actualResult = Business.getText();
        Assert.assertEquals("Search Item not match", ExpectedResult, actualResult);
    }

}
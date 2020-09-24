package FindDoctorPage;
import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static FindDoctorPage.FindDoctorWebElement.*;

public class FindDoctor extends WebAPI {
    String ExpectedResult;

    @FindBy(how = How.XPATH, using = webElementFindDoctor)
    public WebElement findDoctor;
    @FindBy(how = How.XPATH, using = webElementVerifyFindDoctor)
    public WebElement verifyDoctor;
    @FindBy(how = How.XPATH, using = webElementFindDoctor2)
    public WebElement findDoctor2;
    @FindBy(how = How.XPATH, using = webElementUserName)
    public WebElement UN;
    @FindBy(how = How.XPATH, using = webElementPassWord)
    public WebElement PW;
    @FindBy(how = How.XPATH, using = webElementLogIn)
    public WebElement LI;
    //scenario #2
    @FindBy(how = How.XPATH, using = webElementLog)
    public WebElement Log;
    @FindBy(how = How.CSS, using = webElementRegister)
    public WebElement RG;
    @FindBy(how = How.XPATH, using = webElementMemberID)
    public WebElement memberID;
    @FindBy(how = How.XPATH, using = webElementFirstName)
    public WebElement firstName;
    @FindBy(how = How.XPATH, using = webElementLastName)
    public WebElement lastName;
    @FindBy(how = How.XPATH, using = webElementZipCode)
    public WebElement zipCode;
    @FindBy(how = How.XPATH, using = webElementContinue)
    public WebElement clickContinue;
    @FindBy(how = How.XPATH, using = webElementLogIn2)
    public WebElement logIn2;





    public void clickFindDoctor1(){
        findDoctor.click();
    }
    public void validateFindDoctor(String ExpectedResult){
        String actualResult=verifyDoctor.getText();
        Assert.assertEquals(actualResult,ExpectedResult);
    }
    public void submitFindDoctor(){
        findDoctor2.click();
    }
//    public void sendVariable() {
//        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys();
//        driver.findElement(By.xpath("//*[@id=\"password\"]"));
//    }
    public void logIn(){
        LI.click();
    }

    //scenario #2
    public void clickLogIn(){
        Log.click();
    }
    public void clickRegister(){
        RG.click();
    }
//    public void sendKeys2(String memberID, String MemberID, String FirstName, String LastName, String zipcode){
//        this.memberID.sendKeys(MemberID);
//        firstName.sendKeys(FirstName);
//        lastName.sendKeys(LastName);
//        zipCode.sendKeys(zipcode);
//    }
    public void clickContinue(){
        clickContinue.click();
    }

    public void logIn2(){
        logIn2.click();
    }

}

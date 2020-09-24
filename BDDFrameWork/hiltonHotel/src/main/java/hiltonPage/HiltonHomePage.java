package hiltonPage;

import common.WebAPI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static hiltonPage.HiltonHomePageWebElement.*;

public class HiltonHomePage extends WebAPI {

@FindBy(how = How.XPATH,using = webElementSignIn) public WebElement sign;

}

package to.tst.feeditback.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchForVenuePage extends BasePage {

    public SearchForVenuePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@data-test-id='fib-input']")
    private WebElement clickOntextboxEnterLocation;

    @FindBy(xpath = "//input[@data-test-id='fib-input']")
    private WebElement EnterLocationAsAddress;

    @FindBy(className = "find-venue__address")
    private WebElement clickOnTheVenue;

    public void clickOntextboxEnterLocation() {
        clickOntextboxEnterLocation.click();
    }
    public void EnterLocationAsAddress(String Address) {
        EnterLocationAsAddress.sendKeys(Address);
    }

    public WhenDidYouVisitPage clickOnTheVenue() {
        clickOnTheVenue.click();
        return new WhenDidYouVisitPage(driver);
    }
}

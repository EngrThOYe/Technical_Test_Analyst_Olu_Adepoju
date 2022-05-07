package to.tst.feeditback.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/main/div/div[1]/div[2]/div[2]/button/span[2]/span/span")
    private WebElement click_on_not_got_a_code;

        public SearchForVenuePage click_on_not_got_a_code()
    {
        click_on_not_got_a_code.click();
        return new SearchForVenuePage(driver);

    }

}

package to.tst.feeditback.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WhenDidYouVisitPage extends BasePage {

    public WhenDidYouVisitPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/div/div/div[1]/div[1]/div/div[2]/div[2]")
    private WebElement clickOnDayOfVisitAsToday;

    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/div/div/div[1]/div[2]/div[2]/label[1]/div/div/div[2]/i")
    private WebElement clickOnDropHourSelector;

    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/div/div/div[1]/div[2]/div[2]/label[1]/div/div/div[1]/div[1]")
    private WebElement selectactivehour;

    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/div/div/div[1]/div[2]/div[2]/label[2]/div/div/div[2]/i")
    private WebElement clickOnDropMinSelector;

    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/div/div/div[1]/div[2]/div[2]/label[2]/div/div/div[1]/div[1]/span")
    private WebElement selectactivemin;

    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/div/div/div[1]/div[2]/div[2]/label[3]/div/div/div[2]/i")
    private WebElement clickOnDropAmOrPmSelector;

    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/div/div/div[1]/div[2]/div[2]/label[3]/div/div/div[1]/div[1]/span")
    private WebElement selectactiveamorpm;

    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/div/button[2]/span[2]/span")
    private WebElement clickOnStartButton;



    public void clickOnDayOfVisitAsToday() {
        clickOnDayOfVisitAsToday.click();
    }
    public void clickOnDropHourSelector() {
        clickOnDropHourSelector.click();
    }
    public void selectactivehour() {
        selectactivehour.click();
    }
    public void clickOnDropMinSelector() {
        clickOnDropMinSelector.click();
    }
    public void selectactivemin() {
        selectactivemin.click();
    }
    public void clickOnDropAmOrPmSelector() {
        clickOnDropAmOrPmSelector.click();
    }
    public void selectactiveamorpm() {
        selectactiveamorpm.click();
    }
    public QuestionAndRatingPage clickOnStartButton() {
        clickOnStartButton.click();
        return new QuestionAndRatingPage(driver);
    }
}

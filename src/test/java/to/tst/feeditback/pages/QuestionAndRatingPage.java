package to.tst.feeditback.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class QuestionAndRatingPage extends BasePage {

    public QuestionAndRatingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/main/div[2]/div/div/main/div[1]/div/div[1]/div[2]/div/span[1]")
    private WebElement selectWorseFoodRatingAs;
    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/main/div[2]/div/div/main/div[1]/div/div[1]/div[2]/div/span[2]")
    private WebElement selectBadFoodRatingAs;
    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/main/div[2]/div/div/main/div[1]/div/div[1]/div[2]/div/span[3]")
    private WebElement selectNeutralFoodRatingAs;
    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/main/div[2]/div/div/main/div[1]/div/div[1]/div[2]/div/span[4]")
    private WebElement selectGoodFoodRatingAs;
    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/main/div[2]/div/div/main/div[1]/div/div[1]/div[2]/div/span[5]")
    private WebElement selectPerfectFoodRatingAs;
    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/main/div[2]/div/div/main/div[1]/div/div[2]/div[2]/div/span[2]")
    private WebElement selectWorseDrinkRatingAs;
    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/main/div[2]/div/div/main/div[1]/div/div[2]/div[2]/div/span[2]")
    private WebElement selectBadDrinkRatingAs;
    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/main/div[2]/div/div/main/div[1]/div/div[2]/div[2]/div/span[3]")
    private WebElement selectNeutralDrinkRatingAs;
    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/main/div[2]/div/div/main/div[1]/div/div[2]/div[2]/div/span[4]")
    private WebElement selectGoodDrinkRatingAs;
    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/main/div[2]/div/div/main/div[1]/div/div[2]/div[2]/div/span[5]")
    private WebElement selectPerfectDrinkRatingAs;
    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/main/div[2]/div/div/main/div[1]/div/div[2]/div[1]/div/div/div[2]")
    private WebElement selectNotapplicableDrinkRatingAs;


    private void selectWorseFoodRatingAs() {
        selectWorseFoodRatingAs.click();
    }

    private void selectBadFoodRatingAs() {
        selectBadFoodRatingAs.click();
    }

    private void selectNeutralFoodRatingAs() {
        selectNeutralFoodRatingAs.click();
    }

    private void selectGoodFoodRatingAs() {
        selectGoodFoodRatingAs.click();
    }

    private void selectPerfectFoodRatingAs() {
        selectPerfectFoodRatingAs.click();
    }

    public void selectFoodRatingAs(String Food_Rating) {
        if (Objects.equals(Food_Rating, "Worst")) {
            selectWorseFoodRatingAs();
        } else if (Objects.equals(Food_Rating, "Bad")) {
            selectBadFoodRatingAs();
        } else if (Objects.equals(Food_Rating, "Neutral")) {
            selectNeutralFoodRatingAs();
        } else if (Objects.equals(Food_Rating, "Good")) {
            selectGoodFoodRatingAs();
        } else if (Objects.equals(Food_Rating, "Perfect")) {
            selectPerfectFoodRatingAs();
        }
    }

    private void selectWorseDrinkRatingAs() {
        selectWorseDrinkRatingAs.click();
    }

    private void selectBadDrinkRatingAs() {
        selectBadDrinkRatingAs.click();
    }

    private void selectNeutralDrinkRatingAs() {
        selectNeutralDrinkRatingAs.click();
    }

    private void selectGoodDrinkRatingAs() {
        selectGoodDrinkRatingAs.click();
    }

    private void selectPerfectDrinkRatingAs() {
        selectPerfectDrinkRatingAs.click();
    }

    private void selectNotapplicableDrinkRatingAs() {
        selectNotapplicableDrinkRatingAs.click();
    }

    public void selectDrinkRatingAs(String Drink_Rating) {
        if (Objects.equals(Drink_Rating, "Not Applicable")) {
            selectNotapplicableDrinkRatingAs();
        } else if (Objects.equals(Drink_Rating, "Worst")) {
            selectWorseDrinkRatingAs();
        } else if (Objects.equals(Drink_Rating, "Bad")) {
            selectBadDrinkRatingAs();
        } else if (Objects.equals(Drink_Rating, "Neutral")) {
            selectNeutralDrinkRatingAs();
        } else if (Objects.equals(Drink_Rating, "Good")) {
            selectGoodDrinkRatingAs();
        } else if (Objects.equals(Drink_Rating, "Perfect")) {
            selectPerfectDrinkRatingAs();
        }
    }
}
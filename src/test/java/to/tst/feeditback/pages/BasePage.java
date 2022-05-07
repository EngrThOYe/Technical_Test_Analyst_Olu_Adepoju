package to.tst.feeditback.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import to.tst.feeditback.commons.DriverManager;

public class BasePage extends DriverManager
{
    public String BASE_URL = "https://tst.feeditback.to/tst-food-drink";
    public void NavigateToHomePage()
    {
        driver.navigate().to(BASE_URL);

    }
    private Select select;

    public void selectByText(WebElement element, String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByValue(WebElement element, String value)
    {
        select = new Select(element);
        select.selectByValue(value);
    }
    public void selectByIndex(WebElement element, int index)
    {
        select = new Select(element);
        select.selectByIndex(index);
    }
}

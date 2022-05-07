package to.tst.feeditback.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import to.tst.feeditback.commons.BrowserManager;

public class Hook extends BrowserManager {
    @Before
    public void setup() {
        launchBrowser("Chrome");
    }

    //@After
    public void tearDown() {
        closeBrowser();
    }
}

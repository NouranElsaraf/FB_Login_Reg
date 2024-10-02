package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By welcomeOnHomePage = By.cssSelector(".x193iq5w.xeuugli.x13faqbe.x1vvkbs.x1xmvt09.x1lliihq.x1s928wv.xhkezso.x1gmr53x.x1cpjm7i.x1fgarty.x1943h6x.x14z4hjw.x3x7a5m.xngnso2.x1qb5hxa.x1xlr1w8.xzsf02u");

    public String getWelcomeHomePage(){
        return getText(welcomeOnHomePage,3);
    }
}

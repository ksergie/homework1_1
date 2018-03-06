import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class DashboardPage {

    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    private By avatarIcon = By.className("employee_avatar_small");
    private By logoutLink = By.id("header_logout");

    public DashboardPage clickAvatarIcon(){
        new WebDriverWait(driver, 5).until(visibilityOfElementLocated(avatarIcon)).click();
        return this;
    }

    public void leavePage() {
        driver.findElement(logoutLink).click();
    }

}

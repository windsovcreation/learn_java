package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(ChromeDriver wd) {
        super (wd);
    }

    public void gotoGroupPage() {
      click (By.linkText("groups"));
    }

    public void gotoAddNewContactPage() {
        click (By.linkText("add new"));
    }

    public void returnToHomePage() {click (By.linkText("home"));}

}

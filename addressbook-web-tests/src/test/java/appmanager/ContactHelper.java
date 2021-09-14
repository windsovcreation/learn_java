package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import model.ContactData;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void selectFirstContact() {
        click(By.name("selected[]"));

}

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void initContactDeletion() {
        click (By.xpath("//input[@value='Delete']"));
    }

    public void initContactModification() {
        click (By.xpath("//img[@alt='Edit']"));
    }

    public void confirmDeletion() {
        wd.switchTo().alert().accept();
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getName());
        type(By.name("lastname"), contactData.getSurname());
        type(By.name("address"), contactData.getAddress());
        type(By.name("mobile"), contactData.getPhone());
        type(By.name("email"), contactData.getEmail());
        select(By.name("bday"), contactData.getBday());
        select(By.name("bmonth"), contactData.getBmonth());
        type(By.name("byear"), contactData.getByear());
        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

        }

    }




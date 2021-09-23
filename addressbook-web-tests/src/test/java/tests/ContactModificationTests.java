package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Vasya", "Pupkin", "Russia\nMoscow\nLubyanka 21",
                    "89267456789", "pupkin@mail.ru", "12", "November", "1980", "test1"), true);
            app.getNavigationHelper().returnToHomePage();
        }
        app.getContactHelper().initContactModification(0);
        app.getContactHelper().fillContactForm(new ContactData("Vasya", "Pupkin", "Russia\nMoscow\nLubyanka 21",
                "89267456789", "pupkin@mail.ru", "12", "November", "1980", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before);
    }
}

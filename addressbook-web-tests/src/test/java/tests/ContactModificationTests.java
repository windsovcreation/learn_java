package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {

        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Vasya", "Pupkin", "Russia\nMoscow\nLubyanka 21",
                "89267456789", "pupkin@mail.ru", "12", "November", "1980"));
        app.getNavigationHelper().returnToHomePage();
    }
}

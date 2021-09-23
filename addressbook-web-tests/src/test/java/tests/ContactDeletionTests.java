package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{

    @Test
    public void testContactDeletion() {
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAContact()) {
             app.getContactHelper().createContact(new ContactData("Vasya", "Pupkin", "Russia\nMoscow\nLubyanka 21",
                     "89267456789", "pupkin@mail.ru", "12", "November", "1980", "test1"), true);
            app.getNavigationHelper().returnToHomePage();
        }
        app.getContactHelper().selectContact(before - 1);
        app.getContactHelper().initContactDeletion();
        app.getContactHelper().confirmDeletion();
        app.getNavigationHelper().gotoGroupPage();
        app.getNavigationHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before - 1);

    }

}

package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactDeletionTests extends TestBase{

    @Test
    public void testContactDeletion() {

        if (! app.getContactHelper().isThereAContact()) {
             app.getContactHelper().createContact(new ContactData("Vasya", "Pupkin", "Russia\nMoscow\nLubyanka 21",
                     "89267456789", "pupkin@mail.ru", "12", "November", "1980", "test1"), true);
            app.getNavigationHelper().returnToHomePage();
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().initContactDeletion();
        app.getContactHelper().confirmDeletion();
        app.getNavigationHelper().gotoGroupPage();
        app.getNavigationHelper().returnToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);

    }

}

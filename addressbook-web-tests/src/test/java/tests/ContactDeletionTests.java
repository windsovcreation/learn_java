package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ContactDeletionTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (app.contact().list().size() == 0) {
            app.contact().create(new ContactData("Vasya", "Pupkin", "Russia\nMoscow\nLubyanka 21",
                    "89267456789", "pupkin@mail.ru", "12", "November", "1980", "test1"), true);
            app.goTo().homePage();
        }
    }

    @Test
    public void testContactDeletion() {

        List<ContactData> before = app.contact().list();
        int index = before.size() - 1;
        app.contact().delete(index);
        app.goTo().groupPage();
        app.goTo().homePage();
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size() - 1);
        before.remove(index);
        Assert.assertEquals(before, after);

    }

}

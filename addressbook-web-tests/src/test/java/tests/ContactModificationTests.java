package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (app.contact().list().size() == 0) {
            app.contact().create(new ContactData().withName("Vasya"), true);
            app.goTo().homePage();
        }
    }

    @Test
    public void testContactModification() {

        List<ContactData> before = app.contact().list();
        int index = before.size() - 1;
        ContactData contact = new ContactData()
                .withId(before.get(index).getId()).withName("Vasya").withSurname("Pupkin").withAddress("Russia\nMoscow\nLubyanka 21")
                .withPhone("89267456789").withEmail("pupkin@mail.ru").withGroup("test1");
        app.contact().modify(index, contact);
        app.goTo().homePage();
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size());


        before.remove(index);
        before.add(contact);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId()) ;
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }


}

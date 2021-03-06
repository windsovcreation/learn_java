package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() {
    List<ContactData> before = app.contact().list();
    ContactData contact = new ContactData("Vasya", "Pupkin", "Russia\nMoscow\nLubyanka 21",
            "89267456789", "pupkin@mail.ru", "12", "November", "1980", "test1");
    app.contact().create(contact, true);
    app.goTo().homePage();
    List<ContactData> after = app.contact().list();
    Assert.assertEquals(after.size(), before.size() + 1);


    contact.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId()) ;
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }

}

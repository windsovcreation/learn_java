package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import model.ContactData;
import java.util.List;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() {
    List<ContactData> before = app.getContactHelper().getContactList();
    ContactData contact = new ContactData("Vasya", "Pupkin", "Russia\nMoscow\nLubyanka 21",
            "89267456789", "pupkin@mail.ru", "12", "November", "1980", "test1");
    app.getContactHelper().createContact(contact, true);
    app.getNavigationHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() + 1);

    before.add(contact);
    Assert.assertEquals(after.size(), before.size());
  }


}

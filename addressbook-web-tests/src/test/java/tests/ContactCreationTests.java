package tests;

import org.testng.annotations.Test;
import model.ContactData;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() {

    app.getContactHelper().createContact(
            new ContactData("Vasya", "Pupkin", "Russia\nMoscow\nLubyanka 21",
                    "89267456789", "pupkin@mail.ru", "12", "November", "1980", "test1"), true);
    app.getNavigationHelper().returnToHomePage();

  }


}

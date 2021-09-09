package tests;

import org.testng.annotations.Test;
import model.ContactData;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {

    app.getNavigationHelper().gotoAddNewContactPage();
    app.getContactHelper().fillContactForm(
            new ContactData("Vasya", "Pupkin", "Russia\nMoscow\nLubyanka 21",
                    "89267456789", "pupkin@mail.ru", "12", "November", "1980"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToHomePage();

  }


}

package tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{

    @Test
    public void testContactDeletion() {

       app.getContactHelper().selectFirstContact();
       app.getContactHelper().initContactDeletion();
       app.getContactHelper().confirmDeletion();
       app.getNavigationHelper().returnToHomePage();

    }

}

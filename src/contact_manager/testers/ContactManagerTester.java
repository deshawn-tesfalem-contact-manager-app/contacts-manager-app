package contact_manager.testers;

import contact_manager.ContactManager;

public class ContactManagerTester {
    public static void main(String [] args){
        ContactManager cm = new ContactManager();

        //test if there are no contacts in the array
        cm.getContacts();
        //retrieves contacts from contact file
        cm.contactRetriever();
        //test if contacts were added
        cm.getContacts();

        //gets the index of given string contact name and returns it if
        //found otherwise it returns -1
        System.out.println(cm.getContactIndex("john"));
        System.out.println(cm.getContactIndex("samantha"));

        cm.findContacts("j");

    }

}

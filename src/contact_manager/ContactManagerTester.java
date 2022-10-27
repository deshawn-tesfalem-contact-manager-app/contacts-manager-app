package contact_manager;

public class ContactManagerTester {
    public static void main(String [] args){
        ContactManager cm = new ContactManager();

        //test if there are no contacts in the array
        cm.getContacts();
        //retrieves contacts from contact file
        cm.contactRetriever();
        //test if contacts were added
        cm.getContacts();

    }


}

package contact_manager;

public class ContactUserInteractionTester {
    public static void main(String[] args) {
        ContactUserInteraction.init();
//        ContactUserInteraction.help();
        ContactUserInteraction.viewContacts();
        ContactUserInteraction.addContact();
        ContactUserInteraction.viewContacts();
        ContactUserInteraction.searchContact();
        ContactUserInteraction.deleteContact();
        ContactUserInteraction.viewContacts();
    }
}

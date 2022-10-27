package contact_manager;

public abstract class ContactUserInteraction {
    private static final ContactManager cm = new ContactManager();

    private static void load(){
        cm.contactRetriever();
    }

    public static void init(){
        load();
    }


}

package contact_manager;

import java.util.Scanner;

public abstract class ContactUserInteraction {
    private static final ContactManager cm = new ContactManager();
    private static Scanner scan = new Scanner(System.in);
    private static void load(){
        cm.contactRetriever();
    }

    public static void init(){

        load();
        help();
    }
    public static void help() {
        System.out.println("1. View contacts");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
    }
    public static void viewContacts() {
        System.out.println("Name | Phone number");
        System.out.println("---------------------");
        cm.getContacts();
    }
    public static void addContact() {
        System.out.print("Enter a name:");
        String name = scan.nextLine();
        System.out.print("Enter a phone number:");
        String number = scan.nextLine();
        cm.addContact(name,number);
    }

    public static void searchContact() {
        System.out.print("Enter a name to search:");
        String name = scan.next();
        cm.findContacts(name);
    }

    public static void deleteContact() {
        System.out.print("Enter a name to delete:");
        String name = scan.next();
        cm.deleteContact(name);
    }


}

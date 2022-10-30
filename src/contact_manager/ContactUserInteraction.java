package contact_manager;

import java.util.Scanner;


public abstract class ContactUserInteraction {
    private static final ContactManager cm = new ContactManager();
    private static Scanner scan = new Scanner(System.in);
    public static void loadData(){
        cm.contactRetriever();
    }


    //initialize the user interaction
    public static void init(){
        help();
        System.out.print("Enter an option (1, 2, 3, 4, or 5): ");
        String userChoice = scan.nextLine();
        if(userChoice.equals("6")){
            saveContacts();
            System.exit(1);
        }else if(userChoice.equals("7")){
            System.exit(1);
        }
        else{
            switch (userChoice){
                case "1" -> viewContacts();
                case "2" -> addContact();
                case "3" -> searchContact();
                case "4" -> deleteContact();
                case "5" -> saveContacts();
            }
        }
        init();
    }
    //shows user options
    public static void help() {
        System.out.println("1. View contacts");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Save");
        System.out.println("6. Exit (Saves on exit)");
        System.out.println("7. Exit (No save)");
    }

    private static void seperate(){
        System.out.println("-------------------------");
    }
    //uses the ContactManagers viewContacts method
    //to output all contacts to the console
    public static void viewContacts() {
        System.out.println("Name | Phone number");
        seperate();
        cm.getContacts();
        seperate();
    }

    //takes the users input and uses them in the ContactMangers
    //addContact method so they can be made into the object and
    //added to the contacts array
    public static void addContact() {
        System.out.print("Enter a name:");
        String name = scan.nextLine();
        System.out.print("Enter a phone number:");
        String number = scan.nextLine();
        cm.addContact(name,number);
        seperate();

    }

    //takes user input and finds all contact whos name
    //contains the user input
    public static void searchContact() {
        System.out.print("Enter a name to search:");
        String name = scan.next();
        cm.findContacts(name);
        seperate();
    }

    //taking user input and using the deleteContact()
    //method in the contact manager to find it and remove
    //it from the contacts array by index
    public static void deleteContact() {
        System.out.print("Enter a name to delete:");
        String name = scan.next();
        cm.deleteContact(name);
        seperate();
    }

    private static void saveContacts(){
        cm.writeContacts();
    }


}

package contact_manager;

import java.util.ArrayList;

public class ContactTester {
    public static void main(String[] args) {
        Contact name1 = new Contact("John", "210-678-6539");
        Contact name2 = new Contact("frank", "210-678-6539");
        Contact name3 = new Contact("robert", "210-678-6539");
        Contact name4 = new Contact("amy", "210-678-6539");
        Contact name5 = new Contact("John", "210-908-909");
        Contact name6 = new Contact("John", "910-890-9089");
        Contact name7 = new Contact("John doe", "704-676-9979");

        System.out.println(name1.getName());
        System.out.println(name1.getNumber());
        System.out.println(name1.getInfo());

        System.out.println("Testing if name1 equals name2");
        System.out.println("name1 = " + name1.getName());
        System.out.println("name2 = " + name2.getName());

        if(name1.equals(name2)){
            System.out.println("names are equal");
        }else{
            System.out.println("names arent equal");
        }
        System.out.println("Changing them to the same name");

        name1.editName(name2.getName());

        System.out.println("Testing to see if equals works");
        if(name1.equals(name2)){
            System.out.println("names are equal");
        }else{
            System.out.println("names are still not equal");
        }


        String search = "robert";
        Boolean found = name3.equals(search);

        System.out.println("Found the search item equals: " + found);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(name1);
        contacts.add(name2);
        contacts.add(name3);
        contacts.add(name5);
        contacts.add(name6);
        contacts.add(name7);

        for (Contact contact : contacts) {
            if(contact.equals("FRANK")){
                System.out.println(contact.getInfo());
            }
        }

    }
}
// 1. View contacts.
//  2. Add a new contact.
//  3. Search a contact by name.
//  4. Delete an existing contact.
//    5. exit.
//   Enter an option (1, 2, 3, 4 or 5):

//Name | Phone number
//        ---------------
//        Jack Blank | 1231231234
//        Jane Doe | 2342342345
//        Sam Space | 3453453456

//    Load all of the contacts by calling a method that returns a List of Contact objects.
//    Call a method that shows the user the main menu and returns their choice of action.
//    Using the user's choice from the previous step, call a method that performs that action (modifying the contents of the List of Contact objects if applicable).
//    Keep calling the method from step two until the user chooses to exit.
//    Once the user chooses to exit, re-write the contents of the contacts.txt file using the List of Contact objects.
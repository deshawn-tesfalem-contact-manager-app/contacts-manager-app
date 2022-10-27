package contact_manager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    private final ArrayList<Contact> contacts = new ArrayList<>();
    private static final File contactsFile = new File("Contacts.ct");

    public void getContacts(){
        for (Contact contact : contacts) {
            System.out.println(contact.getInfo());
        }
    }

    public void contactRetriever(){
        try {
            // reading from the contactFile if it exist
            if (contactsFile.exists()){
                Scanner read = new Scanner(contactsFile);
                read.useDelimiter(",");

                while (read.hasNext()){
                    //taking the contact file delimited strings and
                    //turning them into contact objects.
                    String name = read.next();
                    String number = read.next();
                    Contact contact = new Contact(name, number);
                    //adding the contact to the static contact array
                    contacts.add(contact);
                }
                read.close();

            } else {
                //if it doesn't exist create the new file
                contactsFile.createNewFile();
            }

        } catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}

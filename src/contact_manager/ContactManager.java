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
    public int getContactIndex(String contactName){
        for(int indexOfContact = 0; indexOfContact < contacts.size(); indexOfContact++){
            if(contacts.get(indexOfContact).getName().equalsIgnoreCase(contactName)){
                return indexOfContact;
            }
        }
        return -1;
    }
    public void contactRetriever(){
        try {
            // reading from the contactFile if it exist
            if (contactsFile.exists()){
                Scanner read = new Scanner(contactsFile);
                read.useDelimiter(", ");

                while (read.hasNextLine()){
                    //taking the contact file delimited strings and
                    //turning them into contact objects

                    String[] contactInfo = read.nextLine().split(",");
                    String name = contactInfo[0];
                    String number = contactInfo[1];

                    Contact contact = new Contact(name, number);
                    //adding the contact to the static contact array
                    contacts.add(contact);
                }
                read.close();

            } else {
                //if it doesn't exist create the new file
                boolean fileCreated = contactsFile.createNewFile();
                if(fileCreated){
                    System.out.println("New Contact.ct file created");
                }else{
                    System.out.println("Contact.ct could not be created");
                }
            }

        } catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    public void addContact(){}

    //takes contact info makes an object and adds it to the contact array
    public void addContact(String name, String number){
        Contact contact = new Contact(name, number);
        contacts.add(contact);
    }
    public void deleteContact(){}
//    public void deleteContact(String contactName){
//       if{
//
//       }
//    }
}

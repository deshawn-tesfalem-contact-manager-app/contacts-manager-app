package contact_manager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {

    private final ArrayList<Contact> contacts = new ArrayList<>();
    private static final File contactsFile = new File("Contacts.ct");


    //function shows all the contacts in the given contacts array
    //by accessing the contact.getinfo() method on each item as
    //it iterates throught the items
    public void getContacts(){
        for (Contact contact : contacts) {
            System.out.println(contact.getInfo());
        }
    }

    //iterates through the contact array and if it finds the contact name returns the index to be modified
    //or deleted by the user. it returns -1 if no contact with the specified name iw found regardless fo case.
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
            // reading from the contactFile if it exists
            if (contactsFile.exists()){

                Scanner read = new Scanner(contactsFile);
                read.useDelimiter(", ");
                while (read.hasNextLine()){
                    //taking the contact file delimited strings and
                    //turning them into contact objects
                    String currentLine = read.nextLine();

                    //fixed delimiter error on blank lines by ignoring blank lines
                    //in totality
                    if(!currentLine.isBlank()){

                        String[] contactInfo = currentLine.split(",");

                        String name = contactInfo[0];
                        String number = contactInfo[1];


                        Contact contact = new Contact(name, number);

                        //adding the contact to the static contact array
                        contacts.add(contact);
                    }

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
    public void deleteContact(String contactName){
        int conttactIndex = getContactIndex(contactName);
       if(conttactIndex != -1){
           contacts.remove(conttactIndex);
       }
    }
    public void writeContacts(){
        String allContacts = new String();

        try{
            FileWriter fr = new FileWriter("Contacts.ct", false);
            for(Contact contact: contacts){
                String nameAndNumber = String.format("%s,%s\n",
                        contact.getName(), contact.getNumber());
                allContacts += nameAndNumber;
            }
            fr.write(allContacts);
            fr.close();

        }catch(IOException ioException){
            ioException.printStackTrace();
        }

    }

}

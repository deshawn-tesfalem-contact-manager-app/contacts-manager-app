package contact_manager.testers;

import contact_manager.Contact;

public class ContactTester {
    public static void main(String[] args) {
        Contact name1 = new Contact("John", "210-678-6539");
        Contact name2 = new Contact("frank", "210-678-6539");
        Contact name3 = new Contact("robert", "210-678-6539");
        Contact name4 = new Contact("amy", "210-678-6539");

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

    }
}

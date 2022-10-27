package contact_manager;

public class Contact {

    private String name;
    private String number;

    Contact(){
        this.name = "default";
        this.number = "xxx-xxx-xxxx";
    }
    Contact(String name, String number){
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public void editName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void editNumber(String number) {
        this.number = number;
    }
    public String getInfo(){
        return (String.format("%s | %s", name, number));
    }

    @Override
    public boolean equals(Object o) {

        if (o == this)
            return true;

        /* Checks if the Object passed to the equals() method
        * is an instance of the Contact method and if its not it returns
        * false unless its a string then it compares the Contact.name to the string*/
        if (!(o instanceof Contact)){
           if(o instanceof  String){
               return this.name.toLowerCase().contains(
                       (String) ((String) o).toLowerCase());
           }
           return false;
        }

        Contact other = (Contact) o;

        /*Compares the names of two contact objects and returns true if they are the same*/
        return (this.name == null && other.name == null)
                || (this.name != null && this.name.equals(other.name)
                && this.number.equals(other.number));
    }
}

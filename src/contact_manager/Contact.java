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
        return (String.format("%s, %s", name, number));
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contact other))
            return false;
        //        boolean storeEquals = (this.number == null && other.number == null)
//                || (this.number != null && this.number.equals(other.number));
        return (this.name == null && other.name == null)
                || (this.name != null && this.name.equals(other.name));
    }
}

package contact_manager;

public class Contact {

    private String name;
    private String number;

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
}

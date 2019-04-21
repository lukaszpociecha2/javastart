package excercises.ecnapsulation;

public class Client {

    private String firstName;
    private String lastName;
    private boolean isPremium;

    public Client(String firstName, String lastName, boolean isPremium) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isPremium = isPremium;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}

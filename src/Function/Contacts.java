package Function;

public class Contacts {
    private String firstName;
    private String lastName;
    private long mobNo;

    Contacts() {
    }

    Contacts(String firstName, String lastName, long mobNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobNo = mobNo;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getMobNo() {
        return this.mobNo;
    }

    public void setMobNo(long mobNo) {
        this.mobNo = mobNo;
    }
}

public class Contats {
    int mobileNo;
    String name, lastName, address;

    public Contats(int mob, String nm, String lm, String add) {
        name = nm;
        lastName = lm;
        mobileNo = mob;
        address = add;
    }

    public void display() {
        System.out.println("Name: " + name + "\nLast Name: " + lastName + "\nAddress: " + address + "\nMobil No.: " + mobileNo);
    }
}

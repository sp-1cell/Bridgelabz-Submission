import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number Of Contacts: ");
        int count = input.nextInt();
        Contats[] contats = new Contats[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Contact No.: " + i + 1);
            contats[i] = new Contats(i, "Name " + i, "LastName " + i, "Address " + i);
            contats[i].display();
        }
    }
}

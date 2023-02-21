import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    int numberOfContact;


    ArrayList<Contacts> arrContact = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Enter Contact you want to save :");
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        addressBook.numberOfContact = sc.nextInt();
        addressBook.addContact();
        addressBook.editContact();
        addressBook.deleteContact();
        addressBook.printInfo();


    }

    private void addContact() {
        for (int i = 0; i < numberOfContact; i++) {
            Contacts contacts = new Contacts();
            System.out.println("Enter person " + (i + 1) + " First name ");
            contacts.firstName = sc.next().toUpperCase();
            System.out.println("Enter person " + (i + 1) + " Last name ");
            contacts.lastName = sc.next().toUpperCase();
            System.out.println("Enter person " + (i + 1) + " Mobile number ");
            contacts.mobNo = sc.nextLong();
            arrContact.add(contacts);

        }

    }

    private void printInfo() {
        System.out.println("Contact Details:");
        for (Contacts info : arrContact) {
            System.out.println("First Name : " + info.firstName + ": Last Name : " + info.lastName + ": Mobile number: " + info.mobNo);
        }

    }

    private void editContact() {
        System.out.println("Enter which data you want  change: ");
        System.out.println("1.First name\n 2. Last name:\n 3. mobile number 4.exit");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter first name:");
                String nameForChange = sc.next().toUpperCase();
                for (int i = 0; i < numberOfContact; i++) {
                    if (nameForChange.equalsIgnoreCase(arrContact.get(i).firstName)) {
                        System.out.println("enter the name to update :");
                        arrContact.get(i).firstName = sc.next().toUpperCase();
                        System.out.println("update successfully...");
                    }
                }
                break;
            case 2:
                System.out.println("Enter Last name");
                String name = sc.next().toUpperCase();
                for (int i = 0; i < numberOfContact; i++) {
                    if (name.equalsIgnoreCase(arrContact.get(i).lastName)) {
                        System.out.println("enter the name to update :");
                        arrContact.get(i).lastName = sc.next().toUpperCase();
                        System.out.println("update successfully...");
                    }
                }
                break;
            case 3:
                break;

            default:
                System.out.println("Invalid input ...");
                editContact();
                break;

        }

    }

    private void deleteContact() {
        System.out.println("you want to delete any name : 1.y 2.n ");

        int y = sc.nextInt();
        switch (y) {
            case 1:
                System.out.println("enter which contact you want to delete :");
                String delete = sc.next().toUpperCase();
                for (int i = 0; i < arrContact.size(); i++) {
                    if (delete.equalsIgnoreCase(arrContact.get(i).firstName)) {
                        arrContact.remove(i);
                    }

                }
                System.out.println("Deleted .....");
                break;
            default:
                System.out.println("Thank u");
                break;

        }
    }
}

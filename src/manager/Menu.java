package manager;

import staff.FullTimeStaff;
import staff.Staff;

import java.util.Scanner;

public class Menu extends StaffManager {
    static Scanner sc = new Scanner(System.in);

    /////METHODS:
    public void run() {

        printMenu();
        int choice = sc.nextInt();
        while (choice != 3) {
            runMenu(choice);
            printMenu();
            choice = sc.nextInt();
        }

    }

    public void printMenu() {
        System.out.println(
                " ----------manager.Menu---------"
                        + "\n| --1.Add staff---------|"
                        + "\n| --2.Show staffs list--|"
                        + "\n| --3.Manage staff------|"
                        + "\n| --4.exit--------------|"
                        + "\n|_______________________|"
                        + "\n| Enter your choice: "
        );
    }

    public void runMenu(int choice) {
        final String ADD_STAFF_MENU = "\n ---------Add staff--------"
                + "\n| --1.Add fulltime staff---"
                + "\n| --2.Add parttime staff---"
                + "\n| --3.exit-----------------"
                + "\n|__________________________"
                + "\n| Enter your choice: ";

        switch (choice) {
            case 1:
                System.out.println(ADD_STAFF_MENU);
                int choice1 = sc.nextInt();
                boolean isContinue = choice1 != 3;
                while (isContinue) {
                    addStaff(choice1);                 //ADD STAFF
                    System.out.println(ADD_STAFF_MENU);
                    choice1 = sc.nextInt();
                    isContinue = choice1 != 3;
                }
            case 2:

            default:
        }
    }

    public void addStaff(int choice) {
        switch (choice) {
            case 1:
                System.out.println("full time");
                Staff staff = new FullTimeStaff();
                inputStaffData(staff);
                System.out.println(staff.toString());
                break;
            case 2:
                clearConsole();
                break;
        }
    }

    public void inputStaffData(Staff staff) {
        System.out.println("enter ID: ");
        int id = sc.nextInt();
        staff.setStaffId(id);

        sc.nextLine();
        System.out.println("enter name: ");
        String name = sc.nextLine();
        staff.setName(name);

        System.out.println("enter age: ");
        int age = sc.nextInt();
        staff.setAge(age);

        System.out.println("enter phone number: ");
        int phoneNumber = sc.nextInt();
        staff.setPhoneNumber(phoneNumber);

        sc.nextLine();
        System.out.print("enter Email: ");
        String email = sc.nextLine();
        staff.setEmail(email);
    }

    public void clearConsole() {
        System.out.println("\f");
    }
}

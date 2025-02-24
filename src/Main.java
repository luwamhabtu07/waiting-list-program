import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WaitingListManager manager = new WaitingListManager();

        while (true) {
            System.out.println("\n=== Waiting List Menu ===");
            System.out.println("1. Add a person");
            System.out.println("2. Serve a person");
            System.out.println("3. Check if a person is in the waiting list");
            System.out.println("4. Display waiting list");
            System.out.println("5. Get waiting list size");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    manager.addPerson(name);
                    break;

                case 2:
                    System.out.println(manager.servePerson());
                    break;

                case 3:
                    System.out.print("Enter name to check: ");
                    String checkName = scanner.nextLine();
                    if (manager.isPersonInList(checkName)) {
                        System.out.println(checkName + " is in the waiting list.");
                    } else {
                        System.out.println(checkName + " is not in the waiting list.");
                    }
                    break;

                case 4:
                    manager.displayWaitingList();
                    break;

                case 5:
                    System.out.println("Number of people in waiting list: " + manager.waitingListSize());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Please choose a valid menu option.");
            }
        }
    }
}

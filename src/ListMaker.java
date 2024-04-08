import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {
    private static final ArrayList<String> list = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char choice;
        do {
            System.out.println("Current List: " + list);
            System.out.println("A - Add an item to the list");
            System.out.println("D - Delete an item from the list");
            System.out.println("P - Print the list");
            System.out.println("Q - Quit");
            choice = getRegExString("Choose an option: ", "[AaDdPpQq]").charAt(0);

            switch (Character.toUpperCase(choice)) {
                case 'A':
                    addItem();
                    break;
                case 'D':
                    deleteItem();
                    break;
                case 'P':
                    printList();
                    break;
                case 'Q':
                    if (getYNConfirm("Are you sure you want to quit?")) {
                        System.out.println("Quitting program.");
                        return; // Exit the main method directly, ending the program
                    }
                    // No need for else; if the user chooses not to quit, just continue the loop
                    break;
            }
        } while (Character.toUpperCase(choice) != 'Q');
    }

    private static String getRegExString(String prompt, String pattern) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        while (!input.matches(pattern)) {
            System.out.println("Invalid input. Please try again.");
            System.out.print(prompt);
            input = scanner.nextLine();
        }
        return input;
    }

    private static boolean getYNConfirm(String message) {
        //  Using SafeInput.getYNConfirm
        return false;
    }

    private static void addItem() {
        // Add item
    }

    private static void deleteItem() {
        // Delete item
    }

    private static void printList() {
        // Print list
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}
package Practice2_2.View;

import Practice2_2.Model.Book;

import java.util.Scanner;

public class Menu
{
    private int choice;

    public int getChoice()
    {
        return choice;
    }

    private String menuEntries = "1. Get the books of certain author\n" +
        "2. Get the books of certain publisher\n" +
        "3. Get the books after certain year\n" +
        "4. Sort the books by publisher\n" +
        "5. Get the books from the file\n" +
        "6. Write the books into the file\n" +
        "0. Exit the program";

    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to proceed.");
        scanner.nextLine();
        showMenu();

        if (scanner.hasNextInt())
            choice = scanner.nextInt();
        else
            choice = 12523;
    }

    private void showMenu()
    {
        System.out.println(menuEntries);
    }

    public void showRequested(Book[] requested)
    {
        for (Book i : requested)
        {
            System.out.println(i.toString());
        }
    }
}

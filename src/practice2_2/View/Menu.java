package practice2_2.View;

import practice2_2.Model.Book;

import java.util.Scanner;

public class Menu
{
    private int choice;

    public int getChoice()
    {
        return choice;
    }

    String[] menuEntries = new String[] {"1. Get the books of certain author",
            "2. Get the books of certain publisher",
            "3. Get the books after certain year",
            "4. Sort the books by publisher",
            "0. Exit the program"};

    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to proceed.");
        scanner.nextLine();
        showMenu();
        choice = scanner.nextInt();
    }

    private void showMenu()
    {
        for (String i : menuEntries)
        {
            System.out.println(i);
        }
    }

    public void showRequested(Book[] requested)
    {
        for (Book i : requested)
        {
            System.out.println(i.toString());
        }
    }
}

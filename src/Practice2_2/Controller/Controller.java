package Practice2_2.Controller;

import Practice2_2.Model.Book;
import Practice2_2.Model.DataHandler;
import Practice2_2.View.Menu;

import java.util.Scanner;

public class Controller
{
    public static void run(DataHandler handle, Menu menu)
    {
        Scanner scanner = new Scanner(System.in);
        Book[] requested = new Book[] {};

        while (true)
        {
            menu.run();
            int choice = menu.getChoice();
            switch (choice)
            {
                case 1:
                {
                    System.out.println("Enter author's name.");
                    String author = scanner.nextLine();
                    requested = handle.getAuthorBooks(author, handle.getBooks());
                    break;
                }
                case 2:
                {
                    System.out.println("Enter publisher's name.");
                    String publisher = scanner.nextLine();
                    requested = handle.getPublisherBooks(publisher, handle.getBooks());
                    break;
                }
                case 3:
                {
                    System.out.println("Enter year.");
                    int year = scanner.nextInt();
                    requested = handle.getYearBooks(year, handle.getBooks());
                    break;
                }
                case 4:
                {
                    handle.sortByPublisher(handle.getBooks());
                    requested = handle.getBooks();
                    break;
                }
                case 0:
                {
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Wrong input, try again, please.");
                }
            }
            menu.showRequested(requested);
        }
    }
}

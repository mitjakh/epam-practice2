package Practice2_2.Controller;

import Practice2_2.Model.Book;
import Practice2_2.Model.DataHandler;
import Practice2_2.Model.FileHandler;
import Practice2_2.View.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Controller
{
    public static void run(DataHandler handle, Menu menu) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        Book[] requested = new Book[]{};
        boolean ifSave = false;

        while (true)
        {
            menu.run();
            int choice = menu.getChoice();
//            handle.initializeBooks(handle.defaultBooks);
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
                case 5:
                {
                    System.out.println("Enter full file location: ");
                    if(handle.loadFromFile(scanner.nextLine()))
                        System.out.println("Books initialized successfully.");
                    else
                        System.out.println("Error while initializing books. Try again.");
                    break;
                }
                case 6:
                {
                    System.out.println("Do you need to save results to file? Y - yes, N - no, L - to change preferred file location.");
                    String userChoice = scanner.nextLine();
                    if (userChoice.equals("Y"))
                    {
                        ifSave = true;
                        System.out.println("Enter preferred file location: ");
                        handle.fileLocation = scanner.nextLine();
                    }
                    else if (userChoice.equals("L"))
                    {
                        System.out.println("Enter new preferred file location: ");
                        handle.fileLocation = scanner.nextLine();
                    }
                    else if (userChoice.equals("N"))
                    {
                        ifSave = false;
                    }
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

            if (ifSave && requested.length > 0)
            {
                if (handle.saveToFile(requested))
                   System.out.println("Books saved successfully.");
                else
                    System.out.println("An error occurred while saving books.");
            }
            menu.showRequested(requested);

        }
    }
}

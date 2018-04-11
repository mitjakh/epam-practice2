package Practice2_2.Model;

import Practice2_2.BookComparators.PublisherComparator;
import Practice2_2.BookComparators.YearComparator;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DataHandler
{
    public static Book[] defaultBooks = new Book[]{new Book("Анна Каренина", "Толстой", "Русский вестник", 1975, 554, 350),
            new Book("Война и мир", "Толстой", "Русский вестник", 1965, 2041, 800),
            new Book("1984", "Оруэлл", "Secker and Warburg", 1949, 357, 250),
            new Book("Скотный двор", "Оруэлл", "АСТ", 2006, 120, 200),
            new Book("451 градус по Фаренгейту", "Брэдбери", "Домино", 2011, 238, 200),
            new Book("Уцелевший", "Паланик", "АСТ", 2015, 315, 400),
            new Book("Бойцовский клуб", "Паланик", "АСТ", 2015, 386, 450),
            new Book("Мертвые души", "Гоголь", "Русский вестник", 1948, 554, 800),
            new Book("Ревизор", "Гоголь", "Домино", 2009, 234, 400)};

    private Book[] books = new Book[]{};

    public String fileLocation;

    public Book[] getBooks()
    {
        return books;
    }

    public void initializeBooks(Book[] books)
    {
        this.books = books;
    }

    public Book[] getAuthorBooks(String authorName, Book books[])
    {
        int i = 0, amount = 0;
        for(Book j : books)
        {
            if(j.getAuthorName().equals(authorName))
            {
                amount++;
            }
        }

        Book[] result = new Book[amount];

        for(Book j : books)
        {
            if(j.getAuthorName().equals(authorName))
            {
                result[i++] = j;
            }
        }

        return result;
    }

    public Book[] getPublisherBooks(String publisher, Book books[])
    {
        int i = 0, amount = 0;
        for(Book j : books)
        {
            if(j.getPublisher().equals(publisher))
            {
                amount++;
            }
        }

        Book[] result = new Book[amount];

        for(Book j : books)
        {
            if(j.getPublisher().equals(publisher))
            {
                result[i++] = j;
            }
        }

        return result;
    }

    public Book[] getYearBooks(int publishingYear, Book books[])
    {
        int i = 0, amount = 0;
        for(Book j : books)
        {
            if(j.getPublishingYear() > publishingYear)
            {
                amount++;
            }
        }

        Book[] result = new Book[amount];

        for(Book j : books)
        {
            if(j.getPublishingYear() > publishingYear)
            {
                result[i++] = j;
            }
        }

        Arrays.sort(result, new YearComparator());

        return result;
    }

    public void sortByPublisher (Book books[])
    {
        Arrays.sort(books, new PublisherComparator());
    }

    public boolean loadFromFile(String fileLocation) throws IOException
    {
        try
        {
            FileReader fileReader = new FileReader(fileLocation);
            Scanner scanner = new Scanner(fileReader);
            List<Book> bookList = new ArrayList<Book>();
            int counterOverall = 0;
            int counterSuccess = 0;

            while (scanner.hasNextLine())
            {
                String read = scanner.nextLine();
                counterOverall++;
                String[] buffer = read.split(";");
                String[] stringBuffer = new String[3];
                int[] intBuffer = new int[3];

                if (buffer.length >= 6)
                {
                    for (int i = 0; i < 3; i++)
                    {
                        stringBuffer[i] = buffer[i];
                        intBuffer[i] = Integer.parseInt(buffer[i+3]);
                    }
                    bookList.add(new Book(stringBuffer[0], stringBuffer[1], stringBuffer[2], intBuffer[0], intBuffer[1], intBuffer[2]));
                    counterSuccess++;
                }
            }

            Book[] books = bookList.toArray(new Book[bookList.size()]);

            this.books = books;

            System.out.println("Success: " + counterSuccess + ". Error: " + (counterOverall - counterSuccess) + ". Overall: " + counterOverall +
                    " Success rate: " + (counterSuccess * 100 / counterOverall) + "%.");
            return true;
        }
        catch(IOException e)
        {
            return false;
        }
    }

    public boolean saveToFile(Book[] books) throws IOException
    {
        try
        {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileLocation));
            for (Book i : books)
            {
                bufferedWriter.write(i.toString());
                bufferedWriter.write(System.getProperty("line.separator"));
            }
            bufferedWriter.close();
            return true;
        }
        catch (IOException e)
        {
            return false;
        }
    }
}

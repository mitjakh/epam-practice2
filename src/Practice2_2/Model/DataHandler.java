package Practice2_2.Model;

import Practice2_2.BookComparators.PublisherComparator;
import Practice2_2.BookComparators.YearComparator;

import java.util.Arrays;

public class DataHandler
{
    private Book[] books = new Book[]{new Book("Анна Каренина", "Толстой", "Русский вестник", 1975, 554, 350),
            new Book("Война и мир", "Толстой", "Русский вестник", 1965, 2041, 800),
            new Book("1984", "Оруэлл", "Secker and Warburg", 1949, 357, 250),
            new Book("Скотный двор", "Оруэлл", "АСТ", 2006, 120, 200),
            new Book("451 градус по Фаренгейту", "Брэдбери", "Домино", 2011, 238, 200),
            new Book("Уцелевший", "Паланик", "АСТ", 2015, 315, 400),
            new Book("Бойцовский клуб", "Паланик", "АСТ", 2015, 386, 450),
            new Book("Мертвые души", "Гоголь", "Русский вестник", 1948, 554, 800),
            new Book("Ревизор", "Гоголь", "Домино", 2009, 234, 400)};

    public Book[] getBooks()
    {
        return books;
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
}

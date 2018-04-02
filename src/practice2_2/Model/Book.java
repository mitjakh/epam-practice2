package practice2_2.Model;

public class Book
{
    private String bookName;
    private String authorName;
    private String publisher;
    private int publishingYear;
    private int pagesNumber;
    private int price;

    Book()
    {
        System.out.println("Invalid book data.");
    }

    Book (String bookName, String authorName, String publisher, int publishingYear, int pagesNumber, int price)
    {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.pagesNumber = pagesNumber;
        this.price = price;
    }

//    set and get bookName

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public String getBookName()
    {
        return bookName;
    }

//    set and get authorName

    public void setAuthorName(String authorName)
    {
        this.authorName = authorName;
    }

    public String getAuthorName()
    {
        return authorName;
    }

    //    set and get publisher

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String getPublisher()
    {
        return publisher;
    }

//    set and get publishingYear

    public void setPublishingYear(int publishingYear)
    {
        this.publishingYear = publishingYear;
    }

    public int getPublishingYear()
    {
        return publishingYear;
    }

//    set and get pagesNumber


    public void setPagesNumber(int pagesNumber)
    {
        this.pagesNumber = pagesNumber;
    }

    public int getPagesNumber()
    {
        return pagesNumber;
    }

//    set and get price


    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return getBookName() + " | " + getAuthorName() + " | " + getPublisher() + " | " +
                getPublishingYear() + " | " + getPagesNumber() + " | " + getPrice();
    }
}

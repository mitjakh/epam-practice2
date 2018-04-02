package practice2_2.BookComparators;

import practice2_2.Model.Book;

import java.util.Comparator;

public class YearComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        return ((Book)o1).getPublishingYear() - ((Book)o2).getPublishingYear();
    }
}

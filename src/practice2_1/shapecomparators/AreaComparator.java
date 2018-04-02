package practice2_1.shapecomparators;

import practice2_1.Shape;

import java.util.Comparator;

public class AreaComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        return (int)(((Shape)o1).calcArea() - ((Shape)o2).calcArea());
    }
}

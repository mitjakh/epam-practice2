package Practice2_1.ShapeComparators;

import Practice2_1.Entities.Shape;

import java.util.Comparator;

public class AreaComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        return (int)(((Shape)o1).calcArea() - ((Shape)o2).calcArea());
    }
}

package Practice2_1.ShapeComparators;

import Practice2_1.Entities.Shape;

import java.util.Comparator;

public class ColorComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        return ((Shape)o1).getShapeColor().compareTo(((Shape)o2).getShapeColor());
    }
}

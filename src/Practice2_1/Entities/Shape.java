package Practice2_1.Entities;

public abstract class Shape implements Drawable
{
    protected String shapeColor;

    public String getShapeColor()
    {
        return shapeColor;
    }

    @Override
    public void draw()
    {

    }

    public abstract double calcArea();

    @Override
    public String toString()
    {
        return super.toString();
    }
}

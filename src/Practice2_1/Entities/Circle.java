package Practice2_1.Entities;

public class Circle extends Shape
{
    private int diameter;
    private final double Pi = 3.14;

    public Circle (int diameter, String shapeColor)
    {
        this.diameter = diameter;
        this.shapeColor = shapeColor;
    }

    public Circle()
    {
        System.out.println("Invalid circle, no parameters.");
    }

    @Override
    public double calcArea()
    {
        return Pi * (diameter/2) * (diameter/2);
    }

    @Override
    public String toString()
    {
        String info = shapeColor + " circle with a diameter of " + diameter;
        return info;
    }
}

package practice2_1;

public class Circle extends Shape
{
    private int diameter;
    private final double Pi = 3.14;

    Circle (int diameter, String shapeColor)
    {
        this.diameter = diameter;
        this.shapeColor = shapeColor;
    }

    Circle()
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

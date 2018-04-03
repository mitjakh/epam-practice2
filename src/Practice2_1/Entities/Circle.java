package Practice2_1.Entities;

import java.lang.Math;

public class Circle extends Shape
{
    private int diameter;

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
        return Math.PI * diameter * diameter / 4;
    }

    @Override
    public String toString()
    {
        String info = shapeColor + " circle with a diameter of " + diameter;
        return info;
    }
}

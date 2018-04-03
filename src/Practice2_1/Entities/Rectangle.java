package Practice2_1.Entities;

public class Rectangle extends Shape
{
    private int sideA, sideB;

    public Rectangle(int sideA, int sideB, String shapeColor)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.shapeColor = shapeColor;
    }

    public Rectangle()
    {
        System.out.println("Invalid rectangle, no parameters.");
    }

    @Override
    public double calcArea()
    {
        return sideA * sideB;
    }

    @Override
    public String toString()
    {
        String info = shapeColor + " rectangle where A equals "+ sideA + " and B equals " + sideB;
        return info;
    }
}

package practice2_1;

public class Triangle extends Shape
{
    private int base, height;

    Triangle(int base, int height, String shapeColor)
    {
        this.base = base;
        this.height = height;
        this.shapeColor = shapeColor;
    }

    Triangle()
    {
        System.out.println("Invalid triangle, no parameters.");
    }

    @Override
    public double calcArea()
    {
        return base * height / 2;
    }

    @Override
    public String toString()
    {
        String info = shapeColor + " triangle where base equals " + base + " and height equals " + height;
        return info;
    }
}

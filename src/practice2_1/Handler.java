package practice2_1;

public class Handler
{
    public void displayData(Shape figures[])
    {
        for(Shape i : figures)
        {
            System.out.println(i.toString());
        }
    }

    public double summaryArea(Shape figures[])
    {
        double summaryArea = 0;
        for(Shape i : figures)
        {
            summaryArea += i.calcArea();
        }
        return summaryArea;
    }

    public double summaryArea(Shape figures[], String type)
    {
        String figureType;
        double summaryArea = 0;
        for(Shape i : figures)
        {
            figureType = i.getClass().getSimpleName();

            if (figureType.equals(type))
            {
                summaryArea += i.calcArea();
            }
        }
        return summaryArea;
    }

}

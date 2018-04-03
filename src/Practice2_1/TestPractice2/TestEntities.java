package Practice2_1.TestPractice2;

import Practice2_1.Entities.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestEntities
{
    @Test
    public void testTriangleCalcArea()
    {
        Triangle testTriangle = new Triangle(2, 4, "black");

        double result = testTriangle.calcArea();
        double expected = 4;

        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testCircleCalcArea()
    {
        Circle testCircle = new Circle(4, "black");

        double result = testCircle.calcArea();
        double expected = 12.566;

        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testRectangleCalcArea()
    {
        Rectangle testRectangle = new Rectangle(3, 4, "black");

        double result = testRectangle.calcArea();
        double expected = 12;

        assertEquals(expected, result, 0.01);
    }
}

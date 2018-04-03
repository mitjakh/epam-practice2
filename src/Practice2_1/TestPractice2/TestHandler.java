package Practice2_1.TestPractice2;

import Practice2_1.Entities.*;
import Practice2_1.Handler;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestHandler
{
    Shape[] shapes = new Shape[] {new Rectangle(4, 5, "black"), new Circle(5, "black"), new Circle(3, "black")};
    Handler handler = new Handler();

    @Test
    public void testSummaryArea()
    {
        double result = handler.summaryArea(shapes);
        double expected = 46.7;

        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testCirclesSummaryArea()
    {
        double result = handler.summaryArea(shapes, "Circle");
        double expected = 26.7;

        assertEquals(expected, result, 0.01);
    }
}

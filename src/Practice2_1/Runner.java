package Practice2_1;

import Practice2_1.Entities.Circle;
import Practice2_1.Entities.Rectangle;
import Practice2_1.Entities.Shape;
import Practice2_1.Entities.Triangle;
import Practice2_1.ShapeComparators.AreaComparator;
import Practice2_1.ShapeComparators.ColorComparator;

import java.util.Arrays;

public abstract class Runner
{
    public static void run()
    {
        Shape[] shapes = new Shape[] {new Rectangle(4, 5, "red"), new Circle(6 , "blue"), new Triangle(7, 3, "red"),
                new Circle(3, "yellow"), new Circle(7, "green"), new Rectangle(3, 2, "red"),
                new Triangle(6, 4, "black"), new Circle(4, "green"), new Triangle(3, 7, "white"), new Rectangle(5, 5, "green"),
                new Triangle(3, 3, "blue")};

        Handler handle = new Handler();
        System.out.println("Info about all figures: ");
        handle.displayData(shapes);

        System.out.println("Summary area of all figures equals " + handle.summaryArea(shapes));
        System.out.println("Summary area of all circles equals " + handle.summaryArea(shapes, "Circle"));
        System.out.println("Summary area of all rectangles equals " + handle.summaryArea(shapes, "Rectangle"));
        System.out.println("Summary area of all triangles equals " + handle.summaryArea(shapes, "Triangle"));

        Arrays.sort(shapes, new AreaComparator());

        System.out.println("Figures sorted by area: ");
        handle.displayData(shapes);

        Arrays.sort(shapes, new ColorComparator());

        System.out.println("Figures sorted by color: ");
        handle.displayData(shapes);
    }
}

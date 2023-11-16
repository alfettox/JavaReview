import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Shape square1 = new Square("yellow", 4);
        Shape circle1 = new Circle("red", 2.3);

        Collection<Shape> coll = new ArrayList<>();


        coll.add(square1);
        coll.add(circle1);

        for (Shape x : coll) {
            String shapeName = (x instanceof Square ? "Square " : "Circle ");
            System.out.println(shapeName +
                    "perimeter: " + x.color +
                    " - " +
                    "Area: " + round(x.getArea()) +
                    " - " +
                    "Perimeter: " + round(x.getPerimeter())
            );
        }
    }


    public static double round(double num) {
        return Math.round(num);
    }
}
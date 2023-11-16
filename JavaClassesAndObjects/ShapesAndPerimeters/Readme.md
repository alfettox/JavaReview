# Java Shape Example

This Java program demonstrates the use of abstract classes and inheritance to model shapes, specifically squares and circles. The program calculates and displays the area and perimeter of each shape.

## Shape Class Hierarchy

The program defines an abstract `Shape` class with the following structure:

```java
abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double getArea();

    abstract double getPerimeter();
}
The Shape class is extended by two concrete classes: Square and Circle. Each of these classes implements the getArea() and getPerimeter() methods.

Square Class
java
Copy code
class Square extends Shape {
    int side;

    Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getPerimeter() {
        return 4 * side;
    }
}
Circle Class
java
Copy code
class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
Main Program
The Main class creates instances of Square and Circle, adds them to a collection, and then iterates over the collection to print information about each shape.

java
Copy code
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
            String shapeType = (x instanceof Square) ? "Square" : "Circle";
            System.out.println(
                    shapeType + " perimeter: " + x.color +
                            " - Area: " + x.getArea() +
                            " - Perimeter: " + x.getPerimeter()
            );
        }
    }
}
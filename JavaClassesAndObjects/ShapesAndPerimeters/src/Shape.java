abstract class Shape {
    double area;
    double perimeter;
    String color;

    public Shape(String color) {
        this.color = color;
    }


    abstract double getPerimeter();

    abstract double getArea();
}

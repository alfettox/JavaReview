public class Circle extends Shape{
    double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius *radius;
    }
}

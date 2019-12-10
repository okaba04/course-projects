package HomeWork4.Task1.PlaneShapes;

import HomeWork4.Task1.Vertex;

public class Rectangle extends PlaneShape {

    private Vertex vertex;
    private double width;
    private double high;

    public Rectangle(double x, double y, double width, double high) {
        this.vertex = new Vertex(x, y);
        this.width = width;
        this.high = high;
    }

    @Override
    public double getArea() {
        return width * high;
    }

    @Override
    public double getPerimeter() {
        return (width + high) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: " + this.vertex +
            ", area = " + getArea() +
            ", perimeter = " + getPerimeter();
    }
}
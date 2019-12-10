package HomeWork4.Task1.PlaneShapes;

import HomeWork4.Task1.Vertex;

public class Circle extends PlaneShape {

    private Vertex vertex;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.vertex = new Vertex(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle: " + this.vertex +
            ", radius = " + radius +
            ", area = " + getArea() +
            ", perimeter = " + getPerimeter();
    }
}
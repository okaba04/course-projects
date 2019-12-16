package homework4.planeshapes;

import homework4.Vertex;

public class Circle extends PlaneShape {

    private double radius;

    public Circle(double x, double y, double radius) {
        this.vertex = new Vertex(x, y);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle: " + this.vertex +
                ", radius = " + radius +
                ", area = " + calculateArea() +
                ", perimeter = " + calculatePerimeter();
    }
}
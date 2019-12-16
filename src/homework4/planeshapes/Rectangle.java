package homework4.planeshapes;

import homework4.Vertex;

public class Rectangle extends PlaneShape {

    public Rectangle(double x, double y, double width, double high) {
        this.vertex = new Vertex(x, y);
        this.width = width;
        this.high = high;
    }

    @Override
    public double calculateArea() {
        return width * high;
    }

    @Override
    public double calculatePerimeter() {
        return (width + high) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: " + this.vertex +
                ", area = " + calculateArea() +
                ", perimeter = " + calculatePerimeter();
    }
}
package HomeWork4.Task1.PlaneShapes;

import HomeWork4.Task1.Vertex;

public class Triangle extends PlaneShape {

    private Vertex a;
    private Vertex b;
    private Vertex c;

    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(double aX, double aY, double bX, double bY, double cX, double cY) {
        this.a = new Vertex(aX, aY);
        this.b = new Vertex(bX, bY);
        this.c = new Vertex(cX, cY);

        sideA = calculateDistanceBetweenTwoVertices(a, b);
        sideB = calculateDistanceBetweenTwoVertices(b, c);
        sideC = calculateDistanceBetweenTwoVertices(c, a);
    }

    @Override
    public double getArea() {
        return (a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) +
            c.getX() * (a.getY() - b.getY())) / 2;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Triangle: " +
            "A " + a.toString() +
            ", B " + b.toString() +
            ", C " + c.toString() +
            ", area = " + getArea() +
            ", perimeter = " + getPerimeter();
    }
}

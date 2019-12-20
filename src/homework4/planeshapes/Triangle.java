package homework4.planeshapes;

import homework4.Vertex;

public class Triangle extends PlaneShape {

    private Vertex a;
    private Vertex b;
    private Vertex c;

    public Triangle(double aX, double aY, double bX, double bY, double cX, double cY) {
        this.a = new Vertex(aX, aY);
        this.b = new Vertex(bX, bY);
        this.c = new Vertex(cX, cY);

        sideA = calculateDistanceBetweenTwoVertices(a, b);
        sideB = calculateDistanceBetweenTwoVertices(b, c);
        sideC = calculateDistanceBetweenTwoVertices(c, a);
    }

    @Override
    public double calculateArea() {
        return (a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) +
                c.getX() * (a.getY() - b.getY())) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "A " + a.toString() +
                ", B " + b.toString() +
                ", C " + c.toString() +
                ", area = " + calculateArea() +
                ", perimeter = " + calculatePerimeter();
    }
}

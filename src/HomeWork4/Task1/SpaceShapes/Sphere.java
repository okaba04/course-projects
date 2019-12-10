package HomeWork4.Task1.SpaceShapes;

import HomeWork4.Task1.Vertex;

public class Sphere extends SpaceShape {

    private Vertex vertex;
    private double radius;

    public Sphere(double x, double y, double z, double radius) {
        this.vertex = new Vertex(x, y, z);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere: " + this.vertex +
            ", radius = " + radius +
            ", volume = " + getVolume() +
            ", area = " + getArea();
    }
}
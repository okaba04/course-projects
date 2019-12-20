package homework4.spaceshapes;

import homework4.Vertex;

public class Sphere extends SpaceShape {

    private double radius;

    public Sphere(double x, double y, double z, double radius) {
        this.vertex = new Vertex(x, y, z);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculateVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere: " + this.vertex +
                ", radius = " + radius +
                ", volume = " + calculateVolume() +
                ", area = " + calculateArea();
    }
}
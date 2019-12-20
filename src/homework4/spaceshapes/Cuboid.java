package homework4.spaceshapes;

import homework4.Vertex;

public class Cuboid extends SpaceShape {

    public Cuboid(double x, double y, double z, double width, double height, double depth) {
        this.vertex = new Vertex(x, y, z);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double calculateArea() {
        return 2 * ((depth * width) + (width * height) + (height * depth));
    }

    @Override
    public double calculateVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid: " + this.vertex +
                ", width = " + width +
                ", height = " + height +
                ", depth = " + depth +
                ", volume = " + calculateVolume() +
                ", area = " + calculateArea();
    }
}
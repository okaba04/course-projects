package HomeWork4.Task1;

public class Vertex {

    private double x;
    private double y;
    private double z;

    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vertex(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Vertex coordinates: " + this.x + " , " + this.y + " , " + this.z;
    }
}
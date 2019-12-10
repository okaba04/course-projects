package HomeWork4.Task1;

public abstract class Shape {

    public double calculateDistanceBetweenTwoVertices(Vertex a, Vertex b) {
        return Math.sqrt((Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2)));
    }
}
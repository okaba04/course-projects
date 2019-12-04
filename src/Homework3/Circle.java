package Homework3;

class Circle {

    private double calculateSquare(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateSquare(3);
    }
}

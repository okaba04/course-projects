package Homework3;

class Circle {

    private double calculateSquare(double radius) {
        return Math.PI *Math.pow(radius,2);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateSquare(3);
    }
}

package HomeWork4.Task1;

import HomeWork4.Task1.PlaneShapes.Circle;
import HomeWork4.Task1.PlaneShapes.Rectangle;
import HomeWork4.Task1.PlaneShapes.Triangle;
import HomeWork4.Task1.SpaceShapes.Cuboid;
import HomeWork4.Task1.SpaceShapes.Sphere;
import HomeWork4.Task1.SpaceShapes.SquarePyramid;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(1, 2, 2);
        Rectangle rectangle = new Rectangle(1, 2, 10, 2);
        Triangle triangle = new Triangle(1, 2, 10, 5, 3, 9);
        Cuboid cuboid = new Cuboid(1, 3, 4, 5, 6, 7);
        Sphere sphere = new Sphere(1, 2, 10, 4);
        SquarePyramid squarePyramid = new SquarePyramid(4, 6, 5, 10, 15);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);
        shapes.add(cuboid);
        shapes.add(sphere);
        shapes.add(squarePyramid);

        shapes.forEach(shape -> System.out.println(shape.toString()));
    }
}
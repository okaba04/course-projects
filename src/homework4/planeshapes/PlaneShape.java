package homework4.planeshapes;

import homework4.interfaces.Shape;
import homework4.interfaces.AreaMeasurable;
import homework4.interfaces.PerimeterMeasurable;
import homework4.Vertex;

abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {

    Vertex vertex;
    double sideA;
    double sideB;
    double sideC;
    double width;
    double high;
}
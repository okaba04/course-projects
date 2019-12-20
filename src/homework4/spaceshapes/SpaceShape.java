package homework4.spaceshapes;

import homework4.interfaces.AreaMeasurable;
import homework4.interfaces.VolumeMeasurable;
import homework4.interfaces.Shape;
import homework4.Vertex;

abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    Vertex vertex;
    double width;
    double height;
    double depth;
}

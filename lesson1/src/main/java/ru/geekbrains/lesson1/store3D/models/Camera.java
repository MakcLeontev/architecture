package ru.geekbrains.lesson1.store3D.models;

import java.util.ArrayList;
import java.util.List;

public class Camera {

    //TODO: Доработать в рамках ДР
    private List<Point3D> location;
    private List<Angle3D> angle;

    public List<Point3D> getLocation() {
        return location;
    }

    public void setLocation(List<Point3D> location) {
        this.location = location;
    }

    public List<Angle3D> getAngle() {
        return angle;
    }

    public void setAngle(List<Angle3D> angle) {
        this.angle = angle;
    }

    public Camera(List<Point3D> location, List<Angle3D> angle) {
        this.location = location;
        this.angle = angle;
    }



    public void rotate(Angle3D angle3D){

    }

    public void move(Point3D point3D){

    }
}

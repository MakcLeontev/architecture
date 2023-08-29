package ru.geekbrains.lesson1.store3D.models;

import java.util.List;

public class Flash {

    //TODO: Доработать в рамках ДР

    private List<Point3D> location;
    private List<Angle3D> angle;
    private String color;
    private float power;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public Flash(List<Point3D> location, List<Angle3D> angle, String color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void rotate(Angle3D angle3D){

    }

    public void move(Point3D point3D){

    }
}

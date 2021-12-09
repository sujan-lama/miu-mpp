package lesson5.lecture.intfaces2;

import java.util.List;

public class Rectangle implements Polygon {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public List<Double> getSides() {
        return List.of(getLength(), getWidth(), getLength(), getWidth());
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

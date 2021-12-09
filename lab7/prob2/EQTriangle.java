package lesson5.lecture.intfaces2;

import java.util.List;

public class EQTriangle implements Polygon {
    private double side;

    public EQTriangle(double side) {
        this.side = side;
    }

    @Override
    public List<Double> getSides() {
        return List.of(getSide(), getSide(), getSide());
    }

    public double getSide() {
        return side;
    }
}

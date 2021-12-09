package lesson5.lecture.intfaces2;

import java.util.List;

public interface Polygon extends ClosedCurve {
    @Override
    default double computePerimeter() {
        double perimeter = 0;
        for (double sides : getSides()) {
            perimeter += sides;
        }
        return perimeter;
    }

    List<Double> getSides();
}

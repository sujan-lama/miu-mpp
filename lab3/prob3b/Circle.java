package prob3b;

public class Circle {
    private final double radius;

    Circle(double radius) {
        if (radius < 0) {
            throw new RuntimeException("Radius should be >= 0");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }


}

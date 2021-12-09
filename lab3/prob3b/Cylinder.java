package prob3b;

public class Cylinder {

    private final double height;
    private Circle circle;

    public Cylinder(double height, double radius) {
        circle = new Circle(radius);
        this.height = height;
    }

    public double computeArea() {
        return 2 * Math.PI * circle.getRadius() * (circle.getRadius() + getHeight());
    }


    public double getHeight() {
        return height;
    }

    public double computeVolume() {
        return computeArea() * getHeight();
    }
}

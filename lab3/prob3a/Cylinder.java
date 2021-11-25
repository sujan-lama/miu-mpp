package prob3a;

public class Cylinder extends Circle {

    private final double height;

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    // if we overide this function, computeVolume function will not work. So, this is bad inheritance practice

//    @Override
//    public double computeArea() {
//        return 2 * Math.PI * this.getRadius() * (this.getRadius() + getHeight());
//    }


    public double getHeight() {
        return height;
    }

    public double computeVolume() {
        return this.computeArea() * getHeight();
    }
}

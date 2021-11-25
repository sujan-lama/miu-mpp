package prob3a;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println("Area of circle is " + circle.computeArea());


        Cylinder cylinder = new Cylinder(10, 30);
        System.out.println("Volume of cylinder is " + cylinder.computeVolume());

    }
}

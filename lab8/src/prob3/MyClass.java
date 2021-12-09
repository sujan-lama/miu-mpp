package prob3;

import java.util.function.Predicate;

public class MyClass {
    int x;
    String y;

    public MyClass(int x, String y) {
        this.x = x;
        this.y = y;
    }

    // testing method to check the equality
    public void myMethod(MyClass cl) {
//Implement
        Predicate<MyClass> checkEqual1 = myCls -> this.equals(myCls);
        Predicate<MyClass> checkEqual2 = this::equals;
        System.out.println("check equals with Lambda " + checkEqual1.test(cl));
        System.out.println("check equals with MR " + checkEqual2.test(cl));

    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (ob.getClass() != getClass()) return false;
        MyClass mc = (MyClass) ob;
        return mc.x == x && mc.y.equals(y);
    }

    public static void main(String[] args) {
        MyClass myclass = new MyClass(1, "A");
        MyClass myclass1 = new MyClass(1, "B");
        myclass.myMethod(myclass);
        myclass.myMethod(myclass1);
    }
}
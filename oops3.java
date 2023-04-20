import java.util.*;
import bank;
//inheritance
class Shape {
    String color;
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
}
}
public class oops3 {
    public static void main(String args [])
    {
        Triangle t1 = new Triangle();
        t1.color = "red";
        //it won't show error although we haven't define colour in class triangle
        //this means that t1 already has color property in it althoigh we don't define it in tri class
        //This is inheriting property n methods of one class to another class
    }
}
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }
}
//showing hierarchichal inheritance triangle as well as circle both class inherit shape class
class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14*r*r);
    }
}

//showing multi level inheritance equi triangle inherits triangle prop which inherits shape
class EquilateralTriangle extends Triangle {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
}
}
public class single_level_inheritance {
    public static void main(String args[]){

    }
}

//polymorphism

class Student {
    String name;
    int age;
    // information mein sirf name dikhana h
    // function overloading
    //same function using for different purpose this is polymorphism
    public void printInfo(String name) {
        System.out.println(name);
    }
    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(String name,int age) {
        System.out.println(name + " " + age);
    }
}
public class oops2 {
    public static void main(String args []){
        Student s2 = new Student();
        s2.name = "Chaitanya";
        s2.age = 23;
        s2.printInfo(s2.name);
        s2.printInfo(s2.age);
        s2.printInfo(s2.name,s2.age);
    }
}
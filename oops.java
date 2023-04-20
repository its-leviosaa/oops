
//Ex 1. making classes for a pen like making blueprints for pen

/*
class Pen {
    String colour;
    String type;
    public void write () {
        System.out.println("Writing Something");
    }

    //we want to print colour and type of pen

    public void penColour() {
        System.out.println(this.colour);
    }
}

*/

//Ex 2. making class for students

class Students {
    String name;
    String department;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.department);
    }

    /* 
    //making constructor of student class

    //making non parameterised constructor first

    Students() {
        System.out.println("calling non parameterised constructor");
    }

    */

    //making parameterised constructor 

    /*
    Students(String name,String department,int age)
    {
        this.name=name;
        this.department=department;
        this.age=age;
    }
    */

    //making copy constructor
    Students(Students s3)
    {
        this.name=s3.name;
        this.department=s3.department;
        this.age=s3.age;
    }

    //empty constructor just to run the copy construction program
    Students() {

    }

}

// making objects for classes in main function

public class oops {
    public static void main(String args []) {
        /* 
        Pen pen1 = new Pen();
        pen1.colour = "blue";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.colour = "red";
        pen2.type = "ballpoint";

        pen1.penColour();
        pen2.penColour();
        */

        //it's used like it was initially. in copy constructor
        /*
        Students s1 = new Students("Priya","IT",20);
        s1.printInfo();
        */

        /*
        //commenting it out because it's not needed now while using parameterised constructor
        Students s1= new Students();
        s1.name = "Priya";
        s1.age = 24;
        s1.department = "IT";
        s1.printInfo();

        */
        Students s2 = new Students();
        s2.name = "Chaitanya";
        s2.age = 23;
        s2.department = "Civil";
        s2.printInfo();
        //copy constructor implementing
        Students s3 = new Students(s2);
        s3.printInfo();

        /*
        Students s2 = new Students("Chaitanya","Civil",21);
        s2.printInfo();
        */

        /*
        s2.name = "Chaitanya";
        s2.age = 23;
        s2.department = "Civil";
        s2.printInfo();
        */
    }
}
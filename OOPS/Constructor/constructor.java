// package OOPS;

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Raushan Raj");
        Student s3 = new Student(123);
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Default Constructor");
    }

    Student(String name){
        this.name=name;
    }

    Student(int roll){
        this.roll=roll;
    }
}

//constructor overload >> example of polymorphisms

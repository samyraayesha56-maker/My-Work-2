import java .io.*;
class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    int rollNumber;

    void displayStudent() {
        displayInfo(); // Parent class method call
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ayesha";
        s1.age = 21;
        s1.rollNumber = 242002035;
        s1.displayStudent();
    }
}

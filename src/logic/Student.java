/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Huzaifa
 */
public class Student extends Person implements Information {
    private String studentID;
    
    

    public Student(String name, String fatherName, int age, String address, String studentID) {
        super(name, fatherName, age, address);

        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

  


    @Override
    public void displayPersonalInfo() {
        System.out.println("--------------------------------------------------");
        System.out.println("              STUDENT PERSONAL DETAILS            ");
        System.out.println("--------------------------------------------------");
        System.out.println(" Name : " + getName());
        System.out.println(" Father Name : " + getFatherName());
        System.out.println(" Age : " + getAge());
        System.out.println(" Address : " + getAddress());
        System.out.println("--------------------------------------------------");
    }

    @Override
    public void displayStudentID() {
        System.out.println("--------------------------------------------------");
        System.out.println("Student ID: " + studentID);
    }



    @Override
    public void displayInfo() {
        displayPersonalInfo();
        displayStudentID();
    }
}


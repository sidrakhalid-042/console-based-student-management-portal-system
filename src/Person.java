/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Huzaifa
 */

public abstract class Person {
    private String name;
    private String fatherName;
    private int age;
    private String address;

    public Person(String name, String fatherName, int age, String address) {
        this.name = name;
        this.fatherName = fatherName;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public abstract void displayPersonalInfo();
}


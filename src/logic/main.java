/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Huzaifa
 */

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

      Student[] studentArray = new Student[100];
        int studentCount = 0;

        System.out.println("------------- LOGIN -------------");
        while (true) {
            System.out.print("Enter Username: ");
            String username = m.nextLine();

            System.out.print("Enter Password: ");
            String pass = m.nextLine();

            boolean a,b;
             a = username.equals("admin");
             b = pass.equals("admin123");

            if (a && b) {
                break;
            }

            if (!a && !b) {
                System.out.println("Both username and password are incorrect.");
            } else if (!a) {
                System.out.println("Invalid username.");
            } else if (!b) {
                System.out.println("Invalid password.");
            }

            System.out.println("Please enter again.\n");
        }

        Student student = null;

        while (true) {
            System.out.println("\n--------------- MENU ---------------");
            System.out.println("1. Register Student");
            System.out.println("2. Remove Student");
            System.out.println("3.Display");
            System.out.println("4. Exit");
            System.out.print("Select option (1-4): ");

            int choice;
            try {
                choice = m.nextInt();
                m.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                m.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    String name = "", fatherName = "", address = "", studentID = "";
                    int age = 0;

                  while (true) {
    System.out.print("Enter Name: ");
    name = m.nextLine();
    try {
        if (name == null || name.trim().isEmpty() || !name.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Name must contain only letters and spaces");
        }
        break; 
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
                   while (true) {
    System.out.print("Enter Father's Name: ");
    fatherName = m.nextLine();
    try {
        if (fatherName == null || fatherName.trim().isEmpty() || !fatherName.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Father's name must contain only letters and spaces");
        }
        break;
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
}

                   while (true) {
    System.out.print("Enter Age: ");
    try {
        age = m.nextInt();
        m.nextLine();
        if (age <= 0)
            throw new IllegalArgumentException("Age must be positive!");
        break;
    } catch (InputMismatchException e) {
        System.out.println("Error: Age must be a number!");
        m.nextLine();
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
                  while (true) {
    System.out.print("Enter Address: ");
    address = m.nextLine();
    try {
        if (address == null || address.trim().isEmpty() || !address.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Address must contain only letters and spaces!");
        }
        break;
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
}

                while (true) {
    System.out.print("Enter Student ID: ");
    studentID = m.nextLine();

    boolean duplicate = false;
    for (int i = 0; i < studentCount; i++) {
        if (studentArray[i].getStudentID().equalsIgnoreCase(studentID)) {
            duplicate = true;
            break;
        }
    }

    try {
        if (studentID == null || studentID.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be empty!");
        }
        if (!studentID.matches("\\d+")) {  
            throw new IllegalArgumentException("Student ID must contain digits only!");
        }
        if (duplicate) {
            throw new IllegalArgumentException("This Student ID already exists! Please try again.");
        }

        break;

    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
                    student = new Student(name, fatherName, age, address, studentID);
                    studentArray[studentCount] = student;
                    studentCount++;
                    System.out.println("Student registered successfully!");
//file handling
                    FileWriter fw = null;
                    BufferedWriter bw = null;
                    try {
                        fw = new FileWriter("MUAZ.txt", true);
                        bw = new BufferedWriter(fw);
                        bw.write("Name: " + name + ", Father: " + fatherName + ", Age: " + age +
                                ", Address: " + address + ", ID: " + studentID);
                        bw.newLine();
                    } catch (IOException e) {
                        System.out.println("Error writing to file: " + e.getMessage());
                    } finally {
                        try {
                            if (bw != null) bw.close();
                            if (fw != null) fw.close();
                        } catch (IOException e) {
                            System.out.println("Error closing file: " + e.getMessage());
                        }
                    }
                    break;

   
              case 2:
    if (studentCount == 0) {
        System.out.println("No students registered yet.");
        break;
    }

    while (true) {
        System.out.print("Enter Student ID to remove: ");
        String removeID = m.nextLine().trim();
        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            if (studentArray[i].getStudentID().equalsIgnoreCase(removeID)) {
                for (int j = i; j < studentCount - 1; j++) {
                    studentArray[j] = studentArray[j + 1];
                }
                studentArray[--studentCount] = null;
                System.out.println("Student removed successfully!");
                found = true;

              // ------- Simple Box Style File Handling -------
FileWriter fff = null;
BufferedWriter bbb = null;
try {
    fff = new FileWriter("MUAZ.txt", true); // append mode
    bbb = new BufferedWriter(fff);

    bbb.newLine();
    bbb.write("|------------------------------------------------------|");
    bbb.newLine();
    bbb.write("| Student with ID " + removeID + " removed |");
    bbb.newLine();
    bbb.write("|------------------------------------------------------|");
    bbb.newLine();
    bbb.newLine();

} catch (IOException e) {
    System.out.println("Error writing to file: " + e.getMessage());
} finally {
    try {
        if (bbb != null) bbb.close();
        if (fff != null) fff.close();
    } catch (IOException e) {
        System.out.println("Error closing file: " + e.getMessage());
    }
}
                break;
            }
        }

        if (found)
            break;
        else System.out.println("Incorrect ID. Try again.");
    }
    break;


       

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    return;
                    case 3:  
          FileReader fr = null;
BufferedReader br = null;
try {
    fr = new FileReader("MUAZ.txt");
    br = new BufferedReader(fr);

    String line;
    System.out.println("----- Student Data from File -----");
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
    System.out.println("---------------------------------");

} catch (IOException e) {
    System.out.println("Error reading file: " + e.getMessage());
} finally {
    try {
        if (br != null) br.close();
        if (fr != null) fr.close();
    } catch (IOException ex) {
        System.out.println("Error closing file: " + ex.getMessage());
    }
}
                    break;

                default:
                    System.out.println("Invalid option! Choose 1–7.");
            }
        }
    }
}


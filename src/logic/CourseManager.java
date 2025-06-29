/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.io.*;

public class CourseManager {

    public static boolean courseAlreadyExists(String courseName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("MUAZ.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains("course: " + courseName)) {
                br.close();
                return true;
            }
        }
        br.close();
        return false;
    }

    public static boolean studentExists(String studentID) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("MUAZ.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains("ID: " + studentID)) {
                br.close();
                return true;
            }
        }
        br.close();
        return false;
    }
}
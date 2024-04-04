package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class StudentHashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, String> roster = new HashMap<>();

        // Input loop
        String studentName;
        int studentID;

        System.out.println("Enter student names and ID numbers. Enter 'quit' to finish.");

        while (true) {
            System.out.print("Enter student name: ");
            studentName = input.nextLine();

            if (studentName.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.print("Enter student ID: ");
            studentID = input.nextInt();
            input.nextLine(); // Consume newline

            roster.put(studentID, studentName);
        }

        // Printing roster
        System.out.println("\nStudent Roster:");
        for (Map.Entry<Integer, String> entry : roster.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        input.close();
    }
}

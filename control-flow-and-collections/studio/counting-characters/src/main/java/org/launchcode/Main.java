package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = input.nextLine();
        input.close();

        // Initialize a HashMap to store character counts
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Convert the string to lowercase to make the counting case-insensitive
        str = str.toLowerCase();

        // Loop through the string one character at a time
        for(char c : str.toCharArray())
        {
            // Exclude non-alphabetic characters
            if (Character.isLetter(c)) {
                // If the character is already in the map, increment its count
                if (charCount.containsKey(c))  {
                    charCount.put(c, charCount.get(c)+1);
                }
                // If the character is not in the map, add it with a count of 1
                else {
                    charCount.put(c, 1);
                }
            }
        }
        // Print the character counts
        for (HashMap.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}
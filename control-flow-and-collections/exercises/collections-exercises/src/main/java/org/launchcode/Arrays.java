package org.launchcode;


public class Arrays {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        // Loop through the array and print out each value
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        System.out.println("Print out each value: ");
        for (int num : integerArray) {
            System.out.println(num);
        }

        //Modify the loop to only print the odd numbers
        System.out.println("Print the odd numbers: ");
        for (int num : integerArray) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(java.util.Arrays.toString(words));

        String[] sentence = phrase.split("\\.");
        System.out.println(java.util.Arrays.toString(sentence));


    }
}
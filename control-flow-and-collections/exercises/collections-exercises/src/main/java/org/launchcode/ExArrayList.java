package org.launchcode;
import java.util.*;
import java.util.Arrays;



public class ExArrayList {
    public static void main(String[] args)
    {
        int[] arr1 = {1 , 1, 2, 3, 5, 8};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for( int num : arr1){
            arrayList.add(num);
        }
        int sum = ExArrayList.sumEven(arrayList);
        System.out.println("Sum of even numbers: " +sum);

        String sampleString="surya atharv Teja launchcode Java ArrayList Arrays";
        List<String> wordList = new ArrayList<>(Arrays.asList(sampleString.split(" ")));

        Scanner input =new Scanner(System.in);

        System.out.print("Enter a word length: ");
        int numChar = input.nextInt();

        printWordsWithLength(wordList, numChar);
        input.close();

    }
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printWordsWithLength(List<String> words, int length){
        for(String word:  words)
        {
            if(word.length()==length)
            {
                System.out.println(word);
            }
        }
    }
}




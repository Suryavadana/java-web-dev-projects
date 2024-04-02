package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner area = new Scanner(System.in);
        System.out.println("Enter the length of a rectangle");
        int length = area.nextInt();
        System.out.println("Enter the width of a rectangle");
        int width = area.nextInt();
        int areaOfRectangle = length*width;
        System.out.println("The area of a rectangle is " +areaOfRectangle);
    }

}

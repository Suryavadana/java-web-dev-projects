package org.launchcode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        System.out.println("input has " + input.hasNextDouble());
        if(input.hasNextDouble()){
            double radius = input.nextDouble();
            System.out.println(radius);
            System.out.println("Area of the circle is: " +Circle.getArea(radius));

        }
        else {
            System.out.println("wrong input " + input.next());
        }

//        input.close();
//
//        double area = Circle.getArea(radius);
//

    }
}

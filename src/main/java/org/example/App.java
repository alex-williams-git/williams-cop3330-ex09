/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        final double conversion = 350;

        System.out.print("What is the length of the ceiling? ");
        int length = Integer.parseInt(scan.nextLine());

        System.out.print("What is the width of the ceiling? ");
        int width = Integer.parseInt(scan.nextLine());

        int area = length * width;
        int num_buckets = (int)java.lang.Math.ceil(area / conversion);

        System.out.println("You will need " + num_buckets + " gallons of paint to cover " + area + " square feet.");
    }
}

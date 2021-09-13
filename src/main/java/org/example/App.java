/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("What is the length of your wall in feet? ");
        int length = keyboardInput.nextInt();

        System.out.print("What is the width of your wall in feet? ");
        int width = keyboardInput.nextInt();

        int area = length * width;

        int oneGallon = area / 350;
        if ((area % 350) != 0)
        {
            oneGallon++;
        }

        System.out.print("You will need to purchase " + oneGallon + " gallons of paint to cover " + area + " square feet.");

    }
}

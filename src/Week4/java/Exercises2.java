package Week4.java;

import java.util.Scanner;

public class Exercises2 {

    public static void maing(String[] args) {

        //Exercise 4.2.1
        //Identify any errors in the programs below and indicate the category of each error (Ccompilation Error, Run-Time error, or Logic Error)

        // syntax error


        System.out.print("Hi");
        System.out.println("Hello");
        System.out.print("Bye \n");


// Undeclared variable number


        int number = 0;
        int value = 1;
        number++;
        double result = number / value;
        System.out.println("Result: " + result); // Assignment was missing


        //
        //Scanner in = new Scanner(); // Scanner class was wrongly defined;
        //System.out.println("Enter number of cats: ");
        //int number = in.nextInt(); // undeclared variable and the data type;
        //System.out.printf("%4.2f %s", number, "is too many cats.");
    }
}
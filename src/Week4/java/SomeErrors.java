package Week4.java;

import java.util.Scanner; // YOU MUST TO DECLARE THIS HERE

public class SomeErrors {



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
                    double result = number / value; // it is an integer division;
                    System.out.println("Result: " + result); // Assignment was missing





                    Scanner in = new Scanner(System.in); // Scanner class was wrongly defined; and missing the >in<
                    System.out.println("Enter number of cats: ");
                    int number1 = in.nextInt(); // undeclared variable and the data type;
                    System.out.printf("%4.2d %s", number1, "is too many cats."); // you need to use "d" to int and dont use f to integer;

                }
            }


package Week6;

import java.util.Scanner;

public class BasicSelectionsStatements {
    public static final int MAX_VALUE = 100;
    public static final int MIN_MARK = 50;

    public static void main(String[] args) {


        // basic selection statements
        // The conditional Operator
        // You may recall the ternary operator
        // boolean-expression ? exp1 : exp2
        //for example
        int x = 1;
        int y = (x > 0) ? 5 : 6;
        int z = 50;
        String answer = (z >= 20) ? "yes" : "no"; //returns yes

        // String discount = (age >= 65) ? "5% discount" : "no discount";

        // e x e r c i s e 1
        //Exercise 6.1.1
        //Ask the user for a whole number. Display a message on the screen that indicates whether the number is positive or negative.
        // Consider 0 as a positive, since it does not contain a negative sign at the front.

        //Scanner input = new Scanner(System.in);
        // System.out.printf("%-22s", "Enter a whole number: ");
        //int number = input.nextInt();
        //String result = (number > 0 ) ? "Is positive" : "Is negative";
        //System.out.printf("%d %s%n", number, result);

        // programming structures

        // sequence structure  - every single one in the sequence is built into java;
        // selection structure -
        //repetition structure - repeating the a certain number of times

        // Selection Structure - use if statement to control which statement should be executed;
        // if you have homework, then you should do it, otherwise you can go to the movie

        // if statements -> syntax
        // if (booleanExpression) {
        //      statement(s)
        // }

        // Single -sided if Statement
        // if (booleanExpression)
        // {
        //      statement(s);
        // }

        // Syntax notes
        // the parentheses that surround the boolean expression are not optional;


        //xercise 6.1.2
        //Write a program that asks the user for a number less than 100.
        // If the user's input is 100 or more, display a message on the console.


        ///Scanner input2 = new Scanner(System.in);
        //System.out.printf("%-22s%d%s", "Enter number less than : ", MAX_VALUE + " ");
        //int number2 = input2.nextInt();

        //if (number2 >= MAX_VALUE) {
        // System.out.println("Error: invalid value. It must be less than" + MAX_VALUE);

        // The two-way if statement

        // if (boolean-expression) {
        //      statement(s)-for-the-true-case;
        // }
        //  else {
        //  sout
        // }

        // note: if no bradces are used then else clause matches the most recent if clauses in the same block.
        // to make the code more clear and avoid mistake, it is advisable that beside proper identation, to use braces;
        // int i = 1;
        // int j = 2;
        // int kl = 3;
        //if (i >j) {

        // Common errors
        // you should not put the semicolon at the end of an if clause;
        //if (radius >= 0); <- dont use this

        // TIP -> equivalents

        // if (number % 2 == 0)
        // even = true;
        // else = false;

        // is equivalent -> boolean even


        //exercises The method Math.random() generates a random double number greater than 0.0 and less than 1.0. Write a program that simulates flipping a coin.
        // Call the Math.random() method and if the number generated is less than 0.5, display "HEADS". Otherwise, display "TAILS".


        double number = Math.random();
        if (number < .5) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }

        // Exercise 6.1.4
        //Write the program that prompts the user to enter the student’s grade and the student’s exams average.
        // The program will display "Pass" if both numbers are greater than 50, and "Fail" if at least one of them is less than 50.

        Scanner input6 = new Scanner(System.in);
        System.out.printf("%-30s","Enter student's marks: ");
        double mark = input6.nextDouble();
        double examAverage = input6.nextDouble();
        if (mark >= MIN_MARK && examAverage >= MIN_MARK) {
            System.out.println("Approved!");
        } else {
            System.out.println("fail!");



            // Exercise 6.1.5
            //Write a program that prompts the user for two integers,
            // determines whether or not the first number is a multiple of the second,
            // and then prints both numbers and an appropriate message.

            Scanner input7 = new Scanner(System.in);
            System.out.printf("%-30s", "Enter two numbers separated by space: ");
            int number1  = input7.nextInt();
            int number2 = input7.nextInt();

            boolean isMultiple = number1 % number2 == 0;


            if (isMultiple) {
                System.out.println(number1 + "Is a multiple of " + number2);
            } else {
                System.out.println("Is not a multiple of " + number2);

                //  xercise 6.1.6
                //Write programs for each of the following:
                //
                //Write a program that generates a random integer from 1 to 5.

                //int random= (int) (Math.random() * 5) + 1;
                //System.out.println("guess  a number between 1 and 5: ");
                //int guess = input6.nextInt();

                //if (guess == random) {
                 //   System.out.println("You guessed correctly!");
               // } else {
                //    System.out.println("Sorry. You guessed incorrectly!");
                //}

                // Then ask the user to guess that number. If they guess correctly, display the message,
                // "You guessed correctly!". If they guess incorrectly, display the message, "Sorry, you guessed incorrectly."


                // Write a program that simulates the tossing of two dice (generate two random integers from 1 to 6).
                // If doubles are rolled, display a "You Win!!" message. Otherwise, tell the user what dice values they rolled.



                     Scanner input = new Scanner(System.in);
                double randomIntegers = (int) ((Math.random() * 6) + 1);
                System.out.println("Enter a number: ");
                int random1 = input.nextInt();

                if (random1 == randomIntegers){
                    System.out.println("You win!!");
                }else{
                    System.out.println(input6);





                    //A program calculates a person's weekly pay based on the number of hours they worked and their hourly pay rate:
                    //If they worked 40 hours or less, the person receives a salary calculated at their pay rate per hour.
                    //If the worker has worked more than 40 hours,
                    // the first 40 hours are calculated using the pay rate as before,
                    // and hourly rate times 1.5 for the hours above 40.





                }

            }
        }
    }
}


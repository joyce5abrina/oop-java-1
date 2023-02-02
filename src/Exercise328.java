import java.util.Scanner;

public class Exercise328 {
    public static void main(String[] args) {
        // exercise 3.2.8


        //Write a program that prompts the user for a whole number. Display if the number is positive or negative. Sample user interaction and output is shown below:
        //
        //Enter a whole number: 3
        //Positive: true
        //Negative: false
        //3 is a positive number
        //
        //Enter a whole number: -4
        //Positive: false
        //Negative: true
        //-4 is a negative number

        //expression 1  ? expression2  : expression 3
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input2.nextInt();

        System.out.println("Positive: " + (number > 0));
        System.out.println("Negative: " + (number < 0));
        System.out.println(number + " is a "
                + ((number > 0) ? "positive number " : "negative number"));


    //Write a java program using the ternary operator (? :), that would prompt the user to enter an integer and determine if its value is even or odd. For example if the user enters 4:
        //
        //the output will be:
        //
        //4 is an even number
        //
        //If the user enters 5, the answer would be:
        //
        //5 is an odd number
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number2 = input3.nextInt();

        System.out.println();

        System.out.println((number % 2 == 0) ? "even number" : "odd number");
    }

}

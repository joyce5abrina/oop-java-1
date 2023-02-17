package Week6;

import java.util.Scanner;


public class ExercisesWeek6 {
    public static final double ONE_YEAR = 2.5;
    public static final double TWO_YEARS = 3.0;
    public static final double THREE_YEARS = 3.5;
    public static final double FOUR_YEARS = 4.0;

    public static final double FIVE_YEARS = 4.5;
    public static final double OVERS_YEARS = 4.75;
    public static final double LEVEL1_LIMIT = 1000;
    public static final double LEVEL2_LIMIT = 2000;
    public static final double LEVEL3_LIMIT = 100;
    public static final double LEVEL1_RATE = 4.0;
    public static final double LEVEL2_RATE = 4.0;
    public static final double LEVEL3_RATE = 4.0;

    public static void main(String[] args) {
        //Write a program to read in three nonnegative integers from the keyboard. Display the integers in increasing order.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integer numbers separated by space: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        //first we got the minimum number and then the maximum
        int first = Math.min(num1, Math.min(num2, num3));
        int second; // i don't know
        int third = Math.max(num1, Math.max(num2, num3));

        if (num1 != first && num1 != third) {
            second = num1;
        } else if (num2 != first && num2 != third) {
            second = num3;
        } else {
        }
        System.out.printf("%d %d %d", num1, num2, num3);


// exercise 2
        //  Exercise 6.2.1
        //The following program determines and displays the letter grade for a student's final grade:
        //
        //import java.util.Scanner;
        //
        //public class StudentGrade {
        //
        //    public static void main(String[] args) {
        //
        //        Scanner keysIn = new Scanner(System.in);
        //        System.out.print("Enter the final grade: ");
        //        double grade = keysIn.nextDouble();
        //        String letter = "";
        //
        //        if (grade < 50) {
        //            letter = "F";
        //        } else if (grade >= 50) {
        //            letter = "D";
        //        } else if (grade >= 60) {
        //            letter = "C";
        //        } else if (grade >= 65) {
        //            letter = "C+";
        //        } else if (grade >= 70) {
        //            letter = "B";
        //        } else if (grade >= 75) {
        //            letter = "B+";
        //        } else if (grade >= 80) {
        //            letter = "A";
        //        } else if (grade >= 90) {
        //            letter = "A+";
        //        }
        //
        //        System.out.println("Letter grade: " + letter);
        //    }
        //}
        //
        //What would the output be if the user entered a final grade of 48? F
        //What would the output be if the user entered a final grade of 55? D
        //What would the output be if the user entered a final grade of 85? D
        //Why doesn't this program do what it's supposed to do? How would you rewrite it correctly?

        Scanner keysIn = new Scanner(System.in);
        System.out.print("Enter the final grade: "); // he always use print!!
        double grade = keysIn.nextDouble();
        String letter = "";

        if (grade < 50) {
            letter = "F";
        } else if (grade >= 60) {
            letter = "D";
        } else if (grade <= 65) {
            letter = "C";
        } else if (grade <= 70) {
            letter = "C+";
        } else if (grade <= 75) {
            letter = "B";
        } else if (grade <= 80) letter = "B+";
        else if (grade <= 85) {
            letter = "A";
        } else {
            letter = "A+";
        }

        System.out.println("Letter grade: " + letter);

        // Write a Java program that calculates and displays the interest rate for funds that are left on deposit for a certain amount of time. The interest rate is determined by the following chart:
        //
        //Years on Deposit	Rate
        //5 years or more	4.75%
        //4 years or more, but less than 5 years	4.5%
        //3 years or more, but less than 4 years	4%
        //2 years or more, but less than 3 years	3.5%
        //1 year or more, but less than 2 years	3%
        //less than 1 year, but greater than 0 years	2.5%
        //0 or less	0.0%

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter how many years: ");
        double numYears = input1.nextDouble();
        double rate;

        if (numYears <= 0) {
            rate = 0.0;
        } else if (numYears <= 1) {
            rate = ONE_YEAR;
        } else if (numYears <= 2) {
            rate = TWO_YEARS;
        } else if (numYears <= 3) {
            rate = THREE_YEARS;
        } else if (numYears <= 4) {
            rate = FOUR_YEARS;
        } else {
            rate = OVERS_YEARS;

        }
        System.out.println("The interest will be " + numYears);


        //Exercise 6.2.3
        //A program needs to display the amount of commission paid to sales people.


        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter how many amount:  ");
        double sales = input1.nextDouble();


    }


    // Commission paid is equal to the amount of sales multiplied by the commission rate.
    // Commission rates are assigned according to the following chart:
    //
    //Sales Amount	Commission Rate
    //under $1000	5%
    //$1000 or more but less than $2000	7.5%
    //$2000 or more, but less than $3500	10%
    //$3500 or more	15%


// exercise switch


// Exercise 6.2.5
//Write a program using a switch statement that requests a number from 1 to 7. Display the day of the week (e.g. Sunday, Monday..)
// corresponding to that number (1 is Sunday). Display an error message if the user enters anything other than a number from 1 to 7.



}










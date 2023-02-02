package Week4.java;

import java.util.Scanner;

public class Class7 {
    public static void main(String[] args) {

        // Programming errors -> Data Type Conversions

        // Programming Errors
        // if the code that you are writting don't follow the Java syntax the java will be an error;
        // if the compiler cannot understand the code an error will appear;
        // missing semicolons;
        // missing braces/ misspelling keywords or variable names;
        // the logical errors are the most hard to solve sometimes;
        // debugging tools can be use to identify this type of errors;

        //compilation errors -> it cant compile because the compiler cant understand what it is in the program;
        //runtime errors -> execution errors
        //logic errors

        // Syntax Erros -> it is very important because the compiler would not be able to read the code without the syntax;
        //ex

        //Runtime Errors -> in sometimes there is not syntax errors but:

        // System.out.println(1 / 0); // for int
        System.out.println(1.0 / 0 ); // the output will be 'infinity';
        // This is an integer -> you'll gonna get this error;


        // Logic Errors -> doesnt shows any errors;

        // example

        //double celsius = 35;
        //double fahrenheit = (9 / 5) * celsius + 32;
        //System.out.println(celsius + " degrees in celsius is "
        //+fahrenheit + " in Fahrenheit");

        // it doesnt display the error;
        // you can debug it with debugging tool;

// common errors and pitfalls

        // -> Undeclared/Unitialized Variables and Unused Variables;
        // -> Integer Overflow -> the max value is 2^31
        // Round-off Errors ->  float points and double
        // Unitieted integer division;
        // Redundant input objects;


        // example
       // spelling mistakes
        //double interestRate = 0.05;
        //double interest = interestrate; // it is undeclared anywhere;

        // Integer overflow
        // they have a minimum and maximum value;
        int value = 2137483647 + 1;
        System.out.println(value);
        // value will actually be -2147483648
        
        // Round-Off Errors
        //Also called a rounding errors

        // for example

        System.out.println(1.0 - 0.9);

        //displays 0.09999999999999998, not 0.1;
        // how can you fix this?
        System.out.printf("%.1f", (1.0 - 0.9));

        // Unintended integer division

        int number1 = 1;
        int number2 = 2;
        double average = (number1 + number2) / 2;
        System.out.println(average);

        int number3 = 1;
        int number4 = 2;
        double average1 = (number3+ number4) / 2.0;
        System.out.println(average1);

        // The scanner input -> YOU DONT NEED TO ADD MANUY MULTIPLE SCANNERS OBJECT;
        // ONLY ONE IS NECESSARY;
        //AS LONG AS THE INPUT WILL BE IN THE SAME DEVICE;
        Scanner input = new Scanner((System.in));


        // Exercises



        // Calculation with mixed types

        // You can use different numeric dataTypes to perform calculations;

        // example (casting)

        //3 * 4.5 is same as 3.0 * 4.5 -> this one here was casting;


        // Casting

        // You can always assign a value to a number numeric

        // ex

        //double x = 5;
        //int intValue = x;


      //  System.out.println(x);


        // Implicit Casting -> everything in the left  can fit to the right;
        // -------> byte --> short --> int --> long -> double


        // example:

        long longNum = 1_234_567_890_123L;
        float floatNum = longNum;
        System.out.println(floatNum);

    }

}

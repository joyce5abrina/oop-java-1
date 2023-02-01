

package Week4.java;
public class Week4 {

    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);

        // Trigonometric Functions
        System.out.println(Math.sin(Math.PI / 2));
        System.out.println(Math.asin(1.0) * 2); // should result the number of PI;
        System.out.println(Math.sin(Math.toRadians(90)));// pass to the to radians method and converts to the radians;
        System.out.println(Math.toDegrees(Math.PI) / 4); //


        //Exponent Methods

        // a^b -> Math.pow(a,b)
        // Va -> Math.sqrt(a) raiz quadrada
        // 3Va -> Math.cbrt(a)
        //e^a ->



        // Rounging methods

        //Double ceil (double x) -> gives the higher greater number
        System.out.println(Math.ceil(2.1));

        // Double floor (double x) -> it is the lower number;
        System.out.println(Math.floor(2.1));
        // double rint -> if it is in the middle it will give you closest even number;
        System.out.println(Math.rint(2.1));

        // int round -(float)> is the nearest to the whole number because of it it called int;
        System.out.println(Math.round(2.6f));
        // long round - (double)
        System.out.println();

            // min() max() and abs() -> to find the minimum or maximum of two numbers
        System.out.println(Math.max(23,56)); // always returning the higher number
        // Only two values;

        //System.out.println(123,56,33); // it will be an error, because it only support two values;

        //to have three values:
        System.out.println(Math.max(123, Math.max(57,97)));

        //absolute value abs() returns the number without the sign (a positive number)
        System.out.println(Math.abs(-2));
        System.out.println(Math.abs(2));

        // Random() -
        //return a number greater or equal to 0 and less than 1;

        //return random values

        System.out.println(Math.random());



        // the random method
        System.out.println(Math.random() * 10);
        System.out.println((int)(Math.random() * 10));


        // exercise 4.1.1
       // Exercise 4.1.1
       // Use Chapter 4.2 of your textbook or the Math class documentation as a reference. What Math class methods would you use to perform the following tasks:

       // find the square root of 13
        System.out.println(Math.sqrt(13));
       // find the minimum value of the two numbers stored in the variables dblNum1 and dblNum2
        int dbNum1 = 2;
        int dbNum2 = 1;
        System.out.println(Math.min(dbNum1, dbNum2));
     //   find the ceiling of -123.45
        System.out.println(Math.ceil(-123.45));
    //    find the floor of -123.45
        System.out.println(Math.floor(-123.45));
       // find the absolute value of -123.45
        System.out.println(Math.abs(123.45));


        // exercise 4.1.2
        //Write a single statement to perform each of the following calculations and store each result in a variable of the appropriate type:
      char value = 'x';
      char value1 = 'y';

        //The square root of x - y
        double result = Math.sqrt('x'-'y');
        //double result;
        //The absolute value of a2 - b2

        //double result = Math.abs(Math.pow(('a',2) - Math.pow('b',2));


        //The area of a circle (pi multiplied by radius-squared)
        //double area = Math.PI * Math.pow('radius',2);


        // 4.1.3

        // a.





        // Character Data Type and Operations

        // the char type is used for storing and representing single characters;
        // char is techincally an intenger; so the char can be calculated;
        // using ASCII table


        System.out.println('a' + 1);
        System.out.println("a" +1); // the string concatenate with the number;
        //when we have an int, everything will be converted in int;
        //so a is actually the number 97 in ASCII table
        // when we use a character and a number then we'll get the int.

        // every time that you are declaring a 'char' will use the ASCII code;

        System.out.println('a');
        System.out.println('4');
        System.out.println('4' + 1 - 1);


        // character data type -> for the unicode and hexadecimal you need to use 4 digits;
        // to unicode you use \(backslash)
        // using unicode you can print ANY character in the world;

        char letter = 'A';
        System.out.println(letter);

        System.out.println('\u0041');






    }
}

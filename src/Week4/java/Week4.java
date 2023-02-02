

package Week4.java;

import java.util.Scanner;

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
        System.out.println(Math.max(23, 56)); // always returning the higher number
        // Only two values;

        //System.out.println(123,56,33); // it will be an error, because it only support two values;

        //to have three values:
        System.out.println(Math.max(123, Math.max(57, 97)));

        //absolute value abs() returns the number without the sign (a positive number)
        System.out.println(Math.abs(-2));
        System.out.println(Math.abs(2));

        // Random() -
        //return a number greater or equal to 0 and less than 1;

        //return random values

        System.out.println(Math.random());


        // the random method
        System.out.println(Math.random() * 10);
        System.out.println((int) (Math.random() * 10));


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
        double result = Math.sqrt('x' - 'y');
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
        System.out.println("a" + 1); // the string concatenate with the number;
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


        char ch = 'a' + 1;
        System.out.println(ch); // autocasting;
        // the integer will be casting into a char;
        // this is because it will print the letter b;

        System.out.println('a' + 1);


        // all upercase letter has a louwercase value in ASCCI;
        // 0 to 9 \u0030 -> \u0039;
        // A-Z \u0041 - \u0054;

        // Escape sequence
        //\b backspace
        // \t tab
        // \n linefeed
        // \f formfeed
        // \r cariage return
        //\\ backslash
        // \" double quote

        // casting between char and numeric types

        // as a resukt char can be casted into a number and vise versa;

        // examples

        char ch1 = 65;
        char ch2 = (char) 0xAB0041;
        char ch3 = (char) 65.7;
        // use the hexadecimal value;
        // char ch4 = \u0041;

        //Strings

        // the plus sign has the function of concatenate

        // String s1 = Hello


        //Null Values for Strings and Characters;
        // to strings

        // "" (no space in between)
        // " " -> a space is a character;

        // char the null it is \0

        // exercises 4.1.4 (YOU HAVE TO FINISH)
        //Write a program that finds the ASCII code for each of the following character values:
        //
        //'7'
        int ascii;
        char seven = '7';
        ascii = seven;
        System.out.println("The ascii code for " + seven + "Is " + ascii);
        //'1'
        int ascii1;
        char one = '1';
        ascii1 = one;
        System.out.println("The ascii code for " + seven + "Is " + ascii1);
        //'a'
        int ascii2;
        char a = 'a';
        ascii2 = 'a';
        System.out.println("The ascii code for " + seven + "Is " + ascii2);
        //'A'

        int ascii3;
        char A = 'A';

        System.out.println(A);
        //'z'
        char z = 'z';
        System.out.println(z);
        //'Z'
        char Z = 'Z';
        System.out.println('Z');
        //'*'
        char astherisc = '*';
        System.out.println(astherisc);

        //exercise 4.1.5
        // open the ASCII TABLE
        //What is the decimal value for the character 'A'?
        //97
        //What is the decimal value for the character 'a'?
        //What do you think would each of the following statements would evaluate to?
        //(char)('m' - 5)
        System.out.println((char) ('m' - 5));
        //(char)('K' + 6)
        System.out.println((char) ('K' + 6));
        //(char)('y' - 'V')
        System.out.println((char) ('y' - 'V'));
        //(char)('K' + '*' - 1)
        System.out.println((char) ('K' + '*' - 1));
        //What character has a decimal value of 0? ->


        // Formating COnsole Output (another way to print our results)
        // syntax:
        //System.out.print(format, items);
        // format is a string that may consist of substrings and format specifiers;

        // an item may be a numeric value character, boolean value

        //example
     //   System.out.printf("%d", 1234);// the letter d stands for decimal integer
        //to float number:
     //   System.out.printf("%.f", 1234.0);
       // System.out.printf("%.2f", 12.34);
       // System.out.printf("%.1f", 12.36);
     //   System.out.printf("%7.1f", 12.36); // add some spaces
        //System.out.printf("%7.2f%\n", 1234.36); // you have to add the percentage after to use the new line;
        //System.out.printf("%7.2f", 15.99); ->

// formating output example
        System.out.printf("the result of %.2f * %.2f = %.2f",2.0, 4.78, (2.5 * 4.78)); // if were a money you can add .2f

        // %d it is to decimal integer;
        //System.out.printf("Print an integer: %d" + 123);


        // specifying with precision

       // System.out.printf("A formatted floating-point valuie %4.2f.");
                //(2));

                //formating pattern -> strict patterns
                // %[flags][width][.precision]typechar
                //precision will indicate
                //flags -

                // examples
     //   System.out.printf("%.5d", 123.4567);
//flag
   // System.out.printf(",%", 1234567);
        //System.out.printf("%-10d", 1234);
       // System.out.printf("%010d", 1234);
        // strings
        System.out.printf("%s%n", "This is a string");
        System.out.printf("%25s", "This is another string");

        // another thing
        Scanner input = new Scanner(System.in);
        System.out.printf("%-20s%n", "Enter a number");
        int num = input.nextInt();

        System.out.printf("%-20s", "Enter another ones");
        int num2 = input.nextInt();

        //System.out.printf("You entered %d and ");

        // Flags
        // common flags
        // dash (-)
        //zero (0)
        // comma (,)/

        // lentgh

        //System.out.printf("%5d", 123456); // if is more than >5< digits the number 5 of the precision will be ignored;
        //System.out.printf("%9d", 123456);
        //System.out.printf("%4.2f", 123.345); //number four will be ignored
        //System.out.printf("%9.2f", 123.345);
        //System.out.printf("%9.2e", 123.345);



        // exercises

        // What is the output from each of the following print statements?
        //
        //System.out.printf("%3d", 5);
        System.out.printf("%3d",5);

        //System.out.printf("%3d", 12345);
        System.out.printf("%3d",12345);
        //System.out.printf("%5.2f", 7.24);
        System.out.printf("%5.2f", 7.24);
        //System.out.printf("%5.2f", 7.277);
        System.out.printf("%5.2f", 7.277);
        //System.out.printf("%5.2f", 123.456);
        System.out.printf("%5.2f", 123.456);
        //System.out.printf("%5.2f", 123.4);
        System.out.printf("%5.2f", 123.4);
        //System.out.printf("%-5.2f", 7.277);
        System.out.printf("%-5.2f", 7.277);
        //System.out.printf("%-5.2f", 123.456);
        System.out.printf("%-5.2f", 123.456);






    }

}



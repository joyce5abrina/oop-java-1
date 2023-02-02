
// Exercise 3.2.4
//Write a program that prompts the user to enter two integers and store them into the variables value1 and value2. After that, display a math quiz by asking the user what value1 + value2 is. The user may enter a correct or incorrect answer. Display whether their answer is "true" or "false". Sample user interaction is shown below (prompting is shown in blue, user input in red and the output in black):
//
//Enter two integers separated by a space:   45 23
//What is 45 + 23?  68
//45 + 23 = 68 is true
//
//Another output example:
//
//Enter two integers separated by a space:   22 12
//What is 32 + 12?  45
//22 + 12 = 45 is false



import java.util.Scanner;
public class Exercise324 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("What is " + num1 + " + " + num2 + " ? ");
        //int answer = input.nextInt();

        System.out.println(num1 + " + " + num2 + " ? ");
        int answer = input.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + answer + " is "+
                (num1 + num2 == answer));




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





        //       int x = 1;
        //        System.out.println((x > 1) && (x++ > 1));
        //        System.out.println(x);
        //
        //    }
        //}




    }
}



import java.util.Scanner;

public class Example {
    //import.until.java.Scanner;
    final static double PI = 3.1415;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //long way to do that
        //             Scanner input = new java.util.Scanner(System.in);

        //we need to tell the user what to do;
        System.out.println("Enter radius : ");
        double radius = input.nextDouble();

        // processing
        // just for this lesson, declare and use  a constant;
        // later do not do this
        double area = 4 * PI * radius * radius;
        double volume = 4.0/ 3.0 * PI * radius * radius * radius; // later explain
        //output
        System.out.println("Area :" + area);
        System.out.println("Volume :" + volume);
// enter or input ->
       // this have to be out of method main;
        // Scanner input = new Scanner(System.in);
        System.out.println("Enter an int: ");
        int intNum = input.nextInt();

        System.out.println(intNum);
        double dbNum = input.nextDouble();

        System.out.println(intNum);
        System.out.println(dbNum);
    }
}

package Week4.java;
import java.util.Scanner;
public class Exercise417 {

    public static void main(String[] args) {
        // exercises

        // What is the output from each of the following print statements?
        //
        //System.out.printf("%3d", 5);
        System.out.printf("%d",5);

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

        // 4.1.7
        //What are the errors in each of the following print statements?
        //
        //System.out.printf("%d", 23)
        System.out.printf("%d", 23);
        //System.out.printf("%f", 5);-> it isnt a float;
        System.out.printf("%d", 5);

        //System.out.printf("%4d", 123.4);
        System.out.printf("%4f", 123.4);

        //System.out.printf("value 1: %d value 2: d", 5, 10);
        System.out.printf("value 1: %d value 2: %d", 5, 10);

        //exercise 4.1.8
        System.out.printf("%15e%n", 12.78);
        System.out.printf("%-15e%n", 12.78);
        System.out.printf("%15s%n", "Programming");
        System.out.printf("%-15s%n", "Programming");
        System.out.printf("%-7.2f%n", 12.78);
        System.out.printf("%-5d%n", 12);
        System.out.printf("%03d%n", 0);
        System.out.printf("%07.1f%n", 12.78);
        System.out.printf("%,010.1f%n", 12345.67);
        System.out.printf("%,10d%n", 7777);

    }

}



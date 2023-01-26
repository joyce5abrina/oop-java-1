import java.util.Scanner;

public class Example2 {
   final static double PI = 3.1415;
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an int: ");
        int intNum = input.nextInt();

        System.out.println(intNum);
        double dbNum = input.nextDouble();

        System.out.println("Enter a String: " );
        String str = input.nextLine();
                //use next if you need to write sentences that have spaces on that;

        System.out.println(intNum);
        System.out.println(dbNum);
        System.out.println(str);


    }
}

// if you are printing the number and have a string, the string will not be printed;
//
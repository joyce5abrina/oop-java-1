import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a boolean value: ");
        String str = input.next();
        boolean value = input.nextBoolean();
        System.out.println("You entered: " + value);

    }

}


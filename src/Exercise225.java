public class Exercise225 {
    static final int CENTS_IN_TOONIE = 200;
    static final int CENTS_IN_LOONIE = 100;
    static final int CENTS_IN_QUARTER = 25;
    static final int CENTS_IN_DIME = 10;
    static final int CENTS_IN_NICKEL = 5;

        public static void main(String[] args) {
            //Exercise 2.2.5
            //Calculate and display how many toonies, loonies, quarters, dimes, nickels and pennies make up an amount of cents. For example if you declare a value of 736 cents, the result should be:
            //
            //toonies: 3
            //loonies: 1
            //quarters: 1
            //dimes: 1
            //nickels: 0
            //pennies: 1
            int amount = 736;
            int toonies = amount / CENTS_IN_TOONIE;
            int loonies = amount % CENTS_IN_TOONIE /CENTS_IN_LOONIE;
            int quarters = amount % CENTS_IN_TOONIE / CENTS_IN_LOONIE / CENTS_IN_QUARTER;
            int dimes = amount % CENTS_IN_TOONIE / CENTS_IN_LOONIE / CENTS_IN_QUARTER / CENTS_IN_DIME;
            int nickels = amount %  CENTS_IN_TOONIE / CENTS_IN_LOONIE / CENTS_IN_QUARTER / CENTS_IN_DIME / CENTS_IN_NICKEL;
            int pennies = amount % CENTS_IN_NICKEL;
            System.out.println(
        }
}
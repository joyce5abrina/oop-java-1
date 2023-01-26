import java.time.LocalDate;

public class DataTypes {
    public static void main(String [] args) {
        //whole numbers

        byte theByte = -128;
        short theShort = -8989;
        int theInt = 787838334;
        long theLong = 7878383342L;


        // middle decimal numbers

        float theFloat = 3.14F;
        double theDouble = 3.1415;


        boolean isAdult = false;
        boolean isTeen = true;

        char nameInitial = 'A';

        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(theFloat);
        System.out.println(theDouble);
        System.out.println(isAdult);
        System.out.println(isTeen);
        System.out.println(nameInitial);


// reference Types
        // references type always needs to start with Upper Case;
        String name = new String("AmigosCode");
        System.out.println(name);
// if we print (name.toUpperCase()); everything on the code will be in upper case. so the output is gonna be AMIGOSCODE;


        // If you want to know the current date now, you print like this:
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // you also can print to get the month using this:

        System.out.println(now.getMonth());


        // Primitive and Reference Types differences

        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a + "  - b " + b);

// somewhere in the memory of computer we have something that stores in our computer;


        Person alex = new Person(name = "alex");
        Person mariam = alex;

        alex.name = "Alexander";

        System.out.println("Before changing alex");
        System.out.println(alex.name + " " + mariam.name);
    }
        static class Person {
            String name;
            Person(String name) {

            }

            // Naming variables
// you should name your variables in a way that make sense
            int number = 0;
            double pi = 2.1415;


            // You should name your variable acordlly;

            //
            int subscriberCount = 1_000_000;
            // variables never starts with upper Case;
            // should always starts with lower case and the second word starts with Upper case.
            int subscriberCountForAmigoscode = 1_000_000;


            // The String Class

            public class Main {
                public static void main(String[] args) {

                    String name = new String("Joyce Sabrina");
                    System.out.println(name.toUpperCase());

                }


            }

            



            //
        }

    }

package Week8.java;

public class Arrays {
    public static void main(String[] args){
        //Exercise 8.2.1
        //For each of the following, declare an array with an appropriate name and type and allocate an appropriate amount of storage.

        //
        //a list of grades for 100 courses (double [] grades = new double [100];)
        //a list of 10 names
        //a list of 50 temperatures
        //a list of birth years for 25 club members
        //a list of 200 product IDs (product IDs can include digits, letters, and the dash (-))
        //a list that keeps track of the numbers of students in 5 different classes (e.g. class 1 has x students, class 2 has y students, etc)
        double [] grades = new double [100];
        String [] names = new String[10];
        double [] temperature = new double[50];
        int []  birthOfYears = new int[25];
        String[] productsIds = new String[200];
        int []  numberOfStudents = new int[5];

        // Exercise 8.2.2
        //Fill in the elements for the values[] array (it has 10 elements) as
        // the following code executes:
        //
        int[] values = new int[10];
       int counter = 1;
        values[0] = 10;
        values[counter] = counter;
        counter++;
        values[5] = counter;
        values[9] = values[5] + counter;
        values[counter] = values[9] - values[1];
        values[9] += ++counter;
        for( int i = 0; i < values.length; i++) {
            System.out.printf("%3d", values[1]);

            // CAREFUL
            for( int i1 = 0; i < values.length; i1++) {
                System.out.printf("%3d", values[1]);
        }
        //Array: values[10]
            // Exercise 8.2.3
            //Write the code to display the values[] array (
            // from the previous exercise) backwards.
           /* int[] values2 new int[7];
            int counter2 = 1;
            values2 [0] = 7;
            values2[counter2] = counter2;
            counter2++;
            values2[5] = counter2;
            values2[9] = values[5] + counter2;
            values2[counter2] = values[9] - values[1];
            values[9] += counter2;
           // for(int i1 = 0; i1 < values2.length - 1;  i1 >= 0; i--){
              // System.out.println(values2[1]);
              */


            // Exercise 8.2.4
            //Record 10 integer values from the user and store them in an array.
            int intValues[] = new int[10];




            // After recording the 10 values, calculate and display:
            //
            //The average / como calcula o average?
            //The highest value
            //The lowest value
            }


    }
}

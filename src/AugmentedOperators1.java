
//Examine the code listing below. What do you think the output should be? Write this down.
// Then run the program and see if you're correct.
public class AugmentedOperators1{

    public static void main(String[] args){

        int factor = 2;
        int sum = 10;
        System.out.println("sum is " + sum);
        sum *= factor; //
        System.out.println("sum is now " + sum);
        sum *= factor;
        System.out.println("sum is now " + sum);
        sum *= factor;
        System.out.println("sum is now " + sum);

        //Determine, without coding a program, the output of the following code segment:

        int counter = 1;
        int increment = 2;
        System.out.print(counter + " ");
        counter += increment;
        System.out.print(counter + " ");
        counter *= increment;
        System.out.print(counter + " ");
        increment /= 2;
        counter -= increment;
        System.out.println(counter);
        System.out.println("increment: " + increment);


    }
}



// what happened?
// sun is: 10
// sun is: 20
// sum is: 40
//sum is: 80





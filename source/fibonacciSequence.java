import java.util.Scanner;

/******
 *
 * Created by Cesar J. Robinson (crobin21) on 2/20/2015.
 *
 * Fibonacci Sequence - Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number
 *
 *****/


public class fibonacciSequence {
    public static int numberOf;

    public static void main(String[] args) {

        System.out.println("Enter the number up to which you want to calculate the Fibonacci sequence (i.e. 10, will show the first 10 numbers of the sequence): ");

        do {
            Scanner input = new Scanner(System.in);
            numberOf = input.nextInt();
            if (numberOf < 0) {
                System.out.println("Please, provide a positive number!!");
                System.out.println("Enter the number up to which you want to calculate the Fibonacci sequence (i.e. 10, will show the first 10 numbers of the sequence): ");
            } else if (numberOf == 0) {
                System.out.println("The fibonacci sequence is 0");
            }
        } while (numberOf < 0);
        if(numberOf>0){
        System.out.println("The fibonacci sequence up to number " + numberOf + " is: ");
        for (int i = 1; i <= numberOf; i++) {

            System.out.print(fibonacciSeq(i)+" ");
        }
        }
    }


    static int fibonacciSeq(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacciSeq(number - 1) + fibonacciSeq(number - 2);
    }
}

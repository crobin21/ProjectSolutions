import java.util.Scanner;

/**
 * Created by crobin21 on 3/6/2015.
 * Prime Factorization - Have the user enter a number and find all Prime Factors (if there are any) and display them.
 */

public class primeFactorization {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input positive number for which you want to get the prime factors: ");
        int n=input.nextInt();
        do {
            if(n<1) {
                System.out.print("You did not type a positive number, please try again: ");
                n = input.nextInt();
            }
        }while (n<1);
    }

    public int primeFactors(int n){

        int numerator;
        while(numerator!=0)

    }
}
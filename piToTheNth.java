/*****
 *      Created by: Cesar Robinson on 02/20/2015
 *****/

import java.util.Scanner;

public class piToTheNth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, give me the exponent you want to raise pi to: ");
        int nthDigit=input.nextInt();
        double result=Math.pow(Math.PI,nthDigit);
        switch(nthDigit){
            case (1):
                System.out.print("The result of pi elevated to the "+nthDigit+"st exponent is: "+result);
                break;
            case (2):
                System.out.print("The result of pi elevated to the "+nthDigit+"nd exponent is: "+result);
                break;
            case (3):
                System.out.print("The result of pi elevated to the "+nthDigit+"rd exponent is: "+result);
                break;
            default:
            System.out.print("The result of pi elevated to the "+nthDigit+"th exponent is: "+result);
        }

    }
}

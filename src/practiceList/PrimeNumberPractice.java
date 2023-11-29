package practiceList;

import java.util.Scanner;

import static java.lang.Math.round;

public class PrimeNumberPractice {
    public static void main(String[] args) {
        //Check if an input from a user is prime or not

        primeCheck();

    }

    public static void primeCheck(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a number here: ");
        int m =sc.nextInt();

        if (m<=0){
            System.out.println("This is a Zero (0) OR a negative number");
        }else if(m==1){
            System.out.println("1 is NOT a prime Number");
        }else if(m%2==0){
            System.out.println("This is an even number; Hence NOT a Prime!!");
        }else if(!(m%2==0)){
            int n=round(m/2);
            System.out.println(n);
            for (int i=n;i>=3;i--){
                //System.out.println(i);
                if(!(m%i==0)){
                    System.out.println("This is a Prime Number!! Yahoo!");
                } else{
                    System.out.println("This is NOT a Prime Number!! Dude!!");
                }

            }


        }else{

        }


    }
}

package practiceList;


//import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class SumOfAllIntegerInArray {
    public static void main(String[] args) {

        int a[]= {84,2,54, 7,1, 9,11};
        int sum=0;

        for (int i: a) {
            sum=sum+i;


        }
        System.out.println(sum);

        //Second Largest Number in Array

        for (int i: a) {
            System.out.println(i);


        }

        Arrays.sort(a);
        for (int i: a) {
            System.out.println(i);


        }
        System.out.println(a.length);
        System.out.println(a[5]);
    }




}

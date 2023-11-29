package practiceList;

import java.util.Arrays;

public class SortArrayPractice {
    public static void main(String[] args) {
        int a[]= {3,9,1,205,43,9};

        System.out.println(a.length);

        for (int i: a){
            System.out.println(i);

        }

        Arrays.sort(a);
        for (int i: a){
            System.out.println(i);

        }
    }
}

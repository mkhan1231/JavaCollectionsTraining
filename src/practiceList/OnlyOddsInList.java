package practiceList;

import java.util.ArrayList;
import java.util.Iterator;

public class OnlyOddsInList {
    public static void main(String[] args) {

        System.out.println(oddCheck());

    }

    public static boolean oddCheck(){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(74);
        ar.add(77);
        ar.add(79);
        ar.add(73);
        ar.add(71);
        System.out.println(ar);
       for (int i: ar){
           if (i/2==0){
               return false;
           }

       }

        return true;

    }
}

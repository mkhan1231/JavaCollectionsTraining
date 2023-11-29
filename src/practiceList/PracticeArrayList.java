package practiceList;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class PracticeArrayList {

    public static void main(String[] args) {
        Random r=new Random();
        int randInt=r.nextInt(1000);
        System.out.println(randInt);


        ArrayList <Integer> ar = new ArrayList<Integer>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        ar.add(50);
        ar.add(60);

        System.out.println(ar.size());

        Iterator i= ar.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println(ar.indexOf(20));
        //ar.remove (2);
        for (int j=0;j<=ar.size();j++){
            System.out.println(ar.get(j));
        }




    }
}

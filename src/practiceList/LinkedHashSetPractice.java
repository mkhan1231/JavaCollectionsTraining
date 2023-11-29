package practiceList;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main(String[] args) {

        //Collection Interface---> Set---> HashSet & LinkedHashSet
        //HashSet duplicates are not allowed & Insertion Order are not present
        //LinkedHashSet duplicates are not allowed but Insertion Order is Present
        //Both follows Hashtable concepts but LinkedHashSet used Linked List DS additionally
        //initial sizes and load factors are same 16 and 75%

        LinkedHashSet lh=new LinkedHashSet();
        lh.add(2);
        lh.add("topu");
        lh.add('B');
        lh.add(false);
        lh.add(2);//Duplicates are NOT allowed

        System.out.println(lh);
        System.out.println("Using For Each Loop traversing the values/object:");
        for(Object i: lh){
            System.out.println(i);
        }

        System.out.println("Using Iterator traversing the values/object:");
        Iterator iterator=lh.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}

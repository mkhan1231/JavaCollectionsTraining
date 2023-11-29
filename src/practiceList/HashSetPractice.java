package practiceList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    public static void main(String[] args) {

        HashSet hs=new HashSet();
        //Initial size of sixteen allocation when created
        // Load factor Or Fill ratio: 0.75
        //In case of HashSet, when the allocation reaches to 75% of the 16th place, its going to create new Object size HashSet.
        HashSet hs1=new HashSet(100);//Initial capacity of 100 allocation
        HashSet hs2=new HashSet(100,(float) .95);//Initial capacity of 100 allocation and load Factor is 95%
        HashSet<Integer> hs3= new HashSet<Integer>();//If we want to save only integer number object in the Hashset


        //Difference between ArrayList and HashSet
        ArrayList ar =new ArrayList();
        //Initial size of Ten allocation when created. If you want to add a new element in the arraylist for example 11th
        //it will create a new block and copy the old elements to the new bigger allocation and the old allocation of 10 size will be going to Garbage collector.

        //add(), addAll(), remove(), removeAll(), contains(), containsAll(), isEmpty(), For Each Loop, Iterator
        HashSet hsDemo=new HashSet();

        //Add objects/Elements to the HshSet
        hsDemo.add(100);
        hsDemo.add("welcome");
        hsDemo.add(16.4);
        hsDemo.add('A');
        hsDemo.add(true);
        hsDemo.add(null);

        System.out.println(hsDemo); //Printed as random order/ insertion order is not preserved

        hsDemo.remove(16.4);
        System.out.println(hsDemo);//After removing the element

        System.out.println(hsDemo.contains('A')); //To check if the Hashset contains a value
        System.out.println(hsDemo.isEmpty());

        //FOr each Loop to get all the elements
        for(Object i: hsDemo){
            System.out.println(i);
        }

        //Iterator Method

        Iterator iterator =hsDemo.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashSet<Integer> evenNumber= new HashSet<Integer>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: "+ evenNumber);

        //Add all and remove all methods
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.addAll(evenNumber);//Adding all the numbers from the previous even number object
        numbers.add(10);
        numbers.add(12);
        System.out.println("New Hashset: "+ numbers);

        numbers.removeAll(evenNumber);
        System.out.println(" After removing all numbers from evenNumber :"+numbers);


        //Mathematical Operations on HashSet Union/Intersection & Difference
        HashSet<Integer> set1= new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("Hashset 1 :"+set1);

        HashSet<Integer> set2= new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(6);

        System.out.println("Hashset 2 :"+set2);

        //Union
        set1.addAll(set2);
        System.out.println("Union :"+set1);

        //Intersection
        set1.retainAll(set2);
        System.out.println("Intersection Elements :" +set1);

        //Difference
        set1.removeAll(set2);
        System.out.println("Difference :"+set1);







    }
}

//Duplicates are not allowed
//THere is NO insertion order, hence there is no concept of Index
//It uses Hashcode, so that searching of element is quick
//Heterogeneous Data is allowed
//Nulls are supported
//If searching is more required, go for Hash set
//HashSet and LinkedHashSet are child classes of Collection Interface
//Sorting and Shuffling is not directly sor it. We need to convert HashSet to ArrayList and then Sort


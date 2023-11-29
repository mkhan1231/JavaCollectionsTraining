package practiceList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {

        LinkedList<String> ls=new LinkedList<String>();
        ls.add("anna");
        ls.add("mouly");
        ls.add("reida");
        ls.add("lizzy");
        ls.add("hale");

        System.out.println(ls.size());

        Iterator iterator =ls.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(ls.indexOf("anna"));

        ls.remove("lizzy");
        System.out.println(ls);


    }
}

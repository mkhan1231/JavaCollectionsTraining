package practiceList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PracticeHashMap {
    public static void main(String[] args) {

        //HashMap<Integer, String> mp = new HashMap<Integer, String>();
        Map mp = new HashMap<>();

        mp.put(101, "Mala");
        mp.put(102, "Neela");
        mp.put(103, "Tareq");
        mp.put(104, "Topu");
        mp.put(105, "Tili");
        mp.put(106, "Munia");
        mp.put(107, "Moutushi");
        mp.put(108, "xyz");

        System.out.println(mp);
        System.out.println(mp.get(107));
        System.out.println(mp.get("Topu"));
        mp.remove(108);
        mp.replace(107,"Shornomoni");
        System.out.println(mp);
        System.out.println(mp.containsKey(107));//true
        System.out.println(mp.containsKey(110));//false

        System.out.println(mp.containsValue("Mala"));//true
        System.out.println(mp.containsValue("pqr"));//false

        System.out.println(mp.isEmpty());//false

        System.out.println(mp.keySet());//returns keys as a set format
        System.out.println(mp.values()); //returns Values as a collection as
        System.out.println(mp.entrySet()); //get all entries as a set- return type is a set

        //Entry level

        Iterator iterator = mp.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("OR");

        for(Object i:mp.keySet()){
            System.out.println(i);

        }

        Iterator iterator1 = mp.values().iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("OR");

        for(Object i:mp.values()){
            System.out.println(i);
        }

        System.out.println("-----");
        Iterator iterator2=mp.entrySet().iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());

        }




        System.out.println("---000");
        for(Object i :mp.entrySet()){
            System.out.println(i);
        }

        for(Object i:mp.keySet()){
            System.out.println(i+" : "+mp.get(i));

        }

        for(Object i:mp.values()){
            System.out.println(i+ " "+mp.get(i));

        }

        String a ="shop";
        String b="";

        for (int i=a.length()-1;i>=0; i--){
            b=b+a.charAt(i);
        }
        System.out.println(b);
    }
}

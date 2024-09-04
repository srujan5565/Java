import java.util.*;

public class coll_fra {
public static void main(String[] args) {
    /*
        Vector<Integer> vec=new Vector();
        Vector<Integer> vec2=new Vector();
        vec.add(1);
        vec.add(2);
        vec2.add(11);
        vec2.add(21);
        System.out.println(vec);
        vec.addAll(1,vec2);
        System.out.println(vec);
        System.out.println(vec.capacity());
        System.out.println(vec.contains(2));
        System.out.println(vec2.contains(2));
        System.out.println(vec2.indexOf(2));
        System.out.println(vec.elementAt(2));
        System.out.println(vec.get(2));
        System.out.println(vec.remove(2));
        System.out.println(vec.isEmpty());
        System.out.println(vec.toArray());
        */

        //counting the frequency of each character 
        
         Hashtable <Character,Integer> h=new Hashtable();
        String s=new String("Hello Hai");
        char chars[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        h.put(chars[i],0);
        for(int i=0;i<s.length();i++)
        {
            h.put(chars[i],h.get(chars[i])+1);
        }
        //Can also use Collections.frequency(arr,arr.get(i));
        System.out.println(h);
        
        //  List<Integer> li=new ArrayList<Integer>();
        //  ArrayList<Integer> ali=new ArrayList<Integer>();
        // li.add(1);
        // li.add(8);
        // ali.add(7);
        // ali.add(6);
        // ali.addAll(1,li);
        
    }
}

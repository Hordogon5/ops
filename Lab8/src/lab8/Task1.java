
package lab8;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("watermelon");
        set.add("banana");
        set.add("cherry");
        set.add("pear");
        set.add("melon");
        set.add("blackberry");
        set.add("ginseng");
        set.add("strawberry");
        set.add("iris");
        set.add("potato");
        Iterator<String> itr= set.iterator();
        while (itr.hasNext()){
            String text=itr.next();
            System.out.println(text);    
        }    
    }   
}

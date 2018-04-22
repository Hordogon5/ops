
package lab8;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        
        Cat[] cats = new Cat[10];
        String[] names = new String[] {"Felix", "Vaska", "Tom", "Barsik", "Sam", "Linda", "Murka", "Musya", "Serik", "Orange"};
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        for (int i=0; i<10; i++) {
            cats[i] = new Cat(names[i]);
            map.put(cats[i].name, cats[i]);
        }
        Iterator<Map.Entry<String, Cat>> itr=map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Cat> pair=itr.next();
            System.out.println(pair.getKey() + "-" + pair.getValue());        
        }
    }    
}


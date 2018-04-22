
package lab8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("watermelon","berry");
        map.put("banana", "grass");
        map.put("cherry", "berry");
        map.put("pear", "fruct");
        map.put("melon", "vegetable");
        map.put("blackberry", "bush");
        map.put("ginseng", "root");
        map.put("strawberry", "berry");
        map.put("iris", "flower");
        map.put("potato", "tuber");
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, String> pair = itr.next();
            String key=pair.getKey();           
            String value=pair.getValue();       
            System.out.println(key+"-"+value);
        }
    }
}

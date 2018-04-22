
package lab8;

import java.util.*;

public class Task6 {
    public static void main(String[] args) throws Exception
    {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Cat", "black");
        map.put("Dog", "Reks");
        map.put("Mouse", 1);
        map.put("Horse", 10.5);
        map.put("People", "woman");
        map.put("Event", true);
        map.put("Food", "salad");
        map.put("Drink", "juice");
        map.put("Time", 8);
        map.entrySet().forEach((pair) -> {
            String key=pair.getKey();
            Object value=pair.getValue();
            System.out.println(key + "-" + value);
        });    
    }
}

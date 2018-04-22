
package lab8;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 1; i <= 10; i++)
            map.put("key"+ i,"value");
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, String> pair = itr.next();
            String key = pair.getKey();            
            System.out.println(key);
        }
    }  
}

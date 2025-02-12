package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo101 {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("Ram",101);
        map.put("Krishna",102);
        map.put("Shyama",103);
        map.put("domodhara",104);
        for (Map.Entry<String,Integer> linkedMap:map.entrySet()){
            System.out.println(linkedMap.getKey()+":"+linkedMap.getValue());
        }
    }
}

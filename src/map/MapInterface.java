package map;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Shri");
        map.put(2,"sara");
        map.put(3,"rachit");
        map.put(4,"abhi");
        map.put(5,"sidda");
        System.out.println("Map is: "+map);
        System.out.println("Value at key"+map.keySet()+",   "+map.get(5));
    }
}

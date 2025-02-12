package treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Creating a TreeMap (sorted by keys)
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Inserting key-value pairs
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(4, "Mango");
        treeMap.put(2, "Orange");

        // Displaying the TreeMap (Keys are sorted automatically)
        System.out.println("TreeMap: " + treeMap);

        // Getting a value by key
        System.out.println("Value for key 2: " + treeMap.get(2));

        // Removing an entry
        treeMap.remove(3);
        System.out.println("After removing key 3: " + treeMap);

        // Iterating over the TreeMap (ascending order by default)
        System.out.println("Iterating on Tree map");

        for (Map.Entry<Integer, String> entry: treeMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("Getting first: "+treeMap.firstEntry());
        System.out.println("Getting last: "+treeMap.lastEntry());

        System.out.println("To Get SubMap: "+treeMap.subMap(1,3));
    }
}

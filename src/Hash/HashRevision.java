package Hash;
import java.util.*;

public class HashRevision {

    public static void main(String[] args) {

        basicHashMapMethods();
        basicHashSetMethods();
        basicHashtableExample();
    }

    //  Basic HashMap Methods
    public static void basicHashMapMethods() {

        System.out.println("---- HashMap Basic Methods ----");

        HashMap<Integer, String> map = new HashMap<>();

        // put(key, value) → insert or update
        map.put(1, "A");
        map.put(2, "B");

        // get(key) → returns value
        System.out.println("Value of key 1: " + map.get(1));

        // containsKey(key) → checks if key exists
        System.out.println("Contains key 2? " + map.containsKey(2));

        // remove(key) → deletes entry
        map.remove(2);

        // size() → number of entries
        System.out.println("Size: " + map.size());

        // keySet() → iterate over keys
        for(Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // values() → iterate over values
        for(String value : map.values()) {
            System.out.println("Value: " + value);
        }

        // entrySet() → iterate key + value
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
    }



    //  HashSet Basic Methods
    public static void basicHashSetMethods() {

        System.out.println("---- HashSet Basic Methods ----");

        HashSet<Integer> set = new HashSet<>();

        // add(value) → insert element
        set.add(10);
        set.add(20);
        set.add(10);  // duplicate ignored

        // contains(value) → check existence
        System.out.println("Contains 10? " + set.contains(10));

        // remove(value)
        set.remove(20);

        // size()
        System.out.println("Set size: " + set.size());

        // iterate
        for(int num : set) {
            System.out.println("Element: " + num);
        }

        System.out.println();
    }

    //  Hashtable Example
    public static void basicHashtableExample() {

        System.out.println("---- Hashtable Example ----");

        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "X");
        table.put(2, "Y");

        System.out.println("Value of key 1: " + table.get(1));

        // Hashtable does NOT allow null key or value
        // table.put(null, "Z");  // ❌ throws NullPointerException

        System.out.println("Hashtable size: " + table.size());

        System.out.println();
    }
}

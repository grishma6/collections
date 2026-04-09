import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        // ADD
        map.put("apple", 1);        // adds key-value pair
        map.putIfAbsent("apple", 2); // only adds if key doesn't exist

        // GET
        map.get("apple");            // returns 1
        map.getOrDefault("mango", 0); // returns 0 if key not found

        // REMOVE
        map.remove("apple");         // removes by key
        map.remove("apple", 1);      // removes only if key=apple AND value=1

        // CHECK
        map.containsKey("apple");    // true
        map.containsValue(1);        // true
        map.isEmpty();               // false
        map.size();                  // 1

        // UPDATE
        map.replace("apple", 5);     // replaces value for existing key

    }
}

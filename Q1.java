import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        //We're using a hashmap because of it's O(1) lookup time complexity.
        //locations of the accident and time
        HashMap<String,String> pair = new HashMap<>();
        //create places with time
        pair.put("London" , "3:45pm");
        pair.put("Atlanta", "12:27am");
        pair.put("LosAngeles", "12:45pm");
        //we can access each location with .get()
        System.out.println("Example: "+ pair.get("London"));
        System.out.println("Example: "+ pair.get("Atlanta"));
        System.out.println("Example: " +pair.get("LosAngeles"));
    }
}

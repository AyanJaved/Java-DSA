import java.util.*;
public class _127hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India",150);
        hm.put("China",100);
        hm.put("US",50);
        //get
        int pop = hm.get("India");
        System.out.println(pop);
        System.out.println(hm.get("Indonesia"));
        // contains
        System.out.println(hm.containsKey("America"));
        // remove
        hm.remove("US");
        // size
        System.out.println(hm.size());
        // check for empty
        System.out.println(hm.isEmpty());
        // clear
        hm.clear();
    }
}

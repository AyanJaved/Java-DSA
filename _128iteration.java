import java.util.*;
public class _128iteration {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Pakistan",95);
        hm.put("America",10);
        hm.put("Nepal",15);

        // Iteration
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("keys : "+k+", value : "+hm.get(k));
        }
    }
}

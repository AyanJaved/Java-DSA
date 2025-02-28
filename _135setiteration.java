import java.util.*;
public class _135setiteration {
    public static void main(String[] args) {
        HashSet<String> cities =new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Noida");
        Iterator it= cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // for-Each loop
        for(String s : cities){
            System.out.println(s);
        }
    }
}

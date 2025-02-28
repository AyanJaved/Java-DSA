import java.util.*;
public class _130linkedHmap {
    public static void main(String arg[]){
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();
        lhm.put("China",110);
        lhm.put("India",100);
        lhm.put("US",90);
        System.out.print(lhm);
    }
}

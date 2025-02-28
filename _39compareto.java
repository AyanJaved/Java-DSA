import java.util.*;
public class _39compareto {
    public static void main(String[] args) {
        String fruits[]={ "apple","mango","banana"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if (largest.compareTo(fruits[i])<0){//compareToignorecase() => this is used to ignore the uppercase lowercase
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}

import java.util.*;
public class _42bitoddeven {
    public static void oddoreven(int n){
        int bitmask=1;
        if ((n & bitmask)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
    public static void main(String[] args) {
        oddoreven(3);
        oddoreven(14);
        oddoreven(13);
    }
}

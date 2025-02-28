import java.util.*;
public class _9prime {
    public static boolean prime(int n){
        if ( n ==  2){
            return true;
        }
         for ( int i = 2 ; i <= n-1 ; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check Prime or not : ");
        int b = sc.nextInt();
        //advanced method
        System.out.println( prime(b) );
        // normal method
        // int i=1;
        // for ( i = 1 ; i <= b ; i++){
        //     if (b%i==0){
        //         count++;
        //     }
        // }
        // if (count == 2){
        // System.out.println("Number is prime : " + b);
        // }
        // else {
        //     System.out.println(" Not a prime nuber : " + b);
        // }
        sc.close();

    }   
}

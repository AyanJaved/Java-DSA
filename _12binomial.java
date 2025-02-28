import java.util.*;
public class _12binomial {
    public static int fact(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f *= i;
        }
        return f;
    }
    public static float binomial( int n, int r){
    int f1 = fact(n);
    int f2 = fact(r);
    int f3 = fact(n-r);
    float binomial = (float) f1/(f2*f3);
    return binomial;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter Value of r : ");
        int r = sc.nextInt();
        float x = binomial( n , r );
        System.out.println("Binomial is : " + x);
        sc.close();
    }   
}

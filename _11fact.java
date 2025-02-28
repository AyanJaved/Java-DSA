import java.util.*;
public class _11fact {
    public static int fact(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f *= i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Get a Factorial : ");
        int n = sc.nextInt();
        int f = fact(n);
        System.out.println("factorial is : " + f);
        sc.close();
    }    
}

import java.util.*;
public class _13primerange {
  public static boolean prime(int n){
        if ( n ==  2){
            return true;
        }
        for ( int i = 2 ; i <= Math.sqrt(n) ; i++){ //Math.sqrt(n) will find sq. root only . 
            if (n%i==0){
                return false;
                }
            }
        return true;
        }
    public static void primeinrange(int n){
        for (int i = 2 ; i<=n ; i++ ){
            if ( prime(i) ){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check Prime or not : ");
        int b = sc.nextInt();
        primeinrange(b);
        System.out.println( prime(b) );
        sc.close();
        }   
    }


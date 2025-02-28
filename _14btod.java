import java.util.*;
public class _14btod {
    public static int bintodeci(int x){
        int decimal = 0;
        int pow =0;
        while (x>0){
        int ld  = x % 10;
        decimal = decimal + (int) ( ld * Math.pow(2,pow) );
        pow++;
        x /= 10;
        }
        return decimal;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number :");
        int x = sc.nextInt();
        System.out.println(" The Decimal of  " + x + "  is : \t" + bintodeci(x));
        sc.close();
    } 
}

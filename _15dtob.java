import java.util.*;
public class _15dtob {
    public static int DecitoBin( int decimal){
        int pow = 0;
        int binary = 0;
        while(decimal>0){
            int rem = decimal%2;
            binary = binary + (int) (rem * Math.pow(10,pow));
            pow++;
            decimal=decimal/2;     
            }
        return binary;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a binary number :");
       int decimal = sc.nextInt();
       System.out.println("The Binary of " + decimal + " = " + DecitoBin(decimal)); 
       sc.close();
    }
    
}

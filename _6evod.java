import java.util.*;
public class _6evod {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter value to be checked :");
        // int x = sc.nextInt();
        // if (x%2==0){
        //     System.out.println("even");
        // }
        // else {
        //     System.out.println("odd");
        // }
        System.out.println("enter income");
        int income = sc.nextInt();
        float tax;
        if ( income<500000){
            System.out.println("No Need to pay TAX");
        }
        else if(income >= 500000 && income<1000000){
            tax = (float) (0.20f*income);
            System.out.println("Tax to be paid :\t" + tax);
        }
        else{
            tax =(float) 0.30f*income;
            System.out.println("Tax to be paid :\t " + tax);
        }
        sc.close();
    }
    
}

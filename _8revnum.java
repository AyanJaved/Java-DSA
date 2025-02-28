import java.util.*;
public class _8revnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to be reversed :");
        int x = sc.nextInt();
        int rev = 0; 
        while( x > 0 ){
            int Lastdigit = x % 10;
            System.out.print("\t" + Lastdigit);
            x /= 10;
            //Storing the value in variable
            rev = (rev * 10) + Lastdigit;
         }
         System.out.println();
         System.out.println(rev);
         sc.close();
    }
    
}

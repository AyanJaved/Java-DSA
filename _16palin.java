import java.util.*;
public class _16palin {
    public static boolean palindrome(int numb){
        int reverse = 0;
        int palind = numb;
        while (palind != 0){
            int rem = palind % 10;
            reverse = reverse * 10 + rem;
            palind /= 10;
        }
        if (reverse == numb){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int numb = sc.nextInt();
        if (palindrome(numb)){
            System.out.println("A Palindrome");
        }
        else{
            System.out.println(" Not A Palindrome");
        }
        sc.close();
    }    
}

import java.util.*;
public class _4test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int avg =  ((num1 + num2 + num3)/3);
        System.out.println("The average is : " + avg);
        sc.close();
    }
}

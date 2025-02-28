import java.util.*;
public class _7calc {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Select \n 1 - sum \n 2 - sub \n 3 - mult \n 4 - div \n");
        int x = sc.nextInt();

        switch (x){
            case 1 : System.out.println(a+b);break;
            case 2 : System.out.println(a-b);break;
            case 3 : System.out.println(a*b);break;
            case 4 : System.out.println(a/b);break;
            default : System.out.println("Wrong input");break;
        }
        sc.close();
    }
    
}

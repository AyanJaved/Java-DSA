import java.util.*;
public class _18arrlinser {
    public static int linser(int number[],int key){
        for (int i=0; i < number.length ; i++){
            if ( number[i]==key ){
               return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={1,2,4,5,7,9,11,12,13,14,15};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to search in Array : ");
        int key = sc.nextInt();
        int index = linser(number,key);
        if (index == -1 ){
            System.out.println("Key not Found ");
        }
        else {
            System.out.println("Key Found at " + index);
        }
    }
    
}

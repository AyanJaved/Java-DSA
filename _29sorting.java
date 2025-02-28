import java.util.Collections;//reverse in built sorting
import java.util.Arrays;//inbuilt sorting
import java.util.*;
public class _29sorting {
    //bubble sort
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){//arr.length is for makinng algo optimal 
            for(int j=0;j<arr.length-1-i;j++){ // arr.length-1-i is for making algo optimal
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionsort(int arr[]){
        for(int i = 0 ; i<arr.length-1;i++){
            int minnum=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minnum]>arr[j]){
                    minnum=j;
                }
            }
            int temp = arr[minnum];
            arr[minnum]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionsort(int arr[]){
        for(int i = 1 ; i<arr.length;i++){//using prev so starting with 1 because prev = -1 not possible
            int curr =arr[i];
            int prev =i-1;
            while(prev>=0 && arr[prev]>curr ){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        count[arr[i]]++;
        int j=0;
        for(int i =0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //objectified Array
    public static void display(Integer arrobj[]){
        for(int i=0;i<arrobj.length;i++){
            System.out.print(arrobj[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        //Integer arrobj[]={5,4,1,3,2};
        //Arrays.sort(arrobj,Collections.reverseOrder());//uses array as object
        //Arrays.sort(arr);
        //bubblesort(arr);
        //selectionsort(arr);
        //insertionsort(arr);
        countingsort(arr);
        display(arr);
    }
    
}

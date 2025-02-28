import java.util.*;
public class _30array2d {
    //searching
    public static boolean search(int matrix[][],int key){
        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.print("Element found at "+i+" "+j+" ");
                    return true;
                }
            }
        }
        System.out.print("Element NOT found ");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]= new int[3][3];
        int n=matrix.length;// number of rows
        int m=matrix[0].length;//number of columns
        System.out.println("Enter Elements : ");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array elements are :");
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,5);
    }
}

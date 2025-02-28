public class _70backtrackarr {
    public static void changeArr(int arr[], int i,int val){
        if(i == arr.length){
            printArr(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr, i+1,val+1);// function call (recursion)
        arr[i]=arr[i]-2;// backtrack step
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<=arr.length-1; i++){ 
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= new int[5];
        changeArr(arr, 0,1);
        printArr(arr);
    }
}

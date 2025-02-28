public class _60recursion6 {
    // checks if array is sorted or not
    public static boolean check(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return check(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,7};
        System.out.print(check(arr,0));
    }
}

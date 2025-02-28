public class _61recursion7 {
    public static int firstOccurence(int arr[],int key, int i){
        if (i==arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }
    public static int lastOccurence(int arr[],int key, int i){
        if (i==arr.length){
            return -1;
        }
        int isfound = lastOccurence(arr,key,i+1);
        if(isfound == -1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        System.out.println(firstOccurence(arr,key,0));
        System.out.println(lastOccurence(arr,key,0));
    }
}
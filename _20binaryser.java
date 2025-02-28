public class _20binaryser {
    public static int binser(int number[],int key){
        int start = 0;
        int end = number.length - 1;
        while(start <= end){
            int mid = start + (end - start ) / 2; 
            if ( number[mid] == key){
                return mid;
            }
            if (number[mid] < key ){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={1,2,4,5,7,9,10,11,12,13,14};
        int key = 10;
        System.out.println("Key Found at " + binser(number,key));
    }
}

public class _19largsmall {
    public static int largsmall(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i < number.length ; i++){
            if ( number[i] > largest ){
               largest = number[i];
            }
            if ( number[i] < smallest ){
               smallest = number[i];
            }
        }
        System.out.println("Smallest number is : " + smallest);
        return largest;
    }
    public static void main(String args[]){
        int number[]={1,2,4,5,7,9,11,12,13,14,15};
        int largest = largsmall(number);
        System.out.println("Largest number is : " + largest);   
    } 
}

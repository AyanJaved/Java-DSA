public class _26kadanesum {
    public static void kadane(int number[]){
        int currsum=0;
        int negsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0 ; i<number.length ; i++){
            currsum += number[i];
            negsum += number[i];//if all the numbers are negative we will use this variable
            if(currsum<0){
                currsum=0;
            }
            maxsum = Math.max(currsum , maxsum );
        }
        if(maxsum==0){//if all the number aare negative
            System.out.println("Maximum sum is  : " + negsum);
        }
        else{
        System.out.println("Maximum sum is  : " + maxsum);
        }
    }
    public static void main(String args[]){
        int number[]= {-2,-3,-4,-1,-2,-1,-5,-3};
        kadane(number);
    }
}

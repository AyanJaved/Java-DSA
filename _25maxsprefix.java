

public class _25maxsprefix {
    public static void maxsumcalc(int number[]){
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length]; // its size is equal to previous array
        prefix[0]= number[0]; //zero index pe always zero wala number hoga
        for(int i = 1 ; i<prefix.length ; i++){
            prefix[i] = prefix[i-1] + number[i]; // sum of previous element and current element
        }
        for (int i = 0 ; i < number.length ; i++ ){
            int start = i;
            for (int j = i ; j < number.length; j++ ){
                int end = j;
                int currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                // here ternary operator shows that if value of start is 2 it will get the value at end
                if (maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum sum is  : " + maxsum);
    }
    public static void main(String args[]){
        int number[]= {2,4,6,8,10};
        maxsumcalc(number);
    }
}

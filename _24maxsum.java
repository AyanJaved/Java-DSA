public class _24maxsum {   
    public static void maxsumcalc(int number[]){
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0 ; i < number.length ; i++ ){
            //int start = i;
            for (int j = i ; j < number.length; j++ ){
                //int end = j;
                int currsum = 0;
                for (int k = i ; k<=j ; k++){
                    currsum += number[k];
                }
                //System.out.println(currsum);
                if (maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum sum is  : " + maxsum);
    }
    public static void main(String args[]){
        int number[]= {2,-4,6,-8,10};
        maxsumcalc(number);
    }
}

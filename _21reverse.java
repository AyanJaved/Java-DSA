public class _21reverse {
    public static void reverse(int number []){
        int first = 0, last =  number.length-1 ;
        while(first < last){
            int temp = number[last];
            number[last] = number[first];
            number[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int number[]={1,2,4,5,7,9,10,11,12,13,14};
        System.out.println( "Reversed array is : ");
        reverse(number);
        for (int i = 0; i < number.length; i++){ 
        System.out.print(number[i] + " ");
        }
    }    
}

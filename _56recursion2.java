public class _56recursion2 {
    
    public static void printdec(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printdec(n-1);
        System.out.print(n+" ");
        
   }
    public static void main(String[] args) {
        int n=10;
        printdec(n);
    }
}
    


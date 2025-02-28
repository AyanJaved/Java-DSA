public class _44pow2 {
    public static boolean pow2(int n){
        int bitmask = n&(n-1);
        if(bitmask==0){
            System.out.println("number is power of 2");
            return true;
        }
        else {
            System.out.println("number is not power of 2");
            return false;
        }
        //return n&(n-1)==0;
    }
    public static void main(String[] args) {
        pow2(16);
    }
}

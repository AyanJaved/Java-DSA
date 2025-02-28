public class _43ithbit {
    //get ith bit
    public static int ithbit(int n, int i){
        int bitmask = 1<<i;
        if ((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    //set ith bit
    public static int setithbit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    // clear ith bit
    public static int clearithbit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int update(int n , int i , int newbit){
        if (newbit==0){
            return clearithbit(n,i);
        }
        else{
            return setithbit(n,i);
        }
    }
    public static int clearithbits(int n , int i){
        int bitmask = ((~0)<<i);
        return n & bitmask;
    }
    public static int clearrange(int n, int i, int j){
        int a=((~0)<<(j+1));
        int b=((1<<i)-1);
        int bitmask = a|b;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(ithbit(10,2));
        System.out.println(setithbit(10,2));
        System.out.println(clearithbit(10,1));
        System.out.println(update(10,2,1));
        System.out.println(clearithbits(15,2));
        System.out.println(clearrange(10,2,4));
    }
}

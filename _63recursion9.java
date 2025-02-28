public class _63recursion9 {
    public static int tile(int n){
        if( n == 0 || n== 1){
            return 1;
        }
        int verticletiles = tile(n-1);
        int horizontalchoice = tile (n-2);
        int totalways = verticletiles + horizontalchoice;
        return totalways;
        // return tile(n-1) +  tile (n-2)
    }
    public static void main(String[] args) {
        System.out.println(tile(5));
    }
}

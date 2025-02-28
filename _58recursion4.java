public class _58recursion4 {
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        int sumn = n+sum(n-1);
        return sumn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.print(sum(n));
    }
}

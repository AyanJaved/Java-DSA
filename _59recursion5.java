public class _59recursion5 {
    public static int fib(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int fibo = fib(n-1)+fib(n-2);
        return fibo;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.print(fib(n));
    }
}

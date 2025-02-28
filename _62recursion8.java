public class _62recursion8 {
    public static int power(int x, int n){
        if (n==0){
            return 1;
        }
        return x *power(x,n-1);
    }
    public static int optimizedpower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimizedpower(x,n/2);
        int halfpowersq = halfpower * halfpower ;
        if(n% 2 != 0){
            halfpowersq = x * halfpowersq;
        }
        return halfpower;
    }
    public static void main(String[] args) {
        int x,n;
        System.out.println(power(2,3));
        System.out.println(optimizedpower(2,5));
    }
}

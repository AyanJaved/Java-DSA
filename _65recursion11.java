public class _65recursion11 {
    public static int friendspairing(int n){
        if(n==1 || n== 2){
            return n;
        }
        int fnm1= friendspairing(n-1);
        int fnm2= friendspairing(n-2);
        int pairways= (n-1)*fnm2;
        int totways= fnm1 + pairways;
        return totways;
        // return = friendspairing(n-1) + (n-1) * friendspairing(n-2)
    }
    public static void main(String[] args) {
        System.out.println(friendspairing(3));
    }
}

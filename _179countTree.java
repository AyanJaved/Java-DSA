public class _179countTree {
    public static int BSTcount(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                // left ways = dp[j]
                // right ways = dp[i-j-1]
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(BSTcount(n));
    }
}

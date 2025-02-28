public class _180MountainRanges {
    public static int MR(int n){
        int dp[]=new int[n+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                // inside dp[j] ways
                //outside dp[i-j-1] ways
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int pairs=3;
        System.out.println(MR(pairs));
    }
}

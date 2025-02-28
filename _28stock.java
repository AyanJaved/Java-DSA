public class _28stock {
    public static int stockcalc(int rate[]){
        int buypri=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0 ; i<rate.length; i++){
            if(buypri<rate[i]){
                int profit= rate[i]-buypri;
                maxprofit=Math.max(profit,maxprofit);
            }
            else{
                buypri=rate[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int rate[]={7,1,5,3,6,4};
        System.out.println(stockcalc(rate));
    }
}

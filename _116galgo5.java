import java.util.*;
public class _116galgo5 {
    public static void main(String[] args) {
        Integer currency[]={2000,500,100,50,20,10,5,2,1};
        Arrays.sort(currency,Comparator.reverseOrder());
        int val = 590;
        int countOfCoins  = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<currency.length;i++){
            if(currency[i]<=val){
                while(currency[i]<=val){
                    countOfCoins++;
                    ans.add(currency[i]);
                    val=val-currency[i];
                }
            }
        }
        System.out.println(countOfCoins);
        for(int i =0;i<ans.size();i++){
            System.out.println(ans.get(i) +" ");
        }
    }
}

import java.util.*;
public class _99maxhist {
    public static void maxarea(int height[]){
        int maxArea = 0;
        int nsr[] = new int[height.length];
        int nsl[] = new int[height.length];
        // next smaller Right
        Stack<Integer> s =new Stack<>();

        for(int i = height.length-1; i>=0 ; i--){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = height.length;
            } else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller Left
        s =new Stack<>(); // empty stack
        for(int i = 0; i<height.length ; i++){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = height.length;
            } else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // curr area
        for(int i = 0; i<height.length ; i++){
            int ht = height[i];
            int wt = nsr[i]-nsl[i]-1;
            int currArea = ht*wt;
            maxArea=Math.max(currArea,maxArea);
        }
        System.out.println(maxArea);
    }
    public static void main(String[] args) {
        int height[] = {2,1,5,6,2,3};
        maxarea(height);
    }
}

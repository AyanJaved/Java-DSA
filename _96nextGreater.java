import java.util.*;
public class _96nextGreater {

    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s =new Stack<>();
        int nextGreater[] = new int[arr.length];

        // next greater left
        // for(int i  = 0;i<arr.length;i+){ }
        for(int i = arr.length-1;i>=0;i--){
            //stack check
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){ 
                // smaller arr[s.peek()]>=arr[i]) change in loop
                s.pop();
            }

            // greater less then chach
            if(s.isEmpty()){
                nextGreater[i]=-1;
            } else{
                nextGreater[i] = arr[s.peek()];
            }
            //pushing in stack
            s.push(i);
        }
        for(int i = 0; i<nextGreater.length;i++){
            System.out.println(nextGreater[i]);
        }
    }
}

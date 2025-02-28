import java.util.*;
public class _104queue2s {
    static class Queue{
        static Stack<Integer> s1 =new Stack<>();
        static Stack<Integer> s2 =new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            //s1 element into s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            // pushing the main data
            s1.push(data);
            // again pushing back data to s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

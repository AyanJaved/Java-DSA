import java.util.*;
public class _111qdq {
    static class Queue{
        Deque<Integer> d = new LinkedList<>();
        public void add(int data){
            d.addLast(data);
        }
        public int remove(){
            return d.removeFirst();
        }
        public int peek(){
            return d.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue s= new Queue();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
    }
}


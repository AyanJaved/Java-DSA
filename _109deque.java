import java.util.*;

public class _109deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addLast(2);
        System.out.println(deque);
    }
}

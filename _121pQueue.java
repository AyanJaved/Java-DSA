import java.util.*;

public class _121pQueue {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name , int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
        PriorityQueue<Student> pq2 = new PriorityQueue<>();
        pq2.add(new Student("A",4));
        pq2.add(new Student("B",5));
        pq2.add(new Student("C",2));
        pq2.add(new Student("D",12));
        while(!pq2.isEmpty()){
            System.out.println(pq2.peek().name+" -> "+pq2.peek().rank);
            pq2.remove();
        }
    }
}

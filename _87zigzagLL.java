public class _87zigzagLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null ; 
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void printLL(){
        for(Node temp = head ; temp != null; temp = temp.next){
            System.out.print(temp.data + " ");
        }
    }
    public void zigZag(){
        // find mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null ){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left = head;
        Node right = prev;
        Node nextL,nextR;
        //alt merge - zig-zag merge
        while(left != null && right !=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right=nextR;
        }
    }
    public static void main(String[] args) {
        _87zigzagLL ll = new _87zigzagLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.zigZag();
        ll.printLL();
    }
}

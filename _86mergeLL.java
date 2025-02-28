public class _86mergeLL {
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
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null){
            if(head1.data<= head2.data){
                temp.next=head1;
                head1=head1.next;
                temp = temp.next;
            } else{
                temp.next = head2;
                head2= head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1=head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2= head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left & right half
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft =mergeSort(head);
        Node newRight = mergeSort(rightHead); 
        //merge
        return merge(newLeft,newRight );
    }
    public static void main(String[] args) {
        _86mergeLL ll = new _86mergeLL();
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.printLL();
        ll.head = ll.mergeSort(ll.head);
        ll.printLL();
    }
}

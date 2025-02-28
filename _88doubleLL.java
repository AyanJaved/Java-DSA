public class _88doubleLL {
    public class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        newNode.next = null;
        tail=newNode;
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head=head.next;
        head.prev = null;
        size--;
        return val;
    }
    public int removeLast(){
        if(head==null){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = tail.data;
        tail.prev.next = null;
        tail.prev=null;
        tail=tail.prev;
        size--;
        return val;
    }
    public void print(){
        for(Node temp = head; temp != null;temp=temp.next){
            System.out.print(temp.data + "<->");
        }
        System.out.println("null");
    }
    public void reverse(){
        Node curr=head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev = next;
            prev = curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        _88doubleLL dll = new _88doubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addlast(4);
        dll.print();
        dll.removeFirst();
        dll.removeLast();
        dll.print();
        System.out.println(size);
        dll.reverse();
        dll.print();
    }
}

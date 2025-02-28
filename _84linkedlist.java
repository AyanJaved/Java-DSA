public class _84linkedlist {
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

    public void addFirst(int data){
        // creating new node
        Node newNode = new Node(data);
        size++;
        // if the list is empty
        if(head==null){
            head=tail=newNode;
            return;
        }

        // pointing head at first
        newNode.next = head;
        head= newNode;
    }
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
        // Node temp = head;
        // while(temp!=null){
        //     System.out.println(temp.data + " ");
        //     temp = temp.next;
        // }
        for(Node temp = head ; temp != null; temp = temp.next){
            System.out.print(temp.data + " ");
        }
    }
    public void addMiddle(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for(int i = 0 ; i < index-1 ; temp = temp.next, i++){
            // this loop will take us to the node from where we will intiate the changes
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if(size ==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if(size ==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        for(int  i = 0 ; i< size-2 ; temp = temp.next ,i++){
            // this loop will take us yo our destiny
        }
        int val = tail.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }
    public int search(int key){
        int i =0;
        for(Node temp = head; temp != null ; temp = temp.next,i++){
            if(temp.data==key){
                return i;
            }
        }
        return -1;
    }
    public int helper(Node head , int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head , key);
    }
    public void reverse(){
        Node prev = null; 
        Node curr = tail = head;
        Node next;
        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev ;
    }
    public void deleteNthfromEnd(int n){
        int sz = 0;
        Node temp = head ;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
    public Node findMid(Node head){
        Node slow = head ;
        Node fast = head ;
        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // it will return middle
    }
    public boolean checkPalindrome(){
        // base case
        if(head == null || head.next == null){
            return true;
        }
        // finding middle
        Node midNode = findMid(head);
        // reversing
        Node prev = null;
        Node curr = midNode ; 
        Node after;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        Node right = prev ;
        Node left = head;
        while(right !=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCyle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast ){
                cycle = true;
                break;
            }
        }
        if(cycle == false ){
            return;
        }
        // find meeting point
        slow = head ;
        Node prev = null;
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle
        prev.next = null;
    }
    public static void main(String[] args) {
        // _84linkedlist ll = new _84linkedlist();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addLast(5);
        // ll.addMiddle(2, 6);
        // ll.printLL();
        // System.out.println("\n The size of the linked list is : " + ll.size);
        // ll.removeFirst();
        // ll.printLL();
        // ll.removeLast();
        // ll.printLL();
        // System.out.println(ll.search(5));
        // System.out.println(ll.search(6));
        // ll.reverse();
        // ll.printLL();
        // ll.deleteNthfromEnd(1);
        // ll.printLL();
        // palindrome
        // _84linkedlist ll2 = new _84linkedlist();
        // ll2.addLast(1);
        // ll2.addLast(2);
        // ll2.addLast(2);
        // ll2.addLast(1);
        // ll2.printLL();
        // System.out.println(ll2.checkPalindrome());
        //cycle
        // head =new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // System.out.println(isCycle());
        // removeCyle();
        // System.out.println(isCycle());
        
    }
}

public class Creation {
    public class Node{
        int data;
        Node next;
        public Node(int value){
            this.data =value;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail; 
        public static Node next;
        public static int size;  
    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addMidlle(int index, int data){
        if(index == 0 || head == null){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // public void Reverse(){
    //     Node prev = null;
    //     Node curr = head;
    //     Node next;
    //     while(curr!=null){
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     head = prev;

    // }
    Node reverse(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node temp = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }
    public void printLl(Node Head){
        if(Head == null){
            System.out.println("linkedlist is empty");
            return;
        }
        Node temp = Head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("null");
        // System.out.println(size);
    }
    public static void main(String args[]){
        Creation ll = new Creation();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addMidlle(2,4);
        ll.printLl(head);
        Node reverseHead = ll.reverse(head);
        ll.printLl(reverseHead);
        
    

    }
}
public class CircularSinglyLL {
    public class Node{
        int data;
        Node next;
        public Node(int value,Node next){
            this.data= value;
            this.next = next;
        }
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data,Node next){
        Node newNode = new Node(data,next);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;   
    }
    public void printLl(Node head){
        if(head == null){
            System.out.println("Lined list is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        CircularSinglyLL ll = new CircularSinglyLL();
        ll.addfirst(5,null);
        ll.addfirst(4,null);
        ll.addfirst(3,null);
        ll.addfirst(2,null);
        ll.addfirst(1,null);
        ll.printLl(head);

    }
}


















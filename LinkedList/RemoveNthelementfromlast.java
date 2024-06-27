public class RemoveNthelementfromlast {
    public class Node{
        int data;
        Node next;
        public Node(int value,Node next){
            this.data =value;
            this.next = next;
        }
    }
    public static Node head;
    public static Node tail; 
    public static int size;  
    public void addfirst(int data,Node next){
        Node newNode = new Node(data,next);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public Node Remove(Node head,int n){
        Node res = new Node(0,head);
        Node temp = res;
        for(int i =0 ;i<n;i++){
            head = head.next;
        }
        while(head!=null){
            head = head.next;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return res.next;
        

    }
    public void print(Node head){
        if(head == null){
            System.out.println("Null/ Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        RemoveNthelementfromlast rn = new RemoveNthelementfromlast();
        rn.addfirst(6,null);
        rn.addfirst(5,null);
        rn.addfirst(4,null);
        rn.addfirst(3,null);
        rn.addfirst(2,null);
        rn.addfirst(1,null);
        rn.print(head);
        Node newhead = rn.Remove(head,4);
        rn.print(newhead);


    }
}
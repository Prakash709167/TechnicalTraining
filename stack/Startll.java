public class Startll {
    public static void main(String args[]){
        Stack1 str = new Stack1();
        str.push(1);
        str.push(2);
        str.push(3);
        str.push(4);
        str.push(5);
        str.pop();
        str.pop();
        System.out.println(str.top());

    }
}
class Node{
    int data;
    Node next;
    Node(int val){
        this.data = val;
        this.next = null;
    }
}
class Stack1{
   
    Node head;
    Node tail;
    int size = 0;
    public void push(int n){
        Node newNode = new Node(n);
        size++;
       if(head==null){
        head = tail = newNode;
       }
       tail.next = newNode;
       tail = newNode;
    }
    public void pop(){
        if(size == 0){
            System.out.println("Stack is empty");
        }
        else if(size == 1){
            head=tail=null;
            size=0;
        }
        Node prev = head;
        for(int i = 0; i<size-2;i++){
            prev = prev.next;
        }
        prev.next = null;
        size--;
    }
    public int top(){
        if(size == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        if(size==1){
            return head.data;
        }
        Node temp = head;
        for(int i =0;i<size-1;i++){
            temp = temp.next;
        }
        int n = temp.data;
        return n;
      
    }

}
public class Demo {
    Stack1 st1 = new Stack1();
    Stack2 st2 = new Stack2(); // Corrected class name from 'stack2' to 'Stack2'
    public void enqueue(int n){
        if(st1.top()== -1){
            st1.push(n);
        }
        else if(st2.top()==-1){
            st2.push(n);
        }
        else {
            while(st2.top()!=-1){
                st1.push(st2.top());
                st2.pop();
            }
            st2.push(n);
            while(st1.top()!=-1){
                st2.push(st1.top());
                st1.pop();
            }
        }
    }
    public void dequeue(){
        if(st2.top()==-1){
            System.out.println("Queue is underflow");
        }
        else {
            st2.pop();
        }
    }
    public void printQueue(){
        Stack2 temp = new Stack2(); // Created a temporary stack to hold elements while printing
        while(st2.top()!=-1){
            temp.push(st2.top());
            st2.pop();
        }
        while(temp.top()!=-1){
            System.out.print(temp.top()+" | ");
            st2.push(temp.top());
            temp.pop();
        }
    }
    public static void main(String args[]){
        Demo Q = new Demo();
        Q.enqueue(1);
        Q.enqueue(2);
        Q.enqueue(3);
        Q.printQueue();        
    }
    
}
class Stack1{
    private int arr1[] = new int [100];
    int i =0,size=0;
    public void push(int n){
        arr1[i]= n;
        i++;
        size++;
    }
    public void pop(){
        i--;
        size--;
    }
    public int top(){
        if(i==0){
            System.out.println("Stack is underflow");
            return -1;
        }
        return arr1[i-1];
    }

}
class Stack2{
    private int arr2[] = new int [100];
    int i =0,size=0;
    public void push(int n){
        arr2[i]= n;
        i++;
        size++;
    }
    public void pop(){
        i--;
        size--;
    }
    public int top(){
        if(i==0){
            System.out.println("Stack is underflow");
            return -1;
        }
        return arr2[i-1];
    }

}
public class Start  {
    public static void main(String args[]){
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(4);
        st.pop();
        st.push(3);
        // System.out.println(st.top());
        st.pop();
        System.out.println(st.top());  
        // System.out.println(size);
        st.push(3);
        st.push(4);
        System.out.println(st.size);      
    }
   
}
class Stack{
    private int arr[] = new int [100];
    int i =0,size=0;

    public void push(int n){
        arr[i] = n;
        i++;
        size++;
    }
    public void pop(){
        i--;
        size--;
    }
    public int top(){
        if(i<0){
            System.out.println("Stack is underflow");
            return -1;
        }
        return arr[i-1];
    }

}
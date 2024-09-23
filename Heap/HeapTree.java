import java.util.*;
public class HeapTree {
    ArrayList<Integer> list = new ArrayList<>();
    public void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
    }
    public void Insert(int val){
        list.add(val);
        upheapyfy(list.size()-1);
    }
    public void upheapyfy(int idx){
        if(idx == 0){
            return;
        }
        int pi = (idx -1)/2;
        if(list.get(pi)>list.get(idx)){
            swap(list.get(pi),list.get(idx));
            upheapyfy(pi);
        }
    }
    void Print(){
        for(int i =0;i<=list.size()-1;i++){
            System.out.print(list.get(i)+" | ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        HeapTree ht = new HeapTree();
        ht.Insert(1);
        ht.Insert(2);
        ht.Insert(3);
        ht.Insert(4);
        ht.Insert(5);
        ht.Print();
        
    }
}
public class InsertionRecursiveSort {
    public static void InsertionSort(int n[],int i){
        if(i==n.length){
            return;
        }
        int curr = n[i];
        int prev = i-1;
        if(prev>=0 && n[prev]>curr){
            int temp = n[prev+1];
            n[prev+1] = n[prev];
            n[prev]=temp;
            InsertionSort(n,i-1);
            return;
        }
        InsertionSort(n,i+1);
    }
    

    public static void main(String args[]){
        int n[] = {8,3,5,4,7,1,2};
        int m = n.length;
        InsertionSort(n,1);
        for(int i = 0; i<m;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    
}
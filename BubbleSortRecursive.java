public class BubbleSortRecursive {
    public static void bubble(int arr[],int n,int i,int j){
        if(j >= n-1){
            return; 
        }
        if(i < n-1-j){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            bubble(arr,n,i+1,j);
        }
        
        bubble(arr,n,0,j+1);
        
        
    }
    public static void main(String args[]){
        int n[] = {20,1,-20,7,5,17,70};
        int m = n.length;
        bubble(n,m,0,0);
        for(int i = 0; i<m;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
}
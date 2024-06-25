public class SubArrays {
    public static void subArr(int n[]){
         for(int i = 0;i<n.length;i++){
            for(int j = i;j<n.length;j++){
                for(int k = i;k<=j;k++){
                    System.out.print(n[k]+" ");
                 }
                 System.out.println();
            }
            System.out.println();
         }
       System.out.println();
    }
       
    
    public static void main(String args[]){
        int arr[] = {3,4,5,8,9,};
        subArr(arr);
    }
}
public class recursiveSearch {
    public static int search(int arr[], int key,int i){
        if(i==arr.length){
            return-1;
        }
        if(arr[i]==key){
            return i;
        }
        return search(arr,key,++i);
    }
     
    public static void main(String args []){
        int arr[] = {-9,19,8,7,-2,5,6,3,9};
        int key = 6;
        int start = 0;
        int res = search(arr,key,start);
        System.out.println(res);
    }
}
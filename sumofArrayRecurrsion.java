public class sumofArrayRecurrsion {
    public static int sum(int arr[],int i){
        int add = 0;
        if(i==arr.length){
            return add;
        }
        add = arr[i] + sum(arr,++i);
        return add;
    }
    

    public static void main(String args[]){
        int arr[] = {19,8,7,-2,5,6,3,9};
        int res = sum(arr,0);
        System.out.println(res);
    }
}
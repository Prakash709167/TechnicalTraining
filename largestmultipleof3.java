public class largestmultipleof3 {
    static int large = 3;
    static int indx = 0;
    public static int Check(int arr[],int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]%3==0){
            if(arr[i]>=large){
                large = arr[i];
                indx = i;
            }
        }
        Check(arr,i+1);
        return indx;
    }
    public static void main(String args []){
        int arr[] = {18,20,5,24,6,9,27};
        int res = Check(arr ,0);
        System.out.println(res);

    }
}
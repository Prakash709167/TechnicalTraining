public class Multipleof3and5 {
    static int largestmultiple = 0;
    static int indx = 0; 
    public static int Check(int arr[],int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]%3==0 && arr[i]%5==0){
            if(arr[i]>=largestmultiple){
                largestmultiple = arr[i];
                indx = i;
            }
            
        }
        Check(arr,i+1);
        return indx;
    }

    public static void main(String args[]){
        int arr[] = {18,20,15,24,60,30,27};
        int res = Check(arr ,0);
        System.out.println(res);
    }
}
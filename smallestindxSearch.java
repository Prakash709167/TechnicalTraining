public class smallestindxSearch {
    static int smallest = Integer.MAX_VALUE;
    static int smallindx;
    static int largest = Integer.MIN_VALUE;
    static int largeindx;
    public static int searchsmall(int arr[],int i){
        if(i==arr.length){
            return-1;
        }
        if(arr[i]<=smallest){
            smallest =arr[i];
            smallindx = i;
        }
        searchsmall(arr,i+1);
        return smallindx;
    }
    public static int searchlarge(int arr[],int i){
        if(i==arr.length){
            return-1;
        }
        if(arr[i]>=largest){
            largest =arr[i];
            largeindx = i;
        }
        searchlarge(arr,i+1);
        return largeindx;
    }
    public static void main(String args[]){
        int arr[] = {-9,19,8,7,-2,5,6,-33,99};
        int start = 0;
        int smallestval = searchsmall(arr,start);
        System.out.println(smallestval);
        int largestval = searchlarge(arr,start);
        System.out.println(largestval);
    }
}
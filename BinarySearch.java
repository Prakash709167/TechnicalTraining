public class BinarySearch {
    public static int searching(int n[],int key,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if(n[mid]==key){
            return mid;
        }
        else if(n[mid]>key){
           return searching(n,key,start,mid-1);
        }
        else{
            return searching(n,key,mid+1,end);
        }

    }
    
    public static void main(String args[]){
        int n[] = {4,6,8,10,12,20};
        int key = 2;
        System.out.println(searching(n,key,0,n.length-1));
    }
}
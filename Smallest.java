public class Smallest {
    public static int smallest(int n[]){
        int small = Integer.MAX_VALUE;
        int index =0;
        for(int i=0;i<n.length;i++){
            if(n[i]<small){
                index = i;
            }
        }
        return index;
    }
    public static int largest(int n[]){
        int large = Integer.MIN_VALUE;
        int index =0;
        for(int j=0;j<n.length;j++){
            if(n[j]>large){
                large = n[j];
                index=j;
            }
        }
        return index;
    }

    public static void sort(int n[], int sidx){
        int smcount =0;
        for(int i = sidx-1;i>=1;i--){
            int temp = n[i];
            n[i]=n[i-1];
            n[i-1]=temp;
            smcount++;
        }
        int lidx = largest(n);
        int lcount =0;
        for(int i = lidx;i<n.length-1;i++){
            int temp = n[i];
            n[i]=n[i+1];
            n[i+1]=temp;
            lcount++;
        }
        for(int i = 0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
        System.out.println("total swap for smallest : " +smcount);
        System.out.println("total largest swap : "+ lcount);
    }

    public static void main(String args []){
        int arr[] = {7, 1, -7, -17, 70, 190, 17, 102, -250, 25};
        int ans = smallest(arr);
        System.out.println("The smallest number is " + arr[ans-1] + " at index "+ ans);
        int big = largest(arr);
        int index = big+1;
        System.out.println("the lagest number is "+arr[big]+ " at index "+ index);
        sort(arr,ans);


    }
}
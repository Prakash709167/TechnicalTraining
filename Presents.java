import java.util.*;
public class Presents {
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = in.nextInt();
        int arr[] = new int[n+1];
        // System.out.println(arr.length);
        System.out.println("Enter the element of array: ");
        for(int i =1; i<=n;i++){
            int temp = in.nextInt();
            arr[temp] = i;
        }
        for(int i =1;i<=n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
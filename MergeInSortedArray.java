public class MergeInSortedArray {
    public static void merge(int n1[],int n2[]){
        int n =n2.length;
        int m = n1.length;
        int i=m-n-1;
        int j=n2.length-1,k=n1.length-1;    
        while(i>=0 && j>=0){
            if(n1[i]>n2[j]){
                n1[k]=n1[i];
                k--;
                i--;
            }
            else{
                n1[k]=n2[j];
                k--;
                j--;
            }
        }
        while(i>0){
            n1[k]=n1[i];
            k--;
            i--;
        }
        while(j>0){
            n1[k]=n2[j];
            j--;
            k--;
        }
        for(int l=0; l<n1.length; l++){
            System.out.print(n1[l]+ " ");
        }
        System.out.println();




        // int size = n1.length+n2.length;
        // int ans[]=new int[size];
        // int i=0,j=0,k=0;
        // while(i<n1.length && j<n2.length){
        //     if(n1[i]<n2[j]){
        //         ans[k]=n1[i];
        //         k++;
        //         i++;
        //     }
        //     else{
        //         ans[k]=n2[j];
        //         k++;
        //         j++;
        //     }
        // }
        // while(i<n1.length){
        //     ans[k++]=n1[i++];
        // }
        // while(j<n2.length){
        //     ans[k++]=n2[j++];
        // }
        // for(int l=0; l<size; l++){
        //     System.out.print(ans[l]+ " ");
        // }
        // System.out.println();
    }
    public static void main(String args[]){
        int arr1[] = new int[9];
        arr1[0] = 1;
        arr1[1] = 3;
        arr1[2] = 5;
        arr1[3] = 7;
        arr1[4] = 9;
        int arr2[] = {2,4,6,8};
        merge(arr1,arr2);

    }

}
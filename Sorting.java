public class Sorting {
    public static void sort(int n[]){
        int swap=0;
        for(int i = 0; i<n.length-1;i++){
            for(int j = 0;j<n.length-1-i;j++){
                //Swapping
                if(n[j]>n[j+1]){
                    int temp = n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                    swap++;
                }
            }
        }
        for(int i = 0; i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
        System.out.println("total number of swapping is "+swap);
    }
    public static void main(String args[]){
        int n[]={7, 1, -7, -17, 70, 190 ,17, 102, -250, 25};
        sort(n);
    }
}
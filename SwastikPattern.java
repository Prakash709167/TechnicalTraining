public class SwastikPattern {
    public static void Pattern(int n){
        for(int i = 0; i< n;i++){
            for(int j = 0; j<n;j++){
                if(i==n/2||j==n/2){
                    System.out.print("*");
                }
                else if(i<n/2&&j==0 || i>n/2&&j==n-1){
                    System.out.print("*");
                }
                else if(i==0&&j>n/2 || i==n-1&&j<n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n =7;
        Pattern(n);

    }
}
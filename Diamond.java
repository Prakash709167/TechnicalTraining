public class Diamond {
    public static void pattern(int n){
        for(int row = 1; row <= n; row++){
            int a = 1;
            for(int space = 0; space<=(n-row); space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= ((2*row)-1); col++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
        for(int row = n-1; row >= 1; row--){
            int a = 1;
            for(int space = 0; space<=(n-row); space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= ((2*row)-1); col++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        int line =4;
        pattern(line);
    }
}
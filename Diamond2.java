public class Diamond2 {
    public static void pattern(int n){
        for(int row = 1; row <= n; row++){
            for(int space = 0; space<=(n-row); space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            for(int col = row-1; col >= 1; col--){
                System.out.print(col);
            }
            System.out.println();
        }
        for(int row = n-1; row >= 1; row--){
            for(int space = 0; space<=(n-row); space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            for(int col = row-1; col >= 1; col--){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        int line =4;
        pattern(line);
    }
}
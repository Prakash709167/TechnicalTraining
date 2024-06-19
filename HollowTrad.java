public class HollowTrad {
    public static void pt(int n){
        for(int i = 1; i <= n; i++){
            for(int space = 0; space <= i-1; space++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*(n-i)+1; j++){
                if(i == 1 || j == 1 || j == 2*(n-i)+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for(int i = n-1; i>=1; i--){
            for(int space = 0; space <= i-1; space++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*(n-i)+1; j++){
                 System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pt(4);
    }
}
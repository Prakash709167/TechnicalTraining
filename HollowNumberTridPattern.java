public class HollowNumberTridPattern {
    public static void Pattern(int n){
        for(int i = 1; i<=n ;i++){
            for(int j = 1; j<=2*(n-i);j++){
                System.out.print(" ");                
            }
            for(int k = 1;k<=i;k++){
                System.out.print(k);
            }
            for(int l = 1;l<=(2*(i-1)-1);l++){
                System.out.print(" ");                
            }
            for(int m = i; m>=1;m--){
                if(i==1){continue;}
                System.out.print(m);
            }
            System.out.println();
        }
        for(int i = n-1;i>=1;i--){
            for(int j = 1; j<=2*(n-i);j++){
                System.out.print(" ");                
            }
            for(int k = 1;k<=i;k++){
                System.out.print(k);
            }
            for(int l = 1;l<=(2*(i-1)-1);l++){
                System.out.print(" ");                
            }
            for(int m = i; m>=1;m--){
                if(i==1){continue;}
                System.out.print(m);
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int n = 4;
        Pattern(n);

    }
}
public class Tribonacci {
    public static int tribo(int n){
        if(n==0||n==1||n==2){
            return 0;
        }if(n==3){
            return 1;
        }
        else{
            return tribo(n-1)+tribo(n-2)+tribo(n-3);
        }
        
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(tribo(n));
    }
}
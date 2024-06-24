public class Fibonacci {
    public static int fibo(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fnm1 = fibo(n-1);
        int fnm2 = fibo(n-2);
        return fnm1+fnm2;
    }
    public static void main(String args[]){
        int n = 8;
        System.out.println(fibo(n));
    }
}
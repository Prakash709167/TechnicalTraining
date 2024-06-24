public class NStairs {
    public static int NoWays(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return NoWays(n-1)+NoWays(n-2);
    }
    
    public static void main(String args[]){
        int n = 9;
        System.out.println(NoWays(n));
    }
}
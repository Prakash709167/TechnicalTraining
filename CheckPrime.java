public class CheckPrime {
    
    public static boolean isPrime(int n,int i){
        if(i==n-1){
            return true;
        }
        if(n%i==0){
            return false;
        }
        isPrime(n,i+1);
        return true;
    }
    

    public static void main(String args[]){
        int n = 127;
        int i = 2;
        System.out.println(isPrime(n,i));
    }
}
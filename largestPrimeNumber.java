public class largestPrimeNumber {
    static int largestPrimeNumber = 0;
    static int indx;
    public static boolean isPrime(int n,int j){
        if(j == n-1){
            return true;
        }
        if(n%j == 0){
            return false;
        }
        isPrime(n,++j);
        return true;
    }
    public static int primecheck(int n[],int i){
        if(i==n.length){
            return -1;
        }
        if(isPrime(n[i],2)){
            if(n[i]>=largestPrimeNumber){
                largestPrimeNumber=n[i];
                indx=i;
            }
        }
        primecheck(n,i+1);
        return indx;
    }
    
    public static void main(String args[]){
        int prime[] = {8,10,17,23,7,5,24,69,72,94};
        int res = primecheck(prime,0);
        System.out.println(res);
    }
}
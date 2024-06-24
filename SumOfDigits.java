public class SumOfDigits {
    static int sum = 0;
    public static int digitsum(int n){
        if(n==0){
            return -1;
        }
        int rem = n%10;
        sum = sum+rem;
        n=n/10;
        digitsum(n);
        return sum;
    }
    

    public static void main(String args[]){
        int n = 128;
        System.out.println(digitsum(n));
    }
}
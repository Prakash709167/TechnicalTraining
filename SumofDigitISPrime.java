import java.util.*;
public class SumofDigitISPrime {
    public static boolean isPrime(int sum){
        for(int i = 2; i<sum/2;i++){
            if(sum%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = in.nextInt();
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum += rem;
            n=n/10;
        }
        if(isPrime(sum)){
            System.out.println("Sum of Digits is Prime Number");
        }
        else{
            System.out.println("Sum of digits is not a Prime Number");
        }
    }
}
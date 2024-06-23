public class printReverseNumber {
    public static void reverse(int a,int b){
        if(a<b){
            return;
        }
        System.out.println(a);
        reverse(a-1,b);
    }
    
    public static void main(String args[]){
        reverse(5,1);
    }
}
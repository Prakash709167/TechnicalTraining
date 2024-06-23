public class Multipleof3 {
    static int count = 0;
    public static void multiple(int n,int m){
        if(count ==m){
            return;
        }
        count++;
        System.out.println(n*count);
        multiple(n,m);
    }     
    public static void main(String args[]){
        multiple(5,8);
    }
}
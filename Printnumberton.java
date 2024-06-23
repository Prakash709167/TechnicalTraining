public class Printnumberton {
     public static void printing(int a,int b){
        if(a>b){
            return;
        }
        System.out.println(a);
        printing(a+1,b);
     }
    public static void main(String args[]){
        printing(1,5);

    }
}